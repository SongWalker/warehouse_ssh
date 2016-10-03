package edu.team4.warehouse.sellreturn.services.implement;

import java.util.List;

import edu.team4.warehouse.model.Tbclient;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbselldetail;
import edu.team4.warehouse.model.Tbsellmain;
import edu.team4.warehouse.model.Tbsellreturndetail;
import edu.team4.warehouse.model.Tbsellreturnmain;
import edu.team4.warehouse.model.Tbuser;
import edu.team4.warehouse.sellreturn.dao.interfaces.Iselldao;
import edu.team4.warehouse.sellreturn.services.interfaces.Isellservices;

public class sellservices implements Isellservices {
	private Iselldao dao;

	public Iselldao getDao() {
		return dao;
	}

	public void setDao(Iselldao dao) {
		this.dao = dao;
	}
	/*
	 * 查询进货单
	 */
	public List<Tbsellmain> list(Tbsellmain store) {
		return dao.list(store);
	}
	/*
	 * 增加进货单
	 */
	public String add(Tbsellmain store) {
		return dao.add(store);
	}
	/*
	 * 查询供应商作下拉框
	 */
	public List<Tbclient> slist(Tbclient s) {
		return dao.slist(s);
	}
	/*
	 * 查询经手人作下拉框
	 */
	public List<Tbuser> ulist(Tbuser u) {
		return dao.ulist(u);
	}
	/*
	 * 查一条进货单信息
	 */
	public Tbsellmain detail(Tbsellmain store) {
		return dao.detail(store);
	}
	/*
	 * 修改进货单
	 */
	public String modify(Tbsellmain store) {
		return dao.modify(store);
	}
	/*
	 * 查进货单详情
	 */
	public List<Tbselldetail> listd(Tbselldetail sd) {
		return dao.listd(sd);
	}
	/*
	 * 加进货单详情
	 */
	public String adddetail(Tbselldetail sd) {
		return dao.adddetail(sd);
	}
	/*
	 * 查商品号作下拉框
	 */
	public List<Tbgoodsinfo> alistd(Tbgoodsinfo good) {
		return dao.alistd(good);
	}
	/*
	 * 查一条进货单信息
	 */
	public Tbselldetail ddetail(Tbselldetail sd) {
		return dao.ddetail(sd);
	}
	/*
	 * 修改进货详情
	 */
	public String dmodify(Tbselldetail sd) {
		return dao.dmodify(sd);
	}
	/*
	 * 查询退货单
	 */
	public List<Tbsellreturnmain> listr(Tbsellreturnmain rtn) {
		return dao.listr(rtn);
	}
	/*
	 * 增加退货单
	 */
	public String addr(Tbsellreturnmain rtn) {
		return dao.addr(rtn);
	}
	/*
	 * 查一条退货单信息
	 */
	public Tbsellreturnmain detailr(Tbsellreturnmain rtn) {
		return dao.detailr(rtn);
	}
	/*
	 * 修改退货单
	 */
	public String modifyr(Tbsellreturnmain rtn) {
		return dao.modifyr(rtn);
	}
	/*
	 * 查退货单详情
	 */
	public List<Tbsellreturndetail> listrd(Tbsellreturndetail rtnd) {
		return dao.listrd(rtnd);
	}
	/*
	 * 加退货单详情
	 */
	public String addrdetail(Tbsellreturndetail rtnd) {
		return dao.addrdetail(rtnd);
	}
	/*
	 * 查一条退货单信息
	 */
	public Tbsellreturndetail ddetailr(Tbsellreturndetail rtnd) {
		return dao.ddetailr(rtnd);
	}
	/*
	 * 修改退货详情
	 */
	public String dmodifyr(Tbsellreturndetail rtnd) {
		return dao.dmodifyr(rtnd);
	}
}
