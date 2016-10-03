package edu.team4.warehouse.informanage.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbuser;


public interface ICustomerService {
	public List<Tbuser> list(Tbuser user,String yonghu);
    public String add(Tbuser user);
    public Tbuser detail(Tbuser user);
    public String modify(Tbuser user);
}
