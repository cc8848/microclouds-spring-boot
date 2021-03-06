package com.microclouds.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.microclouds.dao.UserLogMapper;
import com.microclouds.entity.UserLog;
import com.microclouds.service.IUserLogService;
import org.springframework.stereotype.Service;

/**
 * @description : 日志的服务层
 * @author: https://github.com/Fanqie22
 * @date : 2019年1月16日
 */
@Service
public class LogServiceImpl extends ServiceImpl<UserLogMapper, UserLog> implements IUserLogService {

}
