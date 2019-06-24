package com.jason.data.ManyToOne.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "district_city")
@org.hibernate.annotations.Table(appliesTo = "district_city", comment = "地区城市表")
public class CityDO {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "CITY_ID")
    private String cityId;

    @Column(name = "CITY_NAME", columnDefinition = "VARCHAR(64) NOT NULL COMMENT '城市名称'")
    private String cityName;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumn(name = "NATION_ID")
    private NationDO nationDO;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public NationDO getNationDO() {
        return nationDO;
    }

    public void setNationDO(NationDO nationDO) {
        this.nationDO = nationDO;
    }

    @Override
    public String toString() {
        return "CityDO{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
