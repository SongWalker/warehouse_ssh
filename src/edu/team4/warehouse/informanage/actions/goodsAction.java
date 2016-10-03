package edu.team4.warehouse.informanage.actions;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.Select;

import edu.team4.warehouse.informanage.services.interfaces.IGoodsService;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbuser;

public class goodsAction extends ActionSupport {
	Tbgoodsinfo tbgoods=new Tbgoodsinfo();
	List<Tbgoodsinfo>list;
	IGoodsService service;
	public String chaxun;

	


	public String getChaxun() {
		return chaxun;
	}
	public void setChaxun(String chaxun) {
		this.chaxun = chaxun;
	}
	public Tbgoodsinfo getTbgoods() {
		return tbgoods;
	}
	public void setTbgoods(Tbgoodsinfo tbgoods) {
		this.tbgoods = tbgoods;
	}
	public List<Tbgoodsinfo> getList() {
		return list;
	}
	public void setList(List<Tbgoodsinfo> list) {
		this.list = list;
	}
	public IGoodsService getService() {
		return service;
	}
	public void setService(IGoodsService service) {
		this.service = service;
	}
	public String list(){
		String ch = ServletActionContext.getRequest().getParameter("chaxun");
		System.out.println(ch);
		list=service.list(tbgoods,chaxun);
		return "list";
	}

	public String add(){
		service.add(tbgoods);
		tbgoods=new Tbgoodsinfo();
		return list();
	}

	public String tomodify(){
		tbgoods = service.detail(tbgoods);
		return "tomodify";
	}

	public String modify(){
		service.modify(tbgoods);
		tbgoods=new Tbgoodsinfo();
		return list();
	}

}
