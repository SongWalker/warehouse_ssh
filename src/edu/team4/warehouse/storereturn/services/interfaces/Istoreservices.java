package edu.team4.warehouse.storereturn.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbstoredetail;
import edu.team4.warehouse.model.Tbstoremain;
import edu.team4.warehouse.model.Tbstorereturndetail;
import edu.team4.warehouse.model.Tbstorereturnmain;
import edu.team4.warehouse.model.Tbsupplier;
import edu.team4.warehouse.model.Tbuser;

public interface Istoreservices {
	public List<Tbstoremain> list(Tbstoremain store);
	/*
	 * 增加进货单
	 */
	public String add(Tbstoremain store);
	/*
	 * 获取供应商对象
	 */
	public List<Tbsupplier> slist(Tbsupplier s);
	/*
	 * 获取经手人
	 */
	public List<Tbuser> ulist(Tbuser u);
	/*
	 * 获取一条进货单修改信息
	 */
	public Tbstoremain detail(Tbstoremain store);
	/*
	 * 修改进货单
	 */
	public String modify(Tbstoremain store);
	/*
	 * 查进货单详情
	 */
	public List<Tbstoredetail> listd(Tbstoredetail sd);
	/*
	 * 加进货单详情
	 */
	public String adddetail(Tbstoredetail sd);
	/*
	 * 获取商品信息
	 */
	public List<Tbgoodsinfo> alistd(Tbgoodsinfo good);
	/*
	 * 获取一条进货详情修改信息
	 */
	public Tbstoredetail ddetail(Tbstoredetail sd);
	/*
	 * 修改进货详情
	 */
	public String dmodify(Tbstoredetail sd);
	/*
	 * 查询退货单
	 */
	public List<Tbstorereturnmain> listr(Tbstorereturnmain rtn);
	/*
	 * 增加退货单
	 */
	public String addr(Tbstorereturnmain rtn);
	/*
	 * 获取一条退货单修改信息
	 */
	public Tbstorereturnmain detailr(Tbstorereturnmain rtn);
	/*
	 * 修改退货单
	 */
	public String modifyr(Tbstorereturnmain rtn);
	/*
	 * 查退货单详情
	 */
	public List<Tbstorereturndetail> listrd(Tbstorereturndetail rtnd);
	/*
	 * 加退货单详情
	 */
	public String addrdetail(Tbstorereturndetail rtnd);
	/*
	 * 获取一条退货详情修改信息
	 */
	public Tbstorereturndetail ddetailr(Tbstorereturndetail rtnd);
	/*
	 * 修改退货详情
	 */
	public String dmodifyr(Tbstorereturndetail rtnd);
}
