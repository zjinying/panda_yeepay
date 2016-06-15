package com.sivalabs.common;

import com.sivalabs.utils.ConfigReader;

public class Consts {
	public static String IMG_HEAD = ConfigReader.getValue("ftp.path.headimg");
	public static String IMG_IDCARD = ConfigReader.getValue("ftp.path.idcard");
	public static String DEFAULT_PARAM = "req";
	public static String ENCODING = "UTF-8";
	public static String IMG_JPG = ".jpg";
}
