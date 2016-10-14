package edu.team4.warehouse.inventory.services.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import edu.team4.warehouse.informanage.dao.impl.goodsDao;
import edu.team4.warehouse.informanage.dao.interfaces.IGoodsDao;
import edu.team4.warehouse.inventory.dao.interfaces.IrecordDao;
import edu.team4.warehouse.inventory.services.interfaces.IrecordService;
import edu.team4.warehouse.model.Tbgoodsinfo;
import edu.team4.warehouse.model.Tbinventoryrecord;
import edu.team4.warehouse.model.Tbstoredetail;

public class recordService implements IrecordService {
	private IrecordDao dao;
	private IGoodsDao goodsDao;
	

	public IGoodsDao getGoodsDao() {
		return goodsDao;
	}

	public void setGoodsDao(IGoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	public IrecordDao getDao() {
		return dao;
	}

	public void setDao(IrecordDao dao) {
		this.dao = dao;
	}
	
	public List<Tbinventoryrecord> list(Tbinventoryrecord record){
		return dao.list(record);
	}

	public String add(Tbinventoryrecord record) {
		return dao.add(record);
	}
	
	/**
	 * ���ݽ������飬����һ������¼
	 */
	public void addrecord(Tbinventoryrecord record,Tbstoredetail sd){//��ȡ��Ʒ��Ϣ
		try {	
			//System.out.println("��ʼ���Ի�ȡ����..."+sd.getSdNo());     
		Tbgoodsinfo goods=goodsDao.getDetailByGno(sd.getSdNo()).get(0); 
		//System.out.println("��ȡ���"+goods.getGNo());                                                         
		record.setIdDes("���");
		record.setIdGname(goods.getGName());
		record.setIdNum(sd.getSdNumber());
		record.setIdNo(sd.getSdNo());
		record.setIdState(1);
		record.setIdUnit(goods.getGUnit());
		record.setIdDate(new Timestamp(new Date().getTime()));		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����ʱ����");
		}
		dao.addNew(record);
		
	}

	//����ָ������¼��
	public Tbinventoryrecord detail(Tbinventoryrecord record) {
		return dao.detail(record);
	}

	//�ύ�޸�
	public String modify(Tbinventoryrecord record) {
	    return dao.modify(record);
	}

}
