/*******************************************************************************
 * Project Key : CPPII
 * Create on 2018年10月17日 下午3:59:17
 * Copyright (c) 2018. 爱智造.
 * 注意：本内容仅限于爱智造内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
 
package com.hefa.common.exception;

import com.hefa.common.base.BaseException;
import com.hefa.common.errorcode.ApiRequestErrorCode;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 黄智聪  2018年10月17日 下午3:59:17
 */
public class ApiRequestException extends BaseException{

	private static final long serialVersionUID = 1033118360269922189L;

	public ApiRequestException(ApiRequestErrorCode errorCode) {
		super(errorCode);
	}

	public ApiRequestException(ApiRequestErrorCode errorCode, String extraMessage) {
		super(errorCode, extraMessage);
	}
    
}

