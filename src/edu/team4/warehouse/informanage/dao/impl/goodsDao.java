package edu.team4.warehouse.informanage.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.org.apache.bcel.internal.generic.Select;

import edu.team4.warehouse.informanage.dao.interfaces.IGoodsDao;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbuser;

public class goodsDao extends HibernateDaoSupport implements IGoodsDao {

	public String add(Tbgoodsinfo tbgoods) {

		this.getHibernateTemplate().save(tbgoods);
		return "list";
	}

	public Tbgoodsinfo detail(Tbgoodsinfo tbgoods) {
		tbgoods = this.getHibernateTemplate().get(Tbgoodsinfo.class, tbgoods.getGId());
		return tbgoods; 
	}

	public List<Tbgoodsinfo> list(Tbgoodsinfo tbgoods,String chaxun) {
		StringBuilder sb= new StringBuilder("from Tbgoodsinfo r ");
		if(StringUtils.isNotBlank(chaxun)){
			sb.append(" where r.GName like '%").append(chaxun).append("%'");
			sb.append(" or r.GStandard like '%").append(chaxun).append("%'");
			try{
				int gid = Integer.parseInt(chaxun);
				sb.append(" or r.GId=").append(gid);
			}catch (Exception e) {
				
			}
			
		}
		return this.getHibernateTemplate().find(sb.toString());
	}

	public String modify(Tbgoodsinfo tbgoods) {
		this.getHibernateTemplate().update(tbgoods);
		return "list";
	}

}
