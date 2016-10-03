package edu.team4.warehouse.informanage.services.impl;
import java.util.List;

import org.springframework.dao.support.DaoSupport;

import edu.team4.warehouse.informanage.dao.interfaces.IGoodsDao;
import edu.team4.warehouse.informanage.services.interfaces.IGoodsService;
import edu.team4.warehouse.model.Tbgoodsinfo;

public class goodsService implements IGoodsService {
private IGoodsDao dao;

	public IGoodsDao getDao() {
	return dao;
}

public void setDao(IGoodsDao dao) {
	this.dao = dao;
}

	public String add(Tbgoodsinfo tbgoods) {
		
		return dao.add(tbgoods);
	}

	public Tbgoodsinfo detail(Tbgoodsinfo tbgoods) {
		
		return dao.detail(tbgoods);
	}

	public List<Tbgoodsinfo> list(Tbgoodsinfo tbgoods,String chaxun) {
		
		return dao.list(tbgoods,chaxun) ;
	}

	public String modify(Tbgoodsinfo tbgoods) {
		
		return dao.modify(tbgoods);
	}

}
