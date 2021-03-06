/*******************************************************************************
 * Project Key : CPPII
 * Create on 2019年4月24日 下午6:48:52
 * Copyright (c) 2018. 爱智造.
 * 注意：本内容仅限于爱智造内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
 
package com.hefa.order.pojo.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 黄智聪  2019年4月24日 下午6:48:52
 */
@Data
public class InvoiceDetail {
	
	private String invoiceCode;
	private BigDecimal amount;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd hh:mm:ss")
	private Date invoiceCreateTime;
	private Byte invoiceStatus;
	private String orderCode;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd hh:mm:ss")
	private Date orderTime;
	private String remark;
	private Byte invoiceType;
	private String invoiceTitle;
	private String taxIdentificationNumber;
	private String companyName;
	private String regAddress;
	private String regTelephone;
	private String bank;
	private String bankAccount;
	private String provinceName;
	private String cityName;
	private String areaName;
	private String detailAddress;
	private String receiverName;
	private String receiverPhoneNumber;
	private String deliveryPerson;
	private String deliveryPhone;
	private Byte deliveryType;
	private String number;
	private String expressCompanyName;
	
	private List<OrderItemInfo> orderItemInfos;
}

