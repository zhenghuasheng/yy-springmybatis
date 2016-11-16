package com.etong.information.data.mapper;

import com.etong.information.data.model.RepairInfo;

import java.util.Map;

/**
 * Created by Administrator on 2015/10/14.
 */
public interface RepairInfoMapper {

   RepairInfo loadLastRepairInfo(Map map);
}
