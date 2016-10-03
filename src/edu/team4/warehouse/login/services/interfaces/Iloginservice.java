package edu.team4.warehouse.login.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbuser;

public interface Iloginservice {
	public List<Tbuser> CheckUId(Tbuser user);
}
