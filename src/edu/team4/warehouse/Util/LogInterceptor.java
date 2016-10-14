package edu.team4.warehouse.Util;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

import edu.team4.warehouse.model.Tbuser;

public class LogInterceptor extends AbstractInterceptor implements Interceptor{
	Tbuser user;
	public Tbuser getUser() {
		return user;
	}
	public void setUser(Tbuser user) {
		this.user = user;
	}
	public String intercept(ActionInvocation invocation) throws Exception {  
        // TODO Auto-generated method stub  
        System.out.println("----intercept()------");  
        Map<String, Object> session= invocation.getInvocationContext().getSession();  
        if(session.get("user")!=null){  
            System.out.println("µÇÂ½³É¹¦£¡");          
            //session.put("username",user.getUsername());  
            return invocation.invoke();  
        }else{  
            System.out.println(session.isEmpty()+"µÇÂ½Ê§°Ü£¡");  
            return "uncess";  
        }  
    }  

}
