package edu.team4.warehouse.informanage.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.team4.warehouse.informanage.dao.interfaces.IGoodsTypeDao;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbgoodstype;

public class goodsTypeDao extends HibernateDaoSupport implements IGoodsTypeDao {

	public List<Tbgoodstype> list(Tbgoodstype tbgoodsType,String zhonglei) {
		StringBuilder sb= new StringBuilder("from Tbgoodstype r ");
		if(StringUtils.isNotBlank(zhonglei)){
			sb.append(" where r.gtName like '%").append(zhonglei).append("%'");
			try{
				int gtid = Integer.parseInt(zhonglei);
				sb.append(" or r.gtId=").append(gtid);
			}catch (Exception e) {
				
			}
			
		}
		return this.getHibernateTemplate().find(sb.toString());
	}
	
	
	public String add(Tbgoodstype tbgoodsType) {

		this.getHibernateTemplate().save(tbgoodsType);
		return "list";
	}

	public Tbgoodstype detail(Tbgoodstype tbgoodsType) {
		tbgoodsType = this.getHibernateTemplate().get(Tbgoodstype.class, tbgoodsType.getGtId());
		return tbgoodsType; 
	}

	public String modify(Tbgoodstype tbgoodsType) {
		this.getHibernateTemplate().update(tbgoodsType);
		return "list";
	}

}
