package edu.team4.warehouse.login.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import edu.team4.warehouse.login.services.interfaces.Iloginservice;
import edu.team4.warehouse.model.Tbuser;


// import edu.team4.warehouse.login.services.interfaces.Istoreservices;

public class loginactions {
	Tbuser user;
	List<Tbuser> list;
	Iloginservice service;

	public String CheckUId(){
		//HttpServletRequest request = null;
    	list = service.CheckUId(user);
    	if(list==null||list.isEmpty()){
    		System.out.println("µÇÂ¼Ê§°Ü");
    		return "uncess";
    	}
         else {
        	 System.out.println("µÇÂ¼³É¹¦");
        	 //ActionContext.getContext().getSession().put("user", list.get(0));
        	 return "login";
         }
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

	public Iloginservice getService() {
		return service;
	}

	public void setService(Iloginservice service) {
		this.service = service;
	}

}
