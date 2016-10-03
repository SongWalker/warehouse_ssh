package edu.team4.warehouse.informanage.actions;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import edu.team4.warehouse.informanage.services.interfaces.ICustomerService;
import edu.team4.warehouse.model.Tbuser;


public class customerAction extends ActionSupport {
	Tbuser user=new Tbuser();
	List<Tbuser> list;
	ICustomerService service;
	public String yonghu;
	
	public String getYonghu() {
		return yonghu;
	}
	public void setYonghu(String yonghu) {
		this.yonghu = yonghu;
	}
	public Tbuser getUser() {
		return user;
	}
	public void setUser(Tbuser user) {
		this.user = user;
	}
	public List<Tbuser> getList() {
		return list;
	}
	public void setList(List<Tbuser> list) {
		this.list = list;
	}
	public ICustomerService getService() {
		return service;
	}
	public void setService(ICustomerService service) {
		this.service = service;
	}

	public String list(){
		String yh = ServletActionContext.getRequest().getParameter("yonghu");
		System.out.println(yh);
		list=service.list(user,yonghu);
		return "list";
	}

	public String add(){
		service.add(user);
		user=new Tbuser();
		return list();
	}

	public String tomodify(){
		user = service.detail(user);
		return "tomodify";
	}

	public String modify(){
		service.modify(user);
		user=new Tbuser();
		return list();
	}
}
