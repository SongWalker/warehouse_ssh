package edu.team4.warehouse.inventory.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.team4.warehouse.inventory.services.interfaces.IrecordService;
import edu.team4.warehouse.model.Tbinventory;
import edu.team4.warehouse.model.Tbinventoryrecord;

public class recordAction extends ActionSupport {
	Tbinventoryrecord record=new Tbinventoryrecord();
	List<Tbinventoryrecord> list;
	IrecordService service;
	public Tbinventoryrecord getRecord() {
		return record;
	}
	public void setRecord(Tbinventoryrecord record) {
		this.record = record;
	}
	public List<Tbinventoryrecord> getList() {
		return list;
	}
	public void setList(List<Tbinventoryrecord> list) {
		this.list = list;
	}
	public IrecordService getService() {
		return service;
	}
	public void setService(IrecordService service) {
		this.service = service;
	}
	
    public String list(){
    	list=service.list(record);
    	return "list";
    }
    
    public String add(){
    	service.add(record);
    	record=new Tbinventoryrecord();
    	return list();
    }
    
    public String tomodify(){
    	record=service.detail(record);
    	return "tomodify";
    }
    
    public String modify(){
		service.modify(record);
		record=new Tbinventoryrecord();
		return list();
	}

}
