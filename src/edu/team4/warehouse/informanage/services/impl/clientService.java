package edu.team4.warehouse.informanage.services.impl;

import java.util.List;

import edu.team4.warehouse.informanage.dao.interfaces.IClientDao;
import edu.team4.warehouse.informanage.services.interfaces.IClientService;
import edu.team4.warehouse.model.Tbclient;

public class clientService implements IClientService {
private IClientDao dao;

	public IClientDao getDao() {
	return dao;
}

public void setDao(IClientDao dao) {
	this.dao = dao;
}

	public String add(Tbclient tbc) {
		return dao.add(tbc);
	}

	public Tbclient detail(Tbclient tbc) {
		
		return dao.detail(tbc);
	}

	public List<Tbclient> list(Tbclient tbc,String kehu) {
		
		return dao.list(tbc,kehu);
	}

	public String modify(Tbclient tbc) {
		
		return dao.modify(tbc);
	}

}
