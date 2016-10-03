package edu.team4.warehouse.inventory.dao.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbinventory;

public interface IinventoryDao {
	public List<Tbinventory> list(Tbinventory inventory);
	public String add(Tbinventory inventory);
	public Tbinventory detail(Tbinventory inventory);
	public String modify(Tbinventory inventory);
}
