package com.kbot.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Program Name: kava-demo-single
 * <p>
 * Description: 
 * <p>
 * Created by cenfh on 2021/2/5
 *
 * @author cenfh
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -4557993127034740776L;

    @TableField("created")
    private Timestamp created;

    @TableField("modified")
    private Timestamp modified;
}
