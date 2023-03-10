package com.lfl.service;

import com.lfl.pojo.CustomInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustService {
    CustomInfo getCustInfo(CustomInfo customInfo);

    // 同时启用这两个方法会报错但是不会影响服务启动，根据mybatisplus版本不同有不同的处理，当前版本会加载第一个同名方法，后续同名方法实际使用sql
    // 是第一个同名方法的sql。
    // CustomInfo getCustInfo(String customInfo);
}
