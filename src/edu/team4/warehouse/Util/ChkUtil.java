package edu.team4.warehouse.Util;


public class ChkUtil {
	/**
	 * ��֤�Ƿ�Ϊ��
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNullOrEmpty(Object value) {
		if (value == null || String.valueOf(value).trim().length() < 1) {
			return true;
		}
		return false;

	}
}
