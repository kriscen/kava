package com.kbot.service.impl;

import com.kbot.base.service.impl.BaseServiceImpl;
import com.kbot.demo.Demo;
import com.kbot.mapper.DemoMapper;
import com.kbot.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * Program Name: kava-demo-single
 * <p>
 * Description:
 * <p>
 * Created by kris on 2021/2/5
 *
 * @author kris
 */
@Service
public class DemoImpl extends BaseServiceImpl<DemoMapper, Demo> implements IDemoService {
}
