package com.kbot.base.service.impl;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kbot.base.entity.BaseEntity;
import com.kbot.base.service.IBaseService;

/**
 * Program Name: kava-demo-single
 * <p>
 * Description: 
 * <p>
 * Created by kris on 2021/2/5
 *
 * @author kris
 */
public class BaseServiceImpl <M extends BaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements IBaseService<T> {

}
