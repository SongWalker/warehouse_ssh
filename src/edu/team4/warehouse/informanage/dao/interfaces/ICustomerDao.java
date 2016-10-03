package edu.team4.warehouse.informanage.dao.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbuser;


public interface ICustomerDao {
	public List<Tbuser> list(Tbuser user,String yonghu);
    public String add(Tbuser user);
    public Tbuser detail(Tbuser user);
    public String modify(Tbuser user);
}
