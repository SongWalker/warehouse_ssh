package edu.team4.warehouse.inventory.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbinventoryrecord;
import edu.team4.warehouse.model.Tbstoredetail;


public interface IrecordService {
	public List<Tbinventoryrecord> list(Tbinventoryrecord record);
	public String add(Tbinventoryrecord record);
	public Tbinventoryrecord detail(Tbinventoryrecord record);
	public String modify(Tbinventoryrecord record);
	public void addrecord(Tbinventoryrecord record,Tbstoredetail sd);
}
