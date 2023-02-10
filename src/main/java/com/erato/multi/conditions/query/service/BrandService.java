package com.erato.multi.conditions.query.service;

import com.erato.multi.conditions.query.entity.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * 品牌(Brand)表服务接口
 *
 * @author zhangyuan
 * @since 2020-10-10 23:11:11
 */
public interface BrandService {
    
    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    Brand queryById(Long brandId);
    
    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand insert(Brand brand);
    
    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand update(Brand brand);
    
    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    boolean deleteById(Long brandId);
    
    List<Brand> queryByConditions(Brand brand);
}
