package com.whoiszxl.zero.service;

import com.whoiszxl.zero.entity.dto.impl.SpuDetailAttrGroupInterface;

import java.util.List;

/**
 * 商品属性服务
 *
 * @author whoiszxl
 * @date 2021/4/12
 */
public interface ProductAttributeValueService {

    /**
     * 通过商品Id和商品的三级分类Id获取基础属性分组信息
     * @param productId 商品ID
     * @param categoryId 商品所属三级分类ID
     * @return
     */
    List<SpuDetailAttrGroupInterface> getProductGroupAttrsBySpuId(Long productId, Long categoryId);
}
