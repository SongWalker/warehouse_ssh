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
	 * 查进货单
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
	 * 加进货单
	 */
	public String add(Tbstoremain store) {
		this.getHibernateTemplate().save(store);
		return "list";
	}
	/*
	 * 查供应商
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
	 * 查经手人
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
	 * 查询一条进货单
	 */
	public Tbstoremain detail(Tbstoremain store) {
		store=this.getHibernateTemplate().get(Tbstoremain.class, store.getSmIds());
		return store;
	}
	/*
	 * 修改一条进货单
	 */
	public String modify(Tbstoremain store) {
		this.getHibernateTemplate().update(store);
		return "list";
	}
	/*
	 * 查进货单详情
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
	 * 加进货单详情
	 */
	public String adddetail(Tbstoredetail sd) {
		this.getHibernateTemplate().save(sd);
		return "listd";
	}
	/*
	 * 查商品信息
	 */
	public List<Tbgoodsinfo> alistd(Tbgoodsinfo good) {
		StringBuilder sb= new StringBuilder(" from Tbgoodsinfo good ");
			return this.getHibernateTemplate().find(sb.toString());
	}
	/*
	 * 查询一条进货详情
	 */
	public Tbstoredetail ddetail(Tbstoredetail sd) {
		sd=this.getHibernateTemplate().get(Tbstoredetail.class, sd.getSdId());
		return sd;
	}
	/*
	 * 修改一条进货详情
	 */
	public String dmodify(Tbstoredetail sd) {
		this.getHibernateTemplate().update(sd);
		return "listd";
	}
	/*
	 * 查退货单
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
	 * 加退货单
	 */
	public String addr(Tbstorereturnmain rtn) {
		this.getHibernateTemplate().save(rtn);
		return "listr";
	}
	/*
	 * 查询一条退货单
	 */
	public Tbstorereturnmain detailr(Tbstorereturnmain rtn) {
		rtn=this.getHibernateTemplate().get(Tbstorereturnmain.class, rtn.getRmId());
		return rtn;
	}
	/*
	 * 修改一条退货单
	 */
	public String modifyr(Tbstorereturnmain rtn) {
		this.getHibernateTemplate().update(rtn);
		return "listr";
	}
	/*
	 * 查退货单详情
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
	 * 加退货单详情
	 */
	public String addrdetail(Tbstorereturndetail rtnd) {
		this.getHibernateTemplate().save(rtnd);
		return "listrd";
	}
	/*
	 * 查询一条退货详情
	 */
	public Tbstorereturndetail ddetailr(Tbstorereturndetail rtnd) {
		rtnd=this.getHibernateTemplate().get(Tbstorereturndetail.class, rtnd.getRdId());
		return rtnd;
	}
	/*
	 * 修改一条退货详情
	 */
	public String dmodifyr(Tbstorereturndetail rtnd) {
		this.getHibernateTemplate().update(rtnd);
		return "listrd";
	}
}
