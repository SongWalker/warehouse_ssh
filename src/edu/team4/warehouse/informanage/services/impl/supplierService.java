package edu.team4.warehouse.informanage.services.impl;

import java.util.List;

import edu.team4.warehouse.informanage.dao.interfaces.ISupplierDao;
import edu.team4.warehouse.informanage.services.interfaces.ISupplierService;
import edu.team4.warehouse.model.Tbsupplier;

public class supplierService implements ISupplierService {
private ISupplierDao dao;

	public ISupplierDao getDao() {
	return dao;
}

public void setDao(ISupplierDao dao) {
	this.dao = dao;
}

	public String add(Tbsupplier tbsup) {
		
		return dao.add(tbsup);
	}

	public Tbsupplier detail(Tbsupplier tbsup) {
		
		return dao.detail(tbsup);
	}

	public List<Tbsupplier> list(Tbsupplier tbsup,String gys) {
		
		return dao.list(tbsup,gys);
	}

	public String modify(Tbsupplier tbsup) {
		
		return dao.modify(tbsup);
	}

}
