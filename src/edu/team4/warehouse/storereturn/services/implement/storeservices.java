package edu.team4.warehouse.storereturn.services.implement;

import java.util.List;
import edu.team4.warehouse.inventory.services.interfaces.IrecordService;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbstoredetail;
import edu.team4.warehouse.model.Tbstoremain;
import edu.team4.warehouse.model.Tbstorereturndetail;
import edu.team4.warehouse.model.Tbstorereturnmain;
import edu.team4.warehouse.model.Tbsupplier;
import edu.team4.warehouse.model.Tbuser;
import edu.team4.warehouse.storereturn.dao.interfaces.Istoredao;
import edu.team4.warehouse.storereturn.services.interfaces.Istoreservices;

public class storeservices implements Istoreservices {

	private Istoredao dao;
	private IrecordService recordService;
	

	public IrecordService getRecordService() {
		return recordService;
	}

	public void setRecordService(IrecordService recordService) {
		this.recordService = recordService;
	}

	public Istoredao getDao() {
		return dao;
	}

	public void setDao(Istoredao dao) {
		this.dao = dao;
	}
	/*
	 * 查询进货单
	 */
	public List<Tbstoremain> list(Tbstoremain store) {
		return dao.list(store);
	}
	/*
	 * 增加进货单
	 */
	public String add(Tbstoremain store) {
		return dao.add(store);
	}
	/*
	 * 查询供应商作下拉框
	 */
	public List<Tbsupplier> slist(Tbsupplier s) {
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
	public Tbstoremain detail(Tbstoremain store) {
		return dao.detail(store);
	}
	/*
	 * 修改进货单
	 */
	public String modify(Tbstoremain store) {
		return dao.modify(store);
	}
	/*
	 * 查进货单详情
	 */
	public List<Tbstoredetail> listd(Tbstoredetail sd) {
		return dao.listd(sd);
	}
	/*
	 * 加进货单详情,同时增加一条入库记录
	 */
	@SuppressWarnings("finally")
	public String adddetail(Tbstoredetail sd) {
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
	public Tbstoredetail ddetail(Tbstoredetail sd) {
		return dao.ddetail(sd);
	}
	/*
	 * 修改进货详情
	 */
	public String dmodify(Tbstoredetail sd) {
		return dao.dmodify(sd);
	}
	/*
	 * 查询退货单
	 */
	public List<Tbstorereturnmain> listr(Tbstorereturnmain rtn) {
		return dao.listr(rtn);
	}
	/*
	 * 增加退货单
	 */
	public String addr(Tbstorereturnmain rtn) {
		return dao.addr(rtn);
	}
	/*
	 * 查一条退货单信息
	 */
	public Tbstorereturnmain detailr(Tbstorereturnmain rtn) {
		return dao.detailr(rtn);
	}
	/*
	 * 修改退货单
	 */
	public String modifyr(Tbstorereturnmain rtn) {
		return dao.modifyr(rtn);
	}
	/*
	 * 查退货单详情
	 */
	public List<Tbstorereturndetail> listrd(Tbstorereturndetail rtnd) {
		return dao.listrd(rtnd);
	}
	/*
	 * 加退货单详情
	 */
	public String addrdetail(Tbstorereturndetail rtnd) {
		return dao.addrdetail(rtnd);
	}
	/*
	 * 查一条退货单信息
	 */
	public Tbstorereturndetail ddetailr(Tbstorereturndetail rtnd) {
		return dao.ddetailr(rtnd);
	}
	/*
	 * 修改退货详情
	 */
	public String dmodifyr(Tbstorereturndetail rtnd) {
		return dao.dmodifyr(rtnd);
	}
}
