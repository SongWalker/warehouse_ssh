package edu.team4.warehouse.informanage.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbsupplier;

public interface ISupplierService {
	public List<Tbsupplier> list(Tbsupplier tbsup,String gys);
    public String add(Tbsupplier tbsup);
    public Tbsupplier detail(Tbsupplier tbsup);
    public String modify(Tbsupplier tbsup);
}
