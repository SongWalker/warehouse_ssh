package edu.team4.warehouse.inventory.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.team4.warehouse.inventory.dao.interfaces.IinventoryDao;
import edu.team4.warehouse.model.Tbinventory;

public class inventoryDao extends HibernateDaoSupport implements IinventoryDao {

	/**
	 * 模糊查询，返回相同前缀的查询结果
	 */
	public List<Tbinventory> list(Tbinventory inventory) {
		StringBuilder sb= new StringBuilder("from Tbinventory i");
		
		/*if(inventory.getIGname()!=null && !inventory.getIGname().equals(""))
		{
			sb.append(" where i.IGname like ? and i.IOrigin like ?");
			//return this.getHibernateTemplate().find(sb.toString(), inventory.getIGname()+"%");
			return this.getHibernateTemplate().find(sb.toString(), new String[]{inventory.getIGname()+"%",inventory.getIOrigin()+"%"});
		}*/
		if(inventory.getIGname()!=null && !inventory.getIGname().equals(""))
		{
			sb.append(" where i.IGname like ?");
			return this.getHibernateTemplate().find(sb.toString(), inventory.getIGname()+"%");
			//return this.getHibernateTemplate().find(sb.toString(), new String[]{inventory.getIGname()+"%",inventory.getIOrigin()+"%"});
		}
		else{
			//sb.append(" where i.IOrigin like ?");
			return this.getHibernateTemplate().find(sb.toString());	
		}
		
	}

	/**
	 * 添加
	 */
	public String add(Tbinventory inventory) {
		this.getHibernateTemplate().save(inventory);
		return "list";
	}

	/**
	 * 取出特定一组数据到一个对象并返回
	 */
	public Tbinventory detail(Tbinventory inventory) {
		inventory = this.getHibernateTemplate().get(Tbinventory.class, inventory.getIId());
		return inventory;
	}

	/**
	 * 修改
	 */
	public String modify(Tbinventory inventory) {
		this.getHibernateTemplate().update(inventory);
		return "list";
	}

	
	
}
