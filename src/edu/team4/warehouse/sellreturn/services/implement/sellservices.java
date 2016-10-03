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
	 * ��ѯ������
	 */
	public List<Tbsellmain> list(Tbsellmain store) {
		return dao.list(store);
	}
	/*
	 * ���ӽ�����
	 */
	public String add(Tbsellmain store) {
		return dao.add(store);
	}
	/*
	 * ��ѯ��Ӧ����������
	 */
	public List<Tbclient> slist(Tbclient s) {
		return dao.slist(s);
	}
	/*
	 * ��ѯ��������������
	 */
	public List<Tbuser> ulist(Tbuser u) {
		return dao.ulist(u);
	}
	/*
	 * ��һ����������Ϣ
	 */
	public Tbsellmain detail(Tbsellmain store) {
		return dao.detail(store);
	}
	/*
	 * �޸Ľ�����
	 */
	public String modify(Tbsellmain store) {
		return dao.modify(store);
	}
	/*
	 * �����������
	 */
	public List<Tbselldetail> listd(Tbselldetail sd) {
		return dao.listd(sd);
	}
	/*
	 * �ӽ���������
	 */
	public String adddetail(Tbselldetail sd) {
		return dao.adddetail(sd);
	}
	/*
	 * ����Ʒ����������
	 */
	public List<Tbgoodsinfo> alistd(Tbgoodsinfo good) {
		return dao.alistd(good);
	}
	/*
	 * ��һ����������Ϣ
	 */
	public Tbselldetail ddetail(Tbselldetail sd) {
		return dao.ddetail(sd);
	}
	/*
	 * �޸Ľ�������
	 */
	public String dmodify(Tbselldetail sd) {
		return dao.dmodify(sd);
	}
	/*
	 * ��ѯ�˻���
	 */
	public List<Tbsellreturnmain> listr(Tbsellreturnmain rtn) {
		return dao.listr(rtn);
	}
	/*
	 * �����˻���
	 */
	public String addr(Tbsellreturnmain rtn) {
		return dao.addr(rtn);
	}
	/*
	 * ��һ���˻�����Ϣ
	 */
	public Tbsellreturnmain detailr(Tbsellreturnmain rtn) {
		return dao.detailr(rtn);
	}
	/*
	 * �޸��˻���
	 */
	public String modifyr(Tbsellreturnmain rtn) {
		return dao.modifyr(rtn);
	}
	/*
	 * ���˻�������
	 */
	public List<Tbsellreturndetail> listrd(Tbsellreturndetail rtnd) {
		return dao.listrd(rtnd);
	}
	/*
	 * ���˻�������
	 */
	public String addrdetail(Tbsellreturndetail rtnd) {
		return dao.addrdetail(rtnd);
	}
	/*
	 * ��һ���˻�����Ϣ
	 */
	public Tbsellreturndetail ddetailr(Tbsellreturndetail rtnd) {
		return dao.ddetailr(rtnd);
	}
	/*
	 * �޸��˻�����
	 */
	public String dmodifyr(Tbsellreturndetail rtnd) {
		return dao.dmodifyr(rtnd);
	}
}
