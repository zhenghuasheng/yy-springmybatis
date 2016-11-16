package com.etong.information.data.server;

import com.etong.information.data.mapper.RepairInfoMapper;
import com.etong.information.data.model.RepairInfo;
import com.etong.pt.utility.PtCommonError;
import com.etong.pt.utility.PtResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Administrator on 2015/10/14.
 */
@Service(value ="informationData")
public class InformationDataImpl implements InformationData {

    private RepairInfoMapper repairInfoMapper;

    @Autowired
    public void setRepairInfoMapper(RepairInfoMapper repairInfoMapper) {
        this.repairInfoMapper = repairInfoMapper;
    }

    @Override
    public PtResult getLastMaintrainInfoReqeust(String lationTel, String plateNum) {

        Map<String,Object>map=new HashMap();
        map.put("lationTel", "%" + lationTel + "%");
        if (plateNum!=null){
            StringBuffer sbf=new StringBuffer(plateNum);
            sbf.insert(2,"%");
            map.put("plateNum", "%" + sbf.toString() + "%");
        }
        RepairInfo repairInfo= repairInfoMapper.loadLastRepairInfo(map);
        if (repairInfo==null){
            return new PtResult(PtCommonError.PT_ERROR_NODATA,null,null);
        }
        return new PtResult(PtCommonError.PT_ERROR_SUCCESS,null,repairInfo);

    }
}
