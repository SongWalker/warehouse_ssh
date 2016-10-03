package edu.team4.warehouse.login.dao.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbuser;

public interface Ilogindao {
 
	public List<Tbuser> CheckUId(Tbuser user);
	 
}
