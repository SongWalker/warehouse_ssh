package edu.team4.warehouse.informanage.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.team4.warehouse.informanage.dao.interfaces.IClientDao;
import edu.team4.warehouse.model.Tbclient;

public class clientDao extends HibernateDaoSupport implements IClientDao {

	public String add(Tbclient tbc) {
		this.getHibernateTemplate().save(tbc);
		return "list";
	}

	public Tbclient detail(Tbclient tbc) {
		tbc=this.getHibernateTemplate().get(Tbclient.class, tbc.getCId());
		return tbc;
	}

	public List<Tbclient> list(Tbclient tbc,String kehu) {
		StringBuilder sb= new StringBuilder("from Tbclient r ");
		if(StringUtils.isNotBlank(kehu)){
			sb.append(" where r.CName like '%").append(kehu).append("%'");
			try{
				int cid = Integer.parseInt(kehu);
				sb.append(" or r.CId=").append(cid);
			}catch (Exception e) {
				
			}
			
		}
		return this.getHibernateTemplate().find(sb.toString());
	}

	public String modify(Tbclient tbc) {
		this.getHibernateTemplate().update(tbc);
		return "list";
	}

}
