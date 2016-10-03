package edu.team4.warehouse.sellreturn.services.interfaces;

import java.util.List;

import edu.team4.warehouse.model.Tbclient;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbselldetail;
import edu.team4.warehouse.model.Tbsellmain;
import edu.team4.warehouse.model.Tbsellreturndetail;
import edu.team4.warehouse.model.Tbsellreturnmain;
import edu.team4.warehouse.model.Tbuser;

public interface Isellservices {
	public List<Tbsellmain> list(Tbsellmain store);
	/*
	 * ���ӽ�����
	 */
	public String add(Tbsellmain store);
	/*
	 * ��ȡ��Ӧ�̶���
	 */
	public List<Tbclient> slist(Tbclient s);
	/*
	 * ��ȡ������
	 */
	public List<Tbuser> ulist(Tbuser u);
	/*
	 * ��ȡһ���������޸���Ϣ
	 */
	public Tbsellmain detail(Tbsellmain store);
	/*
	 * �޸Ľ�����
	 */
	public String modify(Tbsellmain store);
	/*
	 * �����������
	 */
	public List<Tbselldetail> listd(Tbselldetail sd);
	/*
	 * �ӽ���������
	 */
	public String adddetail(Tbselldetail sd);
	/*
	 * ��ȡ��Ʒ��Ϣ
	 */
	public List<Tbgoodsinfo> alistd(Tbgoodsinfo good);
	/*
	 * ��ȡһ�����������޸���Ϣ
	 */
	public Tbselldetail ddetail(Tbselldetail sd);
	/*
	 * �޸Ľ�������
	 */
	public String dmodify(Tbselldetail sd);
	/*
	 * ��ѯ�˻���
	 */
	public List<Tbsellreturnmain> listr(Tbsellreturnmain rtn);
	/*
	 * �����˻���
	 */
	public String addr(Tbsellreturnmain rtn);
	/*
	 * ��ȡһ���˻����޸���Ϣ
	 */
	public Tbsellreturnmain detailr(Tbsellreturnmain rtn);
	/*
	 * �޸��˻���
	 */
	public String modifyr(Tbsellreturnmain rtn);
	/*
	 * ���˻�������
	 */
	public List<Tbsellreturndetail> listrd(Tbsellreturndetail rtnd);
	/*
	 * ���˻�������
	 */
	public String addrdetail(Tbsellreturndetail rtnd);
	/*
	 * ��ȡһ���˻������޸���Ϣ
	 */
	public Tbsellreturndetail ddetailr(Tbsellreturndetail rtnd);
	/*
	 * �޸��˻�����
	 */
	public String dmodifyr(Tbsellreturndetail rtnd);
}
