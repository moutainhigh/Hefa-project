/*******************************************************************************
 * Project Key : CPPII
 * Create on 2019年4月22日 下午2:17:47
 * Copyright (c) 2018. 爱智造.
 * 注意：本内容仅限于爱智造内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
 
package com.hefa.common.exception;

import com.hefa.common.base.BaseException;
import com.hefa.common.errorcode.SystemErrorCode;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 黄智聪  2019年4月22日 下午2:17:47
 */
public class SystemException extends BaseException{

	private static final long serialVersionUID = -1490110530058331251L;
	
	public SystemException(SystemErrorCode errorCode) {
		super(errorCode);
	}

}

