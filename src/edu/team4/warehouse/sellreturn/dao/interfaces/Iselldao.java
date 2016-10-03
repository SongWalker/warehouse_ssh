package edu.team4.warehouse.sellreturn.dao.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbclient;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbselldetail;
import edu.team4.warehouse.model.Tbsellmain;
import edu.team4.warehouse.model.Tbsellreturndetail;
import edu.team4.warehouse.model.Tbsellreturnmain;
import edu.team4.warehouse.model.Tbuser;

public interface Iselldao {
	public List<Tbsellmain> list(Tbsellmain store);
	/*
	 * 增加进货单
	 */
	public String add(Tbsellmain store);
	/*
	 * 获取供应商对象
	 */
	public List<Tbclient> slist(Tbclient s);
	/*
	 * 获取经手人
	 */
	public List<Tbuser> ulist(Tbuser u);
	/*
	 * 获取一条修改信息
	 */
	public Tbsellmain detail(Tbsellmain store);
	/*
	 * 修改进货单
	 */
	public String modify(Tbsellmain store);
	/*
	 * 读进货单详情
	 */
	public List<Tbselldetail> listd(Tbselldetail sd);
	/*
	 * 加进货单详情
	 */
	public String adddetail(Tbselldetail sd);
	/*
	 * 查商品号
	 */
	public List<Tbgoodsinfo> alistd(Tbgoodsinfo good);
	/*
	 * 获取一条修改信息
	 */
	public Tbselldetail ddetail(Tbselldetail sd);
	/*
	 * 修改进货详情
	 */
	public String dmodify(Tbselldetail sd);
	/*
	 * 查询退货单
	 */
	public List<Tbsellreturnmain> listr(Tbsellreturnmain rtn);
	/*
	 * 增加退货单
	 */
	public String addr(Tbsellreturnmain rtn);
	/*
	 * 获取一条修改信息
	 */
	public Tbsellreturnmain detailr(Tbsellreturnmain rtn);
	/*
	 * 修改退货单
	 */
	public String modifyr(Tbsellreturnmain rtn);
	/*
	 * 读退货单详情
	 */
	public List<Tbsellreturndetail> listrd(Tbsellreturndetail rtnd);
	/*
	 * 加进货单详情
	 */
	public String addrdetail(Tbsellreturndetail rtnd);
	/*
	 * 获取一条修改信息
	 */
	public Tbsellreturndetail ddetailr(Tbsellreturndetail rtnd);
	/*
	 * 修改进货详情
	 */
	public String dmodifyr(Tbsellreturndetail rtnd);
}
