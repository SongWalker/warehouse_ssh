package edu.team4.warehouse.informanage.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbgoodsinfo;

public interface IGoodsService {
	public List<Tbgoodsinfo> list(Tbgoodsinfo tbgoods,String chaxun);
    public String add(Tbgoodsinfo tbgoods);
    public Tbgoodsinfo detail(Tbgoodsinfo tbgoods);
    public String modify(Tbgoodsinfo tbgoods);

}
