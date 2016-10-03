package edu.team4.warehouse.inventory.dao.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbinventoryrecord;

public interface IrecordDao {
	public List<Tbinventoryrecord> list(Tbinventoryrecord record);
	public String add(Tbinventoryrecord record);
	public Tbinventoryrecord detail(Tbinventoryrecord record);
	public String modify(Tbinventoryrecord record);

}
