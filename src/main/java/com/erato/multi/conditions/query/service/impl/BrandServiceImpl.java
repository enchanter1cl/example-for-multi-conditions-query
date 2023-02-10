package com.erato.multi.conditions.query.service.impl;

import com.erato.multi.conditions.query.entity.Brand;
import com.erato.multi.conditions.query.dao.BrandDao;
import com.erato.multi.conditions.query.service.BrandService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌(Brand)表服务实现类
 *
 * @author zhangyuan
 * @since 2020-10-10 23:11:11
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;
    
    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    @Override
    public Brand queryById(Long brandId) {
        return this.brandDao.queryById(brandId);
    }
    
    /**
     * Multi conditions query
     * @param brand  condition entity
     * @return brands
     */
    @Override
    public List<Brand> queryByConditions(Brand brand) {
        return brandDao.findByRequired(brand);
    }
    
    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand insert(Brand brand) {
        this.brandDao.insert(brand);
        return brand;
    }
    
    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand update(Brand brand) {
        this.brandDao.update(brand);
        return this.queryById(brand.getBrandId());
    }
    
    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long brandId) {
        return this.brandDao.deleteById(brandId) > 0;
    }
    
}
