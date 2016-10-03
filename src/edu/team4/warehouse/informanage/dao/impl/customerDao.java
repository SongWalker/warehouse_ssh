package edu.team4.warehouse.informanage.dao.impl;

import java.util.List;

import javax.xml.registry.infomodel.User;


import org.apache.commons.lang.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.team4.warehouse.informanage.dao.interfaces.ICustomerDao;
import edu.team4.warehouse.model.Tbuser;

public class customerDao extends HibernateDaoSupport implements ICustomerDao {

	public List<Tbuser> list(Tbuser user,String yonghu) {
		StringBuilder sb= new StringBuilder("from Tbuser r ");
		if(StringUtils.isNotBlank(yonghu)){
			sb.append(" where r.UName like '%").append(yonghu).append("%'");
			sb.append(" or r.UUid like '%").append(yonghu).append("%'");	
		}
		return this.getHibernateTemplate().find(sb.toString());
	}

	public String add(Tbuser user) {
		this.getHibernateTemplate().save(user);
		return "list";
	}

	public Tbuser detail(Tbuser user) {
		user = this.getHibernateTemplate().get(Tbuser.class, user.getUId());
		return user; 
	}

	public String modify(Tbuser user) {
		this.getHibernateTemplate().update(user);
		return "list";
	}

}
