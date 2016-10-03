package edu.team4.warehouse.informanage.actions;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import edu.team4.warehouse.informanage.services.interfaces.ISupplierService;
import edu.team4.warehouse.model.Tbclient;
import edu.team4.warehouse.model.Tbsupplier;

public class supplierAction extends ActionSupport{
  List<Tbsupplier>list;
  Tbsupplier tbsup=new Tbsupplier();
  ISupplierService service;
  String gys;
  

public String getGys() {
	return gys;
}

public void setGys(String gys) {
	this.gys = gys;
}

public List<Tbsupplier> getList() {
	return list;
}

public void setList(List<Tbsupplier> list) {
	this.list = list;
}

public Tbsupplier getTbsup() {
	return tbsup;
}

public void setTbsup(Tbsupplier tbsup) {
	this.tbsup = tbsup;
}

public ISupplierService getService() {
	return service;
}

public void setService(ISupplierService service) {
	this.service = service;
}


public String list(){
	String gy = ServletActionContext.getRequest().getParameter("gys");
	System.out.println(gy);
	list=service.list(tbsup,gys);
	return "list";
}

public String add(){
	service.add(tbsup);
	tbsup=new Tbsupplier();
	return list();
}

public String tomodify(){
	tbsup = service.detail(tbsup);
	return "tomodify";
}

public String modify(){
	service.modify(tbsup);
	tbsup=new Tbsupplier();
	return list();
}
}
