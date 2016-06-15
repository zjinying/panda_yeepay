package com.sivalabs.common;
/**
 * 参保类型
 * @author dragonwu
 *
 */
public enum InsuredTypeEnum {
	
	PERSON("个人参保",0),
	COMPANY("公司参保",1);
	
	private int type;
	private String name;
	
	private InsuredTypeEnum(String name,int type){
		this.name = name;
		this.type = type;
	}
	public int getType() {
		return type;
	}
	public String getName() {
		return name;
	}
}
