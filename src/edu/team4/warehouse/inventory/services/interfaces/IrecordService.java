package edu.team4.warehouse.inventory.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbinventoryrecord;


public interface IrecordService {
	public List<Tbinventoryrecord> list(Tbinventoryrecord record);
	public String add(Tbinventoryrecord record);
	public Tbinventoryrecord detail(Tbinventoryrecord record);
	public String modify(Tbinventoryrecord record);
}
