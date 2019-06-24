package com.jason.data.ManyToOne.service.impl;

import com.jason.data.DataApplication;
import com.jason.data.ManyToOne.model.CityDO;
import com.jason.data.ManyToOne.model.NationDO;
import com.jason.data.ManyToOne.repository.CityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataApplication.class)
public class CityServiceImplTest {

    @Autowired
    private CityRepository repository;

    @Test
    public void queryCity() {
        Optional<CityDO> cityDO = repository.findById("402880ef6b84bd5c016b84bda9170000");
        System.out.println(cityDO);
    }

    @Test
    public void queryCity1() {
        CityDO cityDO = new CityDO();
        cityDO.setCityId("402880ef6b84bd5c016b84bda9170000");
        Example<CityDO> example = Example.of(cityDO);
        Optional<CityDO> optional = repository.findOne(example);
        System.out.println(optional);
        System.out.println(optional.get().getNationDO());
    }

    @Test
    public void saveCity() {
        CityDO cityDO = new CityDO();
        cityDO.setCityName("北京");

        Set<CityDO> cities = new HashSet<>();
        cities.add(cityDO);

        NationDO nationDO = new NationDO();
        nationDO.setNationName("中国");
//        nationDO.getCities().add(cityDO);

        cityDO.setNationDO(nationDO);

        CityDO result = repository.save(cityDO);
        System.out.println(result);
    }

    @Test
    public void deleteCity() {
        repository.deleteById("402880ef6b84bd5c016b84bda9170000");
    }

    @Test
    public void queryCities() {
        List<CityDO> list = repository.findAll();
        System.out.println(list);
    }
}