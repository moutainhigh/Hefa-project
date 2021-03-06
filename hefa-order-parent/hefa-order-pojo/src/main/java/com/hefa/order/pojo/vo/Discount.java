/*******************************************************************************
 * Project Key : CPPII
 * Create on 2019年5月24日 下午9:22:42
 * Copyright (c) 2018. 爱智造.
 * 注意：本内容仅限于爱智造内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
 
package com.hefa.order.pojo.vo;

import java.math.BigDecimal;

import lombok.Data;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 黄智聪  2019年5月24日 下午9:22:42
 */
@Data
public class Discount {

	// 购买数量区间
	private String productQuantitySection;
	
	// 折扣系数区间
	private String productDiscountSection;
	
	// 零头区间
	private String productTipSection;
	
	private BigDecimal productPrice;

}

