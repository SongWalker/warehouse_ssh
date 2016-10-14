package edu.team4.warehouse.informanage.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.org.apache.bcel.internal.generic.Select;

import edu.team4.warehouse.informanage.dao.interfaces.IGoodsDao;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbsupplier;
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
	
	public List<Tbgoodsinfo> getDetailByGno(String GNo){
		return this.getHibernateTemplate().find("from Tbgoodsinfo r where r.GNo = ?", GNo);
	}

	public List<Tbgoodsinfo> list(Tbgoodsinfo tbgoods) {
		StringBuilder sb= new StringBuilder("from Tbgoodsinfo r ");
		if(tbgoods.getGName()!=null&&!tbgoods.getGName().equals("")){
			sb.append("where r.GName like ?");
			return this.getHibernateTemplate().find(sb.toString(), tbgoods.getGName()+"%");
		}
		return this.getHibernateTemplate().find(sb.toString());
	}

	public String modify(Tbgoodsinfo tbgoods) {
		this.getHibernateTemplate().update(tbgoods);
		return "list";
	}
    
	/**
	 * 查询供应商
	 */
	public List<Tbsupplier> slist(Tbsupplier s) {
		StringBuilder sb= new StringBuilder(" from Tbsupplier s ");
			return this.getHibernateTemplate().find(sb.toString());	
	}

}
