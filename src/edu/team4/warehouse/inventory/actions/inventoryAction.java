package edu.team4.warehouse.inventory.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.team4.warehouse.inventory.services.interfaces.IinventoryService;
import edu.team4.warehouse.model.Tbinventory;

public class inventoryAction extends ActionSupport {
	Tbinventory inventory=new Tbinventory();
	List<Tbinventory> list;
	IinventoryService service;
	public Tbinventory getInventory() {
		return inventory;
	}
	public void setInventory(Tbinventory inventory) {
		this.inventory = inventory;
	}
	public List<Tbinventory> getList() {
		return list;
	}
	public void setList(List<Tbinventory> list) {
		this.list = list;
	}
	public IinventoryService getService() {
		return service;
	}
	public void setService(IinventoryService service) {
		this.service = service;
	}
	/**
	 * 查询库存
	 */
	public String list(){
		list=service.list(inventory);
		return "list";
	}
	
	/**
	 * 添加库存信息
	 */
	public String add(){
		service.add(inventory);
		inventory=new Tbinventory();
		return list();
	}
	
	public String tomodify(){
		inventory=service.detail(inventory);
		return "tomodify";
	}
	
	public String modify(){
		service.modify(inventory);
		inventory=new Tbinventory();
		return list();
	}

}
