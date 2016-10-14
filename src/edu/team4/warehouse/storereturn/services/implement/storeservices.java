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
	 * ��ѯ������
	 */
	public List<Tbstoremain> list(Tbstoremain store) {
		return dao.list(store);
	}
	/*
	 * ���ӽ�����
	 */
	public String add(Tbstoremain store) {
		return dao.add(store);
	}
	/*
	 * ��ѯ��Ӧ����������
	 */
	public List<Tbsupplier> slist(Tbsupplier s) {
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
	public Tbstoremain detail(Tbstoremain store) {
		return dao.detail(store);
	}
	/*
	 * �޸Ľ�����
	 */
	public String modify(Tbstoremain store) {
		return dao.modify(store);
	}
	/*
	 * �����������
	 */
	public List<Tbstoredetail> listd(Tbstoredetail sd) {
		return dao.listd(sd);
	}
	/*
	 * �ӽ���������,ͬʱ����һ������¼
	 */
	@SuppressWarnings("finally")
	public String adddetail(Tbstoredetail sd) {
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
	public Tbstoredetail ddetail(Tbstoredetail sd) {
		return dao.ddetail(sd);
	}
	/*
	 * �޸Ľ�������
	 */
	public String dmodify(Tbstoredetail sd) {
		return dao.dmodify(sd);
	}
	/*
	 * ��ѯ�˻���
	 */
	public List<Tbstorereturnmain> listr(Tbstorereturnmain rtn) {
		return dao.listr(rtn);
	}
	/*
	 * �����˻���
	 */
	public String addr(Tbstorereturnmain rtn) {
		return dao.addr(rtn);
	}
	/*
	 * ��һ���˻�����Ϣ
	 */
	public Tbstorereturnmain detailr(Tbstorereturnmain rtn) {
		return dao.detailr(rtn);
	}
	/*
	 * �޸��˻���
	 */
	public String modifyr(Tbstorereturnmain rtn) {
		return dao.modifyr(rtn);
	}
	/*
	 * ���˻�������
	 */
	public List<Tbstorereturndetail> listrd(Tbstorereturndetail rtnd) {
		return dao.listrd(rtnd);
	}
	/*
	 * ���˻�������
	 */
	public String addrdetail(Tbstorereturndetail rtnd) {
		return dao.addrdetail(rtnd);
	}
	/*
	 * ��һ���˻�����Ϣ
	 */
	public Tbstorereturndetail ddetailr(Tbstorereturndetail rtnd) {
		return dao.ddetailr(rtnd);
	}
	/*
	 * �޸��˻�����
	 */
	public String dmodifyr(Tbstorereturndetail rtnd) {
		return dao.dmodifyr(rtnd);
	}
}
