package edu.team4.warehouse.informanage.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbclient;

public interface IClientService {
	 public List<Tbclient> list(Tbclient tbc,String kehu);
     public String add(Tbclient tbc);
     public Tbclient detail(Tbclient tbc);
     public String modify(Tbclient tbc);
}
