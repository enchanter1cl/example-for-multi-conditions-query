package com.erato.multi.conditions.query.controller;

import com.erato.multi.conditions.query.entity.Brand;
import com.erato.multi.conditions.query.service.BrandService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌(Brand)表控制层
 *
 * @author zhangyuan
 * @since 2020-10-10 23:11:11
 */
@RestController
@RequestMapping("findByRequired/brand")
public class BrandController {

    @Resource
    private BrandService brandService;
    
    /**
     * Multi conditions query
     * @param name  condition1
     * @param firstLetter   condition2
     * @param sort  condition3
     * @return brands
     */
    @GetMapping("/require")
    public ResponseEntity<List<Brand>> queryByConditions(
            @RequestParam("name") String name,
            @RequestParam("firstLetter") String firstLetter,
            @RequestParam("sort") int sort){
    
        Brand brand = new Brand();
        brand.setName(name);
        brand.setFirstLetter(firstLetter);
        brand.setSort(sort);
        return ResponseEntity.ok(this.brandService.queryByConditions(brand));
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Brand> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.brandService.queryById(id));
    }
    
    /**
     * 新增数据
     *
     * @param brand 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Brand> add(Brand brand) {
        return ResponseEntity.ok(this.brandService.insert(brand));
    }
    
    /**
     * 编辑数据
     *
     * @param brand 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Brand> edit(Brand brand) {
        return ResponseEntity.ok(this.brandService.update(brand));
    }
    
    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.brandService.deleteById(id));
    }
    
}

