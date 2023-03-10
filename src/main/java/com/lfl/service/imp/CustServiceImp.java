package com.lfl.service.imp;

import com.lfl.dao.CustDao;
import com.lfl.pojo.CustomInfo;
import com.lfl.service.CustService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustServiceImp implements CustService {
    @Resource
    CustDao custDao;

    @Override
    public CustomInfo getCustInfo(CustomInfo customInfo) {
//        CustomInfo customInfos = custDao.selectById(1L);
        CustomInfo customInfos = custDao.selectCustInfo(1);
        return customInfos;
    }

//    @Override
//    public CustomInfo getCustInfo(String customInfo) {
//        return null;
//    }
}