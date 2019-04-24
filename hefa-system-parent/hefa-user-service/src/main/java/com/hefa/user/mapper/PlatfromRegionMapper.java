package com.hefa.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hefa.user.pojo.PlatformRegion;
import com.hefa.user.pojo.bo.RegionUserParam;
import com.hefa.user.pojo.vo.RegionUserInfo;

@Mapper
public interface PlatfromRegionMapper {
	
	/**
	 * 获取售后区域列表
	 * @return
	 */
	List<RegionUserInfo> getRegionList(RegionUserParam param);
	
	/**
	 * 保存区域
	 * @param pr
	 * @return
	 */
	int insertSelective(PlatformRegion pr);
}
