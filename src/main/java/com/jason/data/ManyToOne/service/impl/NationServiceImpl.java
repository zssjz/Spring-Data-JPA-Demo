package com.jason.data.ManyToOne.service.impl;

import com.jason.data.ManyToOne.model.NationDO;
import com.jason.data.ManyToOne.service.NationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationServiceImpl implements NationService {

    @Override
    public NationDO saveNation(NationDO nationDO) {
        return null;
    }

    @Override
    public void deleteNation(String nationId) {

    }

    @Override
    public NationDO queryNation(String nationId) {
        return null;
    }

    @Override
    public NationDO queryNation(NationDO nationDO) {
        return null;
    }

    @Override
    public List<NationDO> nationList(NationDO nationDO) {
        return null;
    }
}
