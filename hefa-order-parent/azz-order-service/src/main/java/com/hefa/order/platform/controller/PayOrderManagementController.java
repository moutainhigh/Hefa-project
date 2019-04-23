package com.hefa.order.platform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hefa.common.base.JsonResult;
import com.hefa.common.page.Pagination;
import com.hefa.order.platform.bo.PayOrderListParam;
import com.hefa.order.platform.service.PayOrderManagementService;
import com.hefa.order.platform.vo.PayListInfo;
import com.hefa.order.platform.vo.PayOrderInfo;

/**
 * @author THINK
 * 订单支付管理
 */
@RestController
@RequestMapping("/hefa/api/pay/order")
public class PayOrderManagementController {
	
	//logger
	private static final Logger logger = LoggerFactory.getLogger(PayOrderManagementController.class);
	
	@Autowired
	private PayOrderManagementService payOrderManagementService;
	
	/**
	 * 
	 * <p>查询平台客户订单列表</p>
	 * @param param
	 * @return
	 * @author jonly  
	 */
	@RequestMapping("/getPlatPayOrderList")
	public JsonResult<Pagination<PayListInfo>> getClientOrderInfoList(@RequestBody PayOrderListParam param){
		return payOrderManagementService.getPlatPayOrderList(param);
	}
	
	/**
	 * 
	 * <p>平台客户订单详情</p>
	 * @param param
	 * @return
	 * @author jonly  
	 */
	@RequestMapping("/getPlatPayOrderInfo")
	public JsonResult<PayOrderInfo> getPlatPayOrderInfo(@RequestParam("orderNumber") String orderNumber){
		return payOrderManagementService.getPlatPayOrderInfo(orderNumber);
	}
}
