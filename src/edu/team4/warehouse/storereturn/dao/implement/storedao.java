package edu.team4.warehouse.storereturn.dao.implement;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbstoredetail;
import edu.team4.warehouse.model.Tbstoremain;
import edu.team4.warehouse.model.Tbstorereturndetail;
import edu.team4.warehouse.model.Tbstorereturnmain;
import edu.team4.warehouse.model.Tbsupplier;
import edu.team4.warehouse.model.Tbuser;
import edu.team4.warehouse.storereturn.dao.interfaces.Istoredao;

public class storedao extends HibernateDaoSupport implements Istoredao {
	/*
	 * �������
	 */
	public List<Tbstoremain> list(Tbstoremain store) {
		StringBuilder sb= new StringBuilder("from Tbstoremain sm ");
		if(store.getSmNo()!=null && !store.getSmNo().equals("")){
			sb.append(" where sm.smNo=?");
			return this.getHibernateTemplate().find(sb.toString(),store.getSmNo());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * �ӽ�����
	 */
	public String add(Tbstoremain store) {
		this.getHibernateTemplate().save(store);
		return "list";
	}
	/*
	 * �鹩Ӧ��
	 */
	public List<Tbsupplier> slist(Tbsupplier s) {
		StringBuilder sb= new StringBuilder(" from Tbsupplier s ");
		if(s.getSName()!=null && !s.getSName().equals("")){
			sb.append(" where s.SName=?");
			return this.getHibernateTemplate().find(sb.toString(),s.getSName());
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
	public Tbstoremain detail(Tbstoremain store) {
		store=this.getHibernateTemplate().get(Tbstoremain.class, store.getSmIds());
		return store;
	}
	/*
	 * �޸�һ��������
	 */
	public String modify(Tbstoremain store) {
		this.getHibernateTemplate().update(store);
		return "list";
	}
	/*
	 * �����������
	 */
	public List<Tbstoredetail> listd(Tbstoredetail sd) {
		StringBuilder sb= new StringBuilder(" from Tbstoredetail sd ");
		if(sd.getSdNo()!=null && !sd.getSdNo().equals("")){
			sb.append(" where sd.sdNo=? ");
			return this.getHibernateTemplate().find(sb.toString(),sd.getSdNo());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * �ӽ���������
	 */
	public String adddetail(Tbstoredetail sd) {
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
	public Tbstoredetail ddetail(Tbstoredetail sd) {
		sd=this.getHibernateTemplate().get(Tbstoredetail.class, sd.getSdId());
		return sd;
	}
	/*
	 * �޸�һ����������
	 */
	public String dmodify(Tbstoredetail sd) {
		this.getHibernateTemplate().update(sd);
		return "listd";
	}
	/*
	 * ���˻���
	 */
	public List<Tbstorereturnmain> listr(Tbstorereturnmain rtn) {
		StringBuilder sb= new StringBuilder("from Tbstorereturnmain rtn ");
		if(rtn.getRmNo()!=null && !rtn.getRmNo().equals("")){
			sb.append(" where rtn.rmNo=?");
			return this.getHibernateTemplate().find(sb.toString(),rtn.getRmNo());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * ���˻���
	 */
	public String addr(Tbstorereturnmain rtn) {
		this.getHibernateTemplate().save(rtn);
		return "listr";
	}
	/*
	 * ��ѯһ���˻���
	 */
	public Tbstorereturnmain detailr(Tbstorereturnmain rtn) {
		rtn=this.getHibernateTemplate().get(Tbstorereturnmain.class, rtn.getRmId());
		return rtn;
	}
	/*
	 * �޸�һ���˻���
	 */
	public String modifyr(Tbstorereturnmain rtn) {
		this.getHibernateTemplate().update(rtn);
		return "listr";
	}
	/*
	 * ���˻�������
	 */
	public List<Tbstorereturndetail> listrd(Tbstorereturndetail rtnd) {
		StringBuilder sb= new StringBuilder(" from Tbstorereturndetail rtnd ");
		if(rtnd.getRdNo()!=null && !rtnd.getRdNo().equals("")){
			sb.append(" where rtnd.rdNo=? ");
			return this.getHibernateTemplate().find(sb.toString(),rtnd.getRdNo());
		}else{
			return this.getHibernateTemplate().find(sb.toString());
		}
	}
	/*
	 * ���˻�������
	 */
	public String addrdetail(Tbstorereturndetail rtnd) {
		this.getHibernateTemplate().save(rtnd);
		return "listrd";
	}
	/*
	 * ��ѯһ���˻�����
	 */
	public Tbstorereturndetail ddetailr(Tbstorereturndetail rtnd) {
		rtnd=this.getHibernateTemplate().get(Tbstorereturndetail.class, rtnd.getRdId());
		return rtnd;
	}
	/*
	 * �޸�һ���˻�����
	 */
	public String dmodifyr(Tbstorereturndetail rtnd) {
		this.getHibernateTemplate().update(rtnd);
		return "listrd";
	}
}
