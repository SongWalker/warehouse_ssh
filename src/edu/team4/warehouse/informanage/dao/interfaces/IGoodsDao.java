package edu.team4.warehouse.informanage.dao.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbinventoryrecord;
import edu.team4.warehouse.model.Tbsupplier;

public interface IGoodsDao {
		public List<Tbgoodsinfo> list(Tbgoodsinfo tbgoods);
	    public String add(Tbgoodsinfo tbgoods);
	    public Tbgoodsinfo detail(Tbgoodsinfo tbgoods);
	    public String modify(Tbgoodsinfo tbgoods);
		public List<Tbgoodsinfo> getDetailByGno(String sdNo);
		public List<Tbsupplier> slist(Tbsupplier s);
}
