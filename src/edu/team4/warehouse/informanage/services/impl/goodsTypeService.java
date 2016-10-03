package edu.team4.warehouse.informanage.services.impl;

import java.util.List;

import edu.team4.warehouse.informanage.dao.interfaces.IGoodsTypeDao;
import edu.team4.warehouse.informanage.services.interfaces.IGoodsTypeService;
import edu.team4.warehouse.model.Tbgoodstype;

public class goodsTypeService implements IGoodsTypeService {
 private IGoodsTypeDao dao ;

public IGoodsTypeDao getDao() {
	return dao;
}

public void setDao(IGoodsTypeDao dao) {
	this.dao = dao;
}

public String add(Tbgoodstype tbgoodsType) {
	
	return dao.add(tbgoodsType);
}

public Tbgoodstype detail(Tbgoodstype tbgoodsType) {
	
	return dao.detail(tbgoodsType);
}

public List<Tbgoodstype> list(Tbgoodstype tbgoodsType,String zhonglei) {
	
	return dao.list(tbgoodsType,zhonglei);
}

public String modify(Tbgoodstype tbgoodsType) {
	
	return dao.modify(tbgoodsType);
}
	

}
