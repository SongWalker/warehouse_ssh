package edu.team4.warehouse.informanage.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbsupplier;

public interface IGoodsService {
	public List<Tbgoodsinfo> list(Tbgoodsinfo tbgoods);
    public String add(Tbgoodsinfo tbgoods);
    public Tbgoodsinfo detail(Tbgoodsinfo tbgoods);
    public String modify(Tbgoodsinfo tbgoods);
	public List<Tbsupplier> slist(Tbsupplier s);

}
