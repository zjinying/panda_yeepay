package com.sivalabs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
/*
 * 
 * 
 *生育订单报销
 */
@Entity
@Table(name="social_security_order")
public class SocialSecurityOrder
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column private int id;
    @Column private String insured_id;
    @Column private String userid;
    @Column private String order_id;
    @Column private String totalmoney;
    @Column private String pay_money;
    @Column private String server_money;
    @Column private String city_name;
    @Column private String social_insurance_base;
    @Column private String pay_cycle;
    @Column private String other_discount_code;
    @Column private String discount_money;
    @Column private String status;
    @Column private String is_new;
    @Column private String createtime;
    @Column private String starttime;
    @Column private String endtime;
    @Column private String is_card;
    @Column private String pay_status;
    @Column private String pay_type;
	@Column private String fee;
    @Column private String  remittance_number;
    @Column private String  compensation; //补差金额	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInsured_id() {
		return insured_id;
	}
	public void setInsured_id(String insured_id) {
		this.insured_id = insured_id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(String totalmoney) {
		this.totalmoney = totalmoney;
	}
	public String getPay_money() {
		return pay_money;
	}
	public void setPay_money(String pay_money) {
		this.pay_money = pay_money;
	}
	public String getServer_money() {
		return server_money;
	}
	public void setServer_money(String server_money) {
		this.server_money = server_money;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getSocial_insurance_base() {
		return social_insurance_base;
	}
	public void setSocial_insurance_base(String social_insurance_base) {
		this.social_insurance_base = social_insurance_base;
	}
	public String getPay_cycle() {
		return pay_cycle;
	}
	public void setPay_cycle(String pay_cycle) {
		this.pay_cycle = pay_cycle;
	}
	public String getOther_discount_code() {
		return other_discount_code;
	}
	public void setOther_discount_code(String other_discount_code) {
		this.other_discount_code = other_discount_code;
	}
	public String getDiscount_money() {
		return discount_money;
	}
	public void setDiscount_money(String discount_money) {
		this.discount_money = discount_money;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIs_new() {
		return is_new;
	}
	public void setIs_new(String is_new) {
		this.is_new = is_new;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getIs_card() {
		return is_card;
	}
	public void setIs_card(String is_card) {
		this.is_card = is_card;
	}
	public String getPay_status() {
		return pay_status;
	}
	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getCompensation() {
		return compensation;
	}
	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}
	public String getRemittance_number() {
		return remittance_number;
	}
	public void setRemittance_number(String remittance_number) {
		this.remittance_number = remittance_number;
	}
	
    
}
