package edu.team4.warehouse.login.dao.implement;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.team4.warehouse.login.dao.interfaces.Ilogindao;
import edu.team4.warehouse.model.Tbuser;

public class logindao extends HibernateDaoSupport implements Ilogindao {

	List<Tbuser> list;
	public List<Tbuser> CheckUId(Tbuser user) {
		StringBuilder sb= new StringBuilder("from Tbuser user");
		if(user.getUUid()!=null&&!user.getUUid().equals("")&&user.getUPass()!=null&&!user.getUPass().equals("")){
			sb.append(" where user.UUid=? and user.UPass=?");
			 list = this.getHibernateTemplate().find(sb.toString(), new String[]{user.getUUid(),user.getUPass()});			 
			 return list;
		}
		return null;
	}
}
