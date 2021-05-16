package com.activeclub.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author 59456
 * @Date 2021/5/16 20:07
 * @email 2017202120089@whu.edu.cn
 * @Descrip 用于数据库存储的信息继承
 * @Version 1.0
 */
@Data
public class DbModel {

    /**
     * 自增id
     */
    private Long id;

    /**
     * 状态码:-id已删除,0正常,1新增,2修改
     */
    private Long flag;

    /**
     * 唯一码UUID
     */
    private String code;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 更新者
     */
    private String updator;

}
