package com.etong.information.data.server;

import com.etong.pt.utility.PtResult;

/**
 * Created by Administrator on 2015/10/14.
 */
public interface InformationData {

    PtResult getLastMaintrainInfoReqeust(String lationTel, String plateNum);
}
