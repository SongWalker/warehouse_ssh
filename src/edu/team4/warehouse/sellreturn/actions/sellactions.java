package edu.team4.warehouse.sellreturn.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.team4.warehouse.model.Tbclient;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbselldetail;
import edu.team4.warehouse.model.Tbsellmain;
import edu.team4.warehouse.model.Tbsellreturndetail;
import edu.team4.warehouse.model.Tbsellreturnmain;
import edu.team4.warehouse.model.Tbuser;
import edu.team4.warehouse.sellreturn.services.interfaces.Isellservices;

public class sellactions extends ActionSupport {
	private static final long serialVersionUID = 1L;
	Isellservices service;

	public Isellservices getService() {
		return service;
	}

	public void setService(Isellservices service) {
		this.service = service;
	}
	Tbsellmain store= new Tbsellmain();
	List<Tbsellmain> list;
	
	Tbclient s=new Tbclient();
	List<Tbclient> slist;
	
	Tbuser u=new Tbuser();
	List<Tbuser> ulist;
	
	Tbselldetail sd=new Tbselldetail();
	List<Tbselldetail> listd;
	
	Tbgoodsinfo good=new Tbgoodsinfo();
	List<Tbgoodsinfo> alistd;
	
	Tbsellreturnmain rtn=new Tbsellreturnmain();
	List<Tbsellreturnmain> listr;
	
	Tbsellreturndetail rtnd=new Tbsellreturndetail();
	List<Tbsellreturndetail> listrd;

	public Tbsellreturndetail getRtnd() {
		return rtnd;
	}

	public void setRtnd(Tbsellreturndetail rtnd) {
		this.rtnd = rtnd;
	}

	public List<Tbsellreturndetail> getListrd() {
		return listrd;
	}

	public void setListrd(List<Tbsellreturndetail> listrd) {
		this.listrd = listrd;
	}

	public Tbsellreturnmain getRtn() {
		return rtn;
	}

	public void setRtn(Tbsellreturnmain rtn) {
		this.rtn = rtn;
	}

	public List<Tbsellreturnmain> getListr() {
		return listr;
	}

	public void setListr(List<Tbsellreturnmain> listr) {
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

	public Tbselldetail getSd() {
		return sd;
	}

	public void setSd(Tbselldetail sd) {
		this.sd = sd;
	}

	public List<Tbselldetail> getListd() {
		return listd;
	}

	public void setListd(List<Tbselldetail> listd) {
		this.listd = listd;
	}

	public Tbsellmain getStore() {
		return store;
	}

	public void setStore(Tbsellmain store) {
		this.store = store;
	}

	public List<Tbsellmain> getList() {
		return list;
	}

	public void setList(List<Tbsellmain> list) {
		this.list = list;
	}

	public Tbclient getS() {
		return s;
	}

	public void setS(Tbclient s) {
		this.s = s;
	}

	public List<Tbclient> getSlist() {
		return slist;
	}

	public void setSlist(List<Tbclient> slist) {
		this.slist = slist;
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

	/*
	 * ��ѯ������
	 */
	public String list(){
		list=service.list(store);
		return "list";
	}
	/*
	 * ��ͻ�����������Ϊ������
	 */
	public String alist(){
		slist=service.slist(s);
		ulist=service.ulist(u);
		return "alist";
	}
	/*
	 * ���ӽ�����
	 */
	public String add(){
		String rtn=service.add(store);
		store=new Tbsellmain();
		return list();
	}
	/*
	 * ��ʼ���޸Ľ���
	 */
	public String tomodify(){
		store=service.detail(store);
		slist=service.slist(s);
		ulist=service.ulist(u);
		return "tomodify";
	}
	/*
	 * �޸�
	 */
	public String modify(){
		service.modify(store);
		store=new Tbsellmain();
		return list();
	}
	/*
	 * ��ѯ����������
	 */
	public String listd(){
		listd=service.listd(sd);
		return "listd";
	}
	/*
	 * �ӽ���������
	 */
	public String adddetail(){
		String rtn=service.adddetail(sd);
		sd=new Tbselldetail();
		return listd();
	}
	/*
	 * ����Ʒ��Ϊ������
	 */
	public String alistd(){
		alistd=service.alistd(good);
		return "alistd";
	}
	/*
	 * ��ʼ���޸Ľ���
	 */
	public String dtomodify(){
		alistd=service.alistd(good);
		sd=service.ddetail(sd);
		return "dtomodify";
	}
	/*
	 * �޸�
	 */
	public String dmodify(){
		service.dmodify(sd);
		sd=new Tbselldetail();
		return listd();
	}
	/*
	 * ��ѯ�˻���
	 */
	public String listr(){
		listr=service.listr(rtn);
		return "listr";
	}
	/*
	 * �����˻���
	 */
	public String addr(){
		String re_turn=service.addr(rtn);
		rtn=new Tbsellreturnmain();
		return listr();
	}
	/*
	 * ��ʼ���޸Ľ���
	 */
	public String tomodifyr(){
		rtn=service.detailr(rtn);
		slist=service.slist(s);
		ulist=service.ulist(u);
		return "tomodifyr";
	}
	/*
	 * �޸�
	 */
	public String modifyr(){
		service.modifyr(rtn);
		rtn=new Tbsellreturnmain();
		return listr();
	}
	/*
	 * ��ѯ�˻�������
	 */
	public String listrd(){
		listrd=service.listrd(rtnd);
		return "listrd";
	}
	/*
	 * ���˻�������
	 */
	public String addrdetail(){
		String rtn=service.addrdetail(rtnd);
		rtnd=new Tbsellreturndetail();
		return listrd();
	}
	/*
	 * ��ʼ���޸Ľ���
	 */
	public String dtomodifyr(){
		alistd=service.alistd(good);
		rtnd=service.ddetailr(rtnd);
		return "dtomodifyr";
	}
	/*
	 * �޸�
	 */
	public String dmodifyr(){
		service.dmodifyr(rtnd);
		rtnd=new Tbsellreturndetail();
		return listrd();
	}
}
