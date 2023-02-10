package com.erato.multi.conditions.query.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 品牌(Brand)实体类
 *
 * @author zhangyuan
 * @since 2023-02-10 22:10:36
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand implements Serializable {
    private static final long serialVersionUID = 986843473004039492L;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 品牌名
     */
    private String name;
    /**
     * 品牌logo地址
     */
    private String logo;
    /**
     * 介绍
     */
    private String description;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Integer showStatus;
    /**
     * 检索首字母
     */
    private String firstLetter;
    /**
     * 排序
     */
    private Integer sort;
}

