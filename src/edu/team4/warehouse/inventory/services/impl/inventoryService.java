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
 * 查询库存信息
 */
	public List<Tbinventory> list(Tbinventory inventory) {
		return dao.list(inventory);
	}

/**
 * 添加库存信息
 */
public String add(Tbinventory inventory) {
	return dao.add(inventory);
}


/**
 * 读取库存信息条目
 */
public Tbinventory detail(Tbinventory inventory) {
	return dao.detail(inventory);
}

/**
 * 修改库存信息条目
 */
public String modify(Tbinventory inventory) {
	return dao.modify(inventory);
}

}
