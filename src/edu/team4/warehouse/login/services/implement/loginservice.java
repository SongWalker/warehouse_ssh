package edu.team4.warehouse.login.services.implement;

import java.util.List;

import edu.team4.warehouse.login.dao.interfaces.Ilogindao;
import edu.team4.warehouse.login.services.interfaces.Iloginservice;
import edu.team4.warehouse.model.Tbuser;

public class loginservice implements Iloginservice{
	private Ilogindao dao;
	public Ilogindao getDao() {
		return dao;
	}

	public void setDao(Ilogindao dao) {
		this.dao = dao;
	}

	public List<Tbuser> CheckUId(Tbuser user){
	   return   dao.CheckUId(user); 
	  }
}
