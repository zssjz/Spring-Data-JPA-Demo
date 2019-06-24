package com.jason.data.ManyToOne.service;

import com.jason.data.ManyToOne.model.CityDO;

import java.util.List;

public interface CityService {

    /**
     * 获取CityDO
     * @param cityId
     * @return
     */
    CityDO queryCity(String cityId);

    /**
     * 获取CityDO
     * @param cityDO
     * @return
     */
    CityDO queryCity(CityDO cityDO);

    /**
     * 新增或修改
     * @param cityDO
     * @return
     */
    CityDO saveCity(CityDO cityDO);

    /**
     * 删除
     * @param cityId
     * @return
     */
    CityDO deleteCity(String cityId);

    /**
     * 查询城市列表
     * @param cityDO
     * @return
     */
    List<CityDO> queryCities(CityDO cityDO);
}
