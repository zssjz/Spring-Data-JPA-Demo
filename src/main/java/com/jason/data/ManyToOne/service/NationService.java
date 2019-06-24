package com.jason.data.ManyToOne.service;

import com.jason.data.ManyToOne.model.NationDO;

import java.util.List;

public interface NationService {

    /**
     * 保存或修改国家地区
     * @param nationDO
     * @return
     */
    NationDO saveNation(NationDO nationDO);

    /**
     * 删除
     * @param nationId
     */
    void deleteNation(String nationId);

    /**
     * 查询
     * @param nationId
     * @return
     */
    NationDO queryNation(String nationId);

    /**
     * 查询
     * @param nationDO
     * @return
     */
    NationDO queryNation(NationDO nationDO);

    /**
     * 查询
     * @param nationDO
     * @return
     */
    List<NationDO> nationList(NationDO nationDO);
}
