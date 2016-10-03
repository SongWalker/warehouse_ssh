package edu.team4.warehouse.informanage.dao.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbgoodstype;

public interface IGoodsTypeDao {
	public List<Tbgoodstype> list(Tbgoodstype tbgoodsType,String zhonglei);
    public String add(Tbgoodstype tbgoodsType);
    public Tbgoodstype detail(Tbgoodstype tbgoodsType);
    public String modify(Tbgoodstype tbgoodsType);
}
