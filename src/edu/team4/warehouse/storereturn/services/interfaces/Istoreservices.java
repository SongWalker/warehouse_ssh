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
	 * ���ӽ�����
	 */
	public String add(Tbstoremain store);
	/*
	 * ��ȡ��Ӧ�̶���
	 */
	public List<Tbsupplier> slist(Tbsupplier s);
	/*
	 * ��ȡ������
	 */
	public List<Tbuser> ulist(Tbuser u);
	/*
	 * ��ȡһ���������޸���Ϣ
	 */
	public Tbstoremain detail(Tbstoremain store);
	/*
	 * �޸Ľ�����
	 */
	public String modify(Tbstoremain store);
	/*
	 * �����������
	 */
	public List<Tbstoredetail> listd(Tbstoredetail sd);
	/*
	 * �ӽ���������
	 */
	public String adddetail(Tbstoredetail sd);
	/*
	 * ��ȡ��Ʒ��Ϣ
	 */
	public List<Tbgoodsinfo> alistd(Tbgoodsinfo good);
	/*
	 * ��ȡһ�����������޸���Ϣ
	 */
	public Tbstoredetail ddetail(Tbstoredetail sd);
	/*
	 * �޸Ľ�������
	 */
	public String dmodify(Tbstoredetail sd);
	/*
	 * ��ѯ�˻���
	 */
	public List<Tbstorereturnmain> listr(Tbstorereturnmain rtn);
	/*
	 * �����˻���
	 */
	public String addr(Tbstorereturnmain rtn);
	/*
	 * ��ȡһ���˻����޸���Ϣ
	 */
	public Tbstorereturnmain detailr(Tbstorereturnmain rtn);
	/*
	 * �޸��˻���
	 */
	public String modifyr(Tbstorereturnmain rtn);
	/*
	 * ���˻�������
	 */
	public List<Tbstorereturndetail> listrd(Tbstorereturndetail rtnd);
	/*
	 * ���˻�������
	 */
	public String addrdetail(Tbstorereturndetail rtnd);
	/*
	 * ��ȡһ���˻������޸���Ϣ
	 */
	public Tbstorereturndetail ddetailr(Tbstorereturndetail rtnd);
	/*
	 * �޸��˻�����
	 */
	public String dmodifyr(Tbstorereturndetail rtnd);
}
