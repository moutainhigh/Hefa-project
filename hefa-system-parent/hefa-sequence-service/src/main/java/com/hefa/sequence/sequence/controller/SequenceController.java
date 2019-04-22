/*******************************************************************************
 * Project Key : CPPII
 * Create on 2018年10月24日 下午4:32:29
 * Copyright (c) 2018. 爱智造.
 * 注意：本内容仅限于爱智造内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
 
package com.hefa.sequence.sequence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hefa.sequence.sequence.service.PlatDeptSequenceService;
import com.hefa.sequence.sequence.service.PlatEmployeeSequenceService;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 刘建麟  2018年10月24日 下午4:32:29
 */
@RestController
@RequestMapping("/hefa/api/sequence")
public class SequenceController {

	
	@Autowired
	private PlatEmployeeSequenceService platEmployeeSequenceService;
	
	
	@Autowired
	private PlatDeptSequenceService platDeptSequenceService;
    /**
     * <p></p>
     * @return
     * @author 2019年2月18日 下午3:55:08
     */
    @RequestMapping(value="getPlatEmployeeNumber",method=RequestMethod.GET)
    public String getPlatEmployeeNumber() {
        return platEmployeeSequenceService.getSequence();
    }
    
    /**
	 * <p>平台端  部门编号</p>
	 * @return
	 * @author 刘建麟  2018年10月24日 下午4:37:16
	 */
	@RequestMapping(value="getPlatDepartmentNumber",method=RequestMethod.GET)
	public String getPlatDepartmentNumber() {
		return platDeptSequenceService.getSequence();
	}
    
}

