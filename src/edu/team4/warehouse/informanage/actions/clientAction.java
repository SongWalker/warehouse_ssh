package edu.team4.warehouse.informanage.actions;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import edu.team4.warehouse.informanage.services.interfaces.IClientService;
import edu.team4.warehouse.model.Tbclient;


public class clientAction extends ActionSupport{
  Tbclient tbc=new Tbclient();
  List<Tbclient>list;
  IClientService service;
  public String kehu;
  
  
  
public Tbclient getTbc() {
	return tbc;
}
public void setTbc(Tbclient tbc) {
	this.tbc = tbc;
}
public String getKehu() {
	return kehu;
}
public void setKehu(String kehu) {
	this.kehu = kehu;
}

public List<Tbclient> getList() {
	return list;
}
public void setList(List<Tbclient> list) {
	this.list = list;
}
public IClientService getService() {
	return service;
}
public void setService(IClientService service) {
	this.service = service;
}
public String list(){
	String kh = ServletActionContext.getRequest().getParameter("kehu");
	System.out.println(kh);
	list=service.list(tbc,kehu);
	return "list";
}

public String add(){
	service.add(tbc);
	tbc=new Tbclient();
	return list();
}

public String tomodify(){
	tbc = service.detail(tbc);
	return "tomodify";
}

public String modify(){
	service.modify(tbc);
	tbc=new Tbclient();
	return list();
}
}
