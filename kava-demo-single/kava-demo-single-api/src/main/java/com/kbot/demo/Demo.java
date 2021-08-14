package com.kbot.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kbot.base.entity.BaseEntity;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * Program Name:
 * <p>
 * Description: 
 * <p>
 * Created by kris on 2021/2/5
 *
 * @author kris
 */
@Data
@SuperBuilder
@TableName("t_demo")
public class Demo extends BaseEntity {
    private static final long serialVersionUID = -7747828495556734990L;

    @TableId(type = IdType.ASSIGN_UUID)
    String id;

    @TableField("name")
    String name;
}
