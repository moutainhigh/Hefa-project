package com.hefa.order.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hefa.common.base.JsonResult;
import com.hefa.common.page.Pagination;
import com.hefa.order.client.service.ClientInvoiceService;
import com.hefa.order.pojo.bo.ApplyInvoiceParam;
import com.hefa.order.pojo.bo.SearchInvoiceInfoParam;
import com.hefa.order.pojo.vo.InvoiceDetail;
import com.hefa.order.pojo.vo.InvoiceInfo;

/**
 * 
 * <P>开票</P>
 * @version 1.0
 * @author 黄智聪  2019年4月25日 上午11:15:25
 */
@RestController
@RequestMapping("/hefa/api/client/invoice")
public class ClientInvoiceController {
	
	@Autowired
	private ClientInvoiceService invoiceService;
	
	/**
	 * 
	 * <p>查询开票信息列表</p>
	 * @param param
	 * @return
	 * @author 黄智聪  2019年4月24日 下午7:04:36
	 */
	@RequestMapping("/getInvoiceInfos")
	public JsonResult<Pagination<InvoiceInfo>> getInvoiceInfos(@RequestBody SearchInvoiceInfoParam param){
		return invoiceService.getInvoiceInfos(param);
	}
	
	/**
	 * 
	 * <p>查询发票详情</p>
	 * @param invoiceCode
	 * @return
	 * @author 黄智聪  2019年4月24日 下午7:00:10
	 */
	@RequestMapping("/getInvoiceDetail")
	public JsonResult<InvoiceDetail> getInvoiceDetail(@RequestParam("invoiceCode") String invoiceCode){
		return invoiceService.getInvoiceDetail(invoiceCode);
	}
	
	/**
	 * 
	 * <p>开票申请</p>
	 * @param param
	 * @return
	 * @author 黄智聪  2019年4月26日 上午11:06:28
	 */
	@RequestMapping("/invoiceApply")
	public JsonResult<String> invoiceApply(@RequestBody ApplyInvoiceParam param){
		return invoiceService.invoiceApply(param);
	}

}
