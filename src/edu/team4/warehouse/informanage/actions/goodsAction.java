package edu.team4.warehouse.informanage.actions;

import java.util.List;



import com.opensymphony.xwork2.ActionSupport;

import edu.team4.warehouse.informanage.services.interfaces.IGoodsService;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbsupplier;
import edu.team4.warehouse.model.Tbuser;

public class goodsAction extends ActionSupport {
	Tbgoodsinfo tbgoods=new Tbgoodsinfo();
	Tbsupplier s=new Tbsupplier();
	List<Tbgoodsinfo>list;
	List<Tbsupplier>slist;
	
	Tbuser u=new Tbuser();
	public List<Tbsupplier> getSlist() {
		return slist;
	}
	public void setSlist(List<Tbsupplier> slist) {
		this.slist = slist;
	}

	IGoodsService service;
	
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
		list=service.list(tbgoods);
		return "list";
	}

	public String add(){
		service.add(tbgoods);
		slist=service.slist(s);
		tbgoods=new Tbgoodsinfo();
		return list();
	}

	public String tomodify(){
		tbgoods = service.detail(tbgoods);
		slist=service.slist(s);
		return "tomodify";
	}

	public String modify(){
		service.modify(tbgoods);
		tbgoods=new Tbgoodsinfo();
		return list();
	}

	/*
	 * 查supplier作为下拉框
	 */
	public String alist(){
		//System.out.println("开始添加");
		slist=service.slist(s);
		//System.out.println(slist.get(0).getSName());
		return "alist";
	}
}
