package edu.team4.warehouse.storereturn.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbstoredetail;
import edu.team4.warehouse.model.Tbstoremain;
import edu.team4.warehouse.model.Tbstorereturndetail;
import edu.team4.warehouse.model.Tbstorereturnmain;
import edu.team4.warehouse.model.Tbsupplier;
import edu.team4.warehouse.model.Tbuser;
import edu.team4.warehouse.storereturn.services.interfaces.Istoreservices;

public class storeactions extends ActionSupport {
	Tbstoremain store= new Tbstoremain();
	Tbstoredetail sd=new Tbstoredetail();
	Tbsupplier s=new Tbsupplier();
	Tbuser u=new Tbuser();
	Tbgoodsinfo good=new Tbgoodsinfo();
	Tbstorereturnmain rtn=new Tbstorereturnmain();
	Tbstorereturndetail rtnd=new Tbstorereturndetail();
	List<Tbstorereturnmain> listr;
	List<Tbstorereturndetail> listrd;
	List<Tbstoremain> list;
	List<Tbsupplier> slist;
	List<Tbuser> ulist;
	List<Tbstoredetail> listd;
	List<Tbgoodsinfo> alistd;
	public Tbstorereturndetail getRtnd() {
		return rtnd;
	}
	public void setRtnd(Tbstorereturndetail rtnd) {
		this.rtnd = rtnd;
	}
	public List<Tbstorereturndetail> getListrd() {
		return listrd;
	}
	public void setListrd(List<Tbstorereturndetail> listrd) {
		this.listrd = listrd;
	}
	public Tbstorereturnmain getRtn() {
		return rtn;
	}
	public void setRtn(Tbstorereturnmain rtn) {
		this.rtn = rtn;
	}
	public List<Tbstorereturnmain> getListr() {
		return listr;
	}
	public void setListr(List<Tbstorereturnmain> listr) {
		this.listr = listr;
	}
	public Tbgoodsinfo getGood() {
		return good;
	}
	public void setGood(Tbgoodsinfo good) {
		this.good = good;
	}
	public List<Tbgoodsinfo> getAlistd() {
		return alistd;
	}
	public void setAlistd(List<Tbgoodsinfo> alistd) {
		this.alistd = alistd;
	}
	public Tbuser getU() {
		return u;
	}
	public void setU(Tbuser u) {
		this.u = u;
	}
	public List<Tbuser> getUlist() {
		return ulist;
	}
	public void setUlist(List<Tbuser> ulist) {
		this.ulist = ulist;
	}
	public Tbsupplier getS() {
		return s;
	}
	public void setS(Tbsupplier s) {
		this.s = s;
	}
	public List<Tbsupplier> getSlist() {
		return slist;
	}
	public void setSlist(List<Tbsupplier> slist) {
		this.slist = slist;
	}
	
	public Tbstoredetail getSd() {
		return sd;
	}
	public void setSd(Tbstoredetail sd) {
		this.sd = sd;
	}
	public List<Tbstoredetail> getListd() {
		return listd;
	}
	public void setListd(List<Tbstoredetail> listd) {
		this.listd = listd;
	}

	Istoreservices service;
	public Tbstoremain getStore() {
		return store;
	}
	public void setStore(Tbstoremain store) {
		this.store = store;
	}
	public List<Tbstoremain> getList() {
		return list;
	}
	public void setList(List<Tbstoremain> list) {
		this.list = list;
	}
	public Istoreservices getService() {
		return service;
	}
	public void setService(Istoreservices service) {
		this.service = service;
	}
	/*
	 * 查询进货单
	 */
	public String list(){
		list=service.list(store);
		return "list";
	}
	/*
	 * 查supplier作为下拉框
	 */
	public String alist(){
		slist=service.slist(s);
		ulist=service.ulist(u);
		//System.out.println(slist.get(1).getSName());
		return "alist";
	}

	/*
	 * 增加进货单
	 */
	public String add(){
		String rtn=service.add(store);
		store=new Tbstoremain();
		return list();
	}
	/*
	 * 初始化修改界面
	 */
	public String tomodify(){
		store=service.detail(store);
		slist=service.slist(s);
		ulist=service.ulist(u);
		return "tomodify";
	}
	/*
	 * 修改
	 */
	public String modify(){
		service.modify(store);
		store=new Tbstoremain();
		return list();
	}
	/*
	 * 查询进货单详情
	 */
	public String listd(){
		listd=service.listd(sd);
		return "listd";
	}
	/*
	 * 加进货单详情
	 */
	public String adddetail(){
		String rtn=service.adddetail(sd);
		sd=new Tbstoredetail();
		return listd();
	}
	/*
	 * 查商品作为下拉框
	 */
	public String alistd(){
		alistd=service.alistd(good);
		return "alistd";
	}

	/*
	 * 初始化修改界面
	 */
	public String dtomodify(){
		alistd=service.alistd(good);
		sd=service.ddetail(sd);
		return "dtomodify";
	}
	/*
	 * 修改
	 */
	public String dmodify(){
		service.dmodify(sd);
		sd=new Tbstoredetail();
		return listd();
	}
	/*
	 * 查询退货单
	 */
	public String listr(){
		listr=service.listr(rtn);
		return "listr";
	}
	/*
	 * 增加退货单
	 */
	public String addr(){
		String re_turn=service.addr(rtn);
		rtn=new Tbstorereturnmain();
		return listr();
	}
	/*
	 * 初始化修改界面
	 */
	public String tomodifyr(){
		rtn=service.detailr(rtn);
		slist=service.slist(s);
		ulist=service.ulist(u);
		return "tomodifyr";
	}
	/*
	 * 修改
	 */
	public String modifyr(){
		service.modifyr(rtn);
		rtn=new Tbstorereturnmain();
		return listr();
	}
	/*
	 * 查询退货单详情
	 */
	public String listrd(){
		listrd=service.listrd(rtnd);
		return "listrd";
	}
	/*
	 * 加退货单详情
	 */
	public String addrdetail(){
		String rtn=service.addrdetail(rtnd);
		rtnd=new Tbstorereturndetail();
		return listrd();
	}
	/*
	 * 初始化修改界面
	 */
	public String dtomodifyr(){
		alistd=service.alistd(good);
		rtnd=service.ddetailr(rtnd);
		return "dtomodifyr";
	}
	/*
	 * 修改
	 */
	public String dmodifyr(){
		service.dmodifyr(rtnd);
		rtnd=new Tbstorereturndetail();
		return listrd();
	}
}
