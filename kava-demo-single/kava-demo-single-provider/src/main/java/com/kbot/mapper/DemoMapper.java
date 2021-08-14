package com.kbot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kbot.demo.Demo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Program Name: kava-demo-single
 * <p>
 * Description: 
 * <p>
 * Created by kris on 2021/2/5
 *
 * @author kris
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
}
