package edu.team4.warehouse.Util;


public class ChkUtil {
	/**
	 * 验证是否为空
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
