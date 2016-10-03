package edu.team4.warehouse.informanage.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.team4.warehouse.informanage.dao.interfaces.ISupplierDao;
import edu.team4.warehouse.model.Tbsupplier;

public class supplierDao extends HibernateDaoSupport implements ISupplierDao {

	public String add(Tbsupplier tbsup) {
		this.getHibernateTemplate().save(tbsup);
		return "list";
	}

	public Tbsupplier detail(Tbsupplier tbsup) {
	    tbsup=this.getHibernateTemplate().get(Tbsupplier.class, tbsup.getSId());
		return tbsup;
	}

	public List<Tbsupplier> list(Tbsupplier tbsup,String gys) {
		StringBuilder sb= new StringBuilder("from Tbsupplier r ");
		if(StringUtils.isNotBlank(gys)){
			sb.append(" where r.SName like '%").append(gys).append("%'");
			try{
				int sid = Integer.parseInt(gys);
				sb.append(" or r.SId=").append(sid);
			}catch (Exception e) {
				
			}
			
		}
		return this.getHibernateTemplate().find(sb.toString());
	}

	public String modify(Tbsupplier tbsup) {
		this.getHibernateTemplate().update(tbsup);
		return "list";
	}

}
