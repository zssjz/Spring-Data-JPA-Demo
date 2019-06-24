package com.jason.data.ManyToOne.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "district_nation")
@org.hibernate.annotations.Table(appliesTo = "district_nation", comment = "国家地区表")
public class NationDO {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "NATION_ID")
    private String NationId;

    @Column(name = "NATION_NAME", columnDefinition = "VARCHAR(64) NOT NULL COMMENT '国家或地区名称'")
    private String nationName;

    @OneToMany(mappedBy = "nationDO")
    private Set<CityDO> cityDO;

    public String getNationId() {
        return NationId;
    }

    public void setNationId(String nationId) {
        NationId = nationId;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public Set<CityDO> getCityDO() {
        return cityDO;
    }

    public void setCityDO(Set<CityDO> cityDO) {
        this.cityDO = cityDO;
    }

    @Override
    public String toString() {
        return "NationDO{" +
                "NationId='" + NationId + '\'' +
                ", nationName='" + nationName + '\'' +
                '}';
    }
}
