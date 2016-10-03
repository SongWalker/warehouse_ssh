package edu.team4.warehouse.informanage.services.impl;

import java.util.List;

import edu.team4.warehouse.informanage.dao.interfaces.ICustomerDao;
import edu.team4.warehouse.informanage.services.interfaces.ICustomerService;
import edu.team4.warehouse.model.Tbuser;

public class customerService implements ICustomerService {
private ICustomerDao dao;
    
	public ICustomerDao getDao() {
		return dao;
	}

	public void setDao(ICustomerDao dao) {
		this.dao = dao;
	}
/**
 * 查询用户列表
 */
	public List<Tbuser> list(Tbuser user,String yonghu) {
		return dao.list(user,yonghu);
	}

	public String add(Tbuser user) {
		return dao.add(user);
	}

	public Tbuser detail(Tbuser user) {
		return dao.detail(user);
	}

	public String modify(Tbuser user) {
		return dao.modify(user);
	}


}
