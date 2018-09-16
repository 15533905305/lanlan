package edu.wjl.lanlan;

import edu.wjl.lanlan.constants.FilterConditionConstants;

/**
 * 过滤条件
 *
 * @author junli wang
 * @date 18-9-16
 */

public class FilterCondition {

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 房产
     */
    private String houseProperty;

    /**
     * 资产等级
     */
    private Integer assetType;

    /**
     * 婚姻状况
     */
    private String maritalStatus;

    /**
     * 职业
     */
    private String profession;

    public boolean tag1 =false;


    public FilterCondition(Integer age, String houseProperty, Integer assetType, String maritalStatus, String profession) {
        this.age = age;
        this.houseProperty = houseProperty;
        this.assetType = assetType;
        this.maritalStatus = maritalStatus;
        this.profession = profession;
        tag1 = age > FilterConditionConstants.AGE_THIRTY_FIVE && FilterConditionConstants.HOUSE_HAVE.equals(houseProperty) && FilterConditionConstants.ASSETTYPE_SPECIAL_HIGH.equals(assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(maritalStatus);
    }



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHouseProperty() {
        return houseProperty;
    }

    public void setHouseProperty(String houseProperty) {
        this.houseProperty = houseProperty;
    }

    public Integer getAssetType() {
        return assetType;
    }

    public void setAssetType(Integer assetType) {
        this.assetType = assetType;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
