package edu.team4.warehouse.sellreturn.dao.implement;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.team4.warehouse.model.Tbclient;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbselldetail;
import edu.team4.warehouse.model.Tbsellmain;
import edu.team4.warehouse.model.Tbsellreturndetail;
import edu.team4.warehouse.model.Tbsellreturnmain;
import edu.team4.warehouse.model.Tbuser;
import edu.team4.warehouse.sellreturn.dao.interfaces.Iselldao;

public class selldao extends HibernateDaoSupport implements Iselldao {
	/*
	 * �������
	 */
	public List<Tbsellmain> list(Tbsellmain store) {
		StringBuilder sb= new StringBuilder("from Tbsellmain sm ");
		if(store.getSemNo()!=null && !store.getSemNo().equals("")){
			sb.append(" where sm.smNo=?");
			return this.getHibernateTemplate().find(sb.toString(),store.getSemNo());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * �ӽ�����
	 */
	public String add(Tbsellmain store) {
		this.getHibernateTemplate().save(store);
		return "list";
	}
	/*
	 * �鹩Ӧ��
	 */
	public List<Tbclient> slist(Tbclient s) {
		StringBuilder sb= new StringBuilder(" from Tbclient s ");
		if(s.getCName()!=null && !s.getCName().equals("")){
			sb.append(" where s.CName=?");
			return this.getHibernateTemplate().find(sb.toString(),s.getCName());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * �龭����
	 */
	public List<Tbuser> ulist(Tbuser u) {
		StringBuilder sb= new StringBuilder(" from Tbuser u ");
		if(u.getUName()!=null && !u.getUName().equals("")){
			//sb.append(" where s.UName=?");
			return this.getHibernateTemplate().find(sb.toString(),u.getUName());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}	
	}
	/*
	 * ��ѯһ��������
	 */
	public Tbsellmain detail(Tbsellmain store) {
		store=this.getHibernateTemplate().get(Tbsellmain.class, store.getSemId());
		return store;
	}
	/*
	 * �޸�һ��������
	 */
	public String modify(Tbsellmain store) {
		this.getHibernateTemplate().update(store);
		return "list";
	}
	/*
	 * �����������
	 */
	public List<Tbselldetail> listd(Tbselldetail sd) {
		StringBuilder sb= new StringBuilder(" from Tbselldetail sd ");
		if(sd.getSedNo()!=null && !sd.getSedNo().equals("")){
			sb.append(" where sd.sedNo=? ");
			return this.getHibernateTemplate().find(sb.toString(),sd.getSedNo());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * �ӽ���������
	 */
	public String adddetail(Tbselldetail sd) {
		this.getHibernateTemplate().save(sd);
		return "listd";
	}
	/*
	 * ����Ʒ��Ϣ
	 */
	public List<Tbgoodsinfo> alistd(Tbgoodsinfo good) {
		StringBuilder sb= new StringBuilder(" from Tbgoodsinfo good ");
			return this.getHibernateTemplate().find(sb.toString());
	}
	/*
	 * ��ѯһ����������
	 */
	public Tbselldetail ddetail(Tbselldetail sd) {
		sd=this.getHibernateTemplate().get(Tbselldetail.class, sd.getSedId());
		return sd;
	}
	/*
	 * �޸�һ����������
	 */
	public String dmodify(Tbselldetail sd) {
		this.getHibernateTemplate().update(sd);
		return "listd";
	}
	/*
	 * ���˻���
	 */
	public List<Tbsellreturnmain> listr(Tbsellreturnmain rtn) {
		StringBuilder sb= new StringBuilder("from Tbsellreturnmain rtn ");
		if(rtn.getSrmNo()!=null && !rtn.getSrmNo().equals("")){
			sb.append(" where rtn.srmNo=?");
			return this.getHibernateTemplate().find(sb.toString(),rtn.getSrmNo());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * ���˻���
	 */
	public String addr(Tbsellreturnmain rtn) {
		this.getHibernateTemplate().save(rtn);
		return "listr";
	}
	/*
	 * ��ѯһ���˻���
	 */
	public Tbsellreturnmain detailr(Tbsellreturnmain rtn) {
		rtn=this.getHibernateTemplate().get(Tbsellreturnmain.class, rtn.getSrmId());
		return rtn;
	}
	/*
	 * �޸�һ���˻���
	 */
	public String modifyr(Tbsellreturnmain rtn) {
		this.getHibernateTemplate().update(rtn);
		return "listr";
	}
	/*
	 * ���˻�������
	 */
	public List<Tbsellreturndetail> listrd(Tbsellreturndetail rtnd) {
		StringBuilder sb= new StringBuilder(" from Tbsellreturndetail rtnd ");
		if(rtnd.getSrdNo()!=null && !rtnd.getSrdNo().equals("")){
			sb.append(" where rtnd.srdNo=? ");
			return this.getHibernateTemplate().find(sb.toString(),rtnd.getSrdNo());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * ���˻�������
	 */
	public String addrdetail(Tbsellreturndetail rtnd) {
		this.getHibernateTemplate().save(rtnd);
		return "listrd";
	}
	/*
	 * ��ѯһ���˻�����
	 */
	public Tbsellreturndetail ddetailr(Tbsellreturndetail rtnd) {
		rtnd=this.getHibernateTemplate().get(Tbsellreturndetail.class, rtnd.getSrdId());
		return rtnd;
	}
	/*
	 * �޸�һ���˻�����
	 */
	public String dmodifyr(Tbsellreturndetail rtnd) {
		this.getHibernateTemplate().update(rtnd);
		return "listrd";
	}
}
