package edu.team4.warehouse.inventory.services.impl;

import java.util.List;

import edu.team4.warehouse.inventory.dao.interfaces.IrecordDao;
import edu.team4.warehouse.inventory.services.interfaces.IrecordService;
import edu.team4.warehouse.model.Tbinventoryrecord;

public class recordService implements IrecordService {
	private IrecordDao dao;

	public IrecordDao getDao() {
		return dao;
	}

	public void setDao(IrecordDao dao) {
		this.dao = dao;
	}
	
	public List<Tbinventoryrecord> list(Tbinventoryrecord record){
		return dao.list(record);
	}

	public String add(Tbinventoryrecord record) {
		return dao.add(record);
	}

	public Tbinventoryrecord detail(Tbinventoryrecord record) {
		return dao.detail(record);
	}

	public String modify(Tbinventoryrecord record) {
	    return dao.modify(record);
	}

}
