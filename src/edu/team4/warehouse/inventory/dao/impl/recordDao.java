package edu.team4.warehouse.inventory.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.org.apache.bcel.internal.generic.NEW;

import edu.team4.warehouse.inventory.dao.interfaces.IrecordDao;
import edu.team4.warehouse.model.Tbinventoryrecord;

public class recordDao extends HibernateDaoSupport implements IrecordDao {

	public List<Tbinventoryrecord> list(Tbinventoryrecord record) {
		StringBuilder sb=new StringBuilder("from Tbinventoryrecord r");
		/*if(record.getIdNo()!=null && !record.getIdNo().equals("")){
			sb.append(" where r.idNo like ?");
			return this.getHibernateTemplate().find(sb.toString(),record.getIdNo()+"%");
		}
		else{
			return this.getHibernateTemplate().find(sb.toString());
		}*/
		if(record.getIdNo()==null || record.getIdNo().equals("")){
			return this.getHibernateTemplate().find(sb.toString());
		}
		else if(record.getIdDate()==null || record.getIdDate().toString().equals("")){
			sb.append(" where r.idNo like ?");
			return this.getHibernateTemplate().find(sb.toString(),record.getIdNo()+"%");
		}
		else{
			sb.append(" where r.idNo like ? and r.idDate like ?");
			return this.getHibernateTemplate().find(sb.toString(), record.getIdNo()+"%",record.getIdDate());
		}
	}
	
	public String add(Tbinventoryrecord record) {
		this.getHibernateTemplate().save(record);
		return "list";
	}

	public Tbinventoryrecord detail(Tbinventoryrecord record) {
		record=this.getHibernateTemplate().get(Tbinventoryrecord.class, record.getIdId());
		return record;
	}


	public String modify(Tbinventoryrecord record) {
		this.getHibernateTemplate().update(record);
		return "list";
	}

	
}
