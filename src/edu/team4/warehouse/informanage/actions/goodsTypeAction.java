package edu.team4.warehouse.informanage.actions;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import edu.team4.warehouse.informanage.services.interfaces.IGoodsTypeService;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbgoodstype;

public class goodsTypeAction extends ActionSupport{
  Tbgoodstype tbgoodsType=new Tbgoodstype();
  List<Tbgoodstype>list;
  IGoodsTypeService service;
  String zhonglei;
  
public String getZhonglei() {
	return zhonglei;
}
public void setZhonglei(String zhonglei) {
	this.zhonglei = zhonglei;
}
public Tbgoodstype getTbgoodsType() {
	return tbgoodsType;
}
public void setTbgoodsType(Tbgoodstype tbgoodsType) {
	this.tbgoodsType = tbgoodsType;
}
public List<Tbgoodstype> getList() {
	return list;
}
public void setList(List<Tbgoodstype> list) {
	this.list = list;
}
public IGoodsTypeService getService() {
	return service;
}
public void setService(IGoodsTypeService service) {
	this.service = service;
}
public String list(){
	String zl = ServletActionContext.getRequest().getParameter("zhonglei");
	System.out.println(zl);
	list=service.list(tbgoodsType,zhonglei);
	return "list";
}

public String add(){
	service.add(tbgoodsType);
	tbgoodsType=new Tbgoodstype();
	return list();
}

public String tomodify(){
	tbgoodsType = service.detail(tbgoodsType);
	return "tomodify";
}

public String modify(){
	service.modify(tbgoodsType);
	tbgoodsType=new Tbgoodstype();
	return list();
}
}
