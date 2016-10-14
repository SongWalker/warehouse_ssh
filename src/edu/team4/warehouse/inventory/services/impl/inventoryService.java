package edu.team4.warehouse.inventory.services.impl;

import java.util.List;

import edu.team4.warehouse.inventory.dao.interfaces.IinventoryDao;
import edu.team4.warehouse.inventory.services.interfaces.IinventoryService;
import edu.team4.warehouse.model.Tbinventory;

public class inventoryService implements IinventoryService {
	private IinventoryDao dao;

	public IinventoryDao getDao() {
		return dao;
	}


	public void setDao(IinventoryDao dao) {
		this.dao = dao;
	}

/**
 * ��ѯ�����Ϣ
 */
	public List<Tbinventory> list(Tbinventory inventory) {
		return dao.list(inventory);
	}

/**
 * ��ӿ����Ϣ
 */
public String add(Tbinventory inventory) {
	return dao.add(inventory);
}


/**
 * ��ȡ�����Ϣ��Ŀ
 */
public Tbinventory detail(Tbinventory inventory) {
	return dao.detail(inventory);
}

/**
 * �޸Ŀ����Ϣ��Ŀ
 */
public String modify(Tbinventory inventory) {
	return dao.modify(inventory);
}

}
