package edu.wjl.lanlan.condition;

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

    /**
     * 每一个根据标签的条件 根据业务起名
     * 条件写好了，直接对应标签就可以起，建议检查呢一下条件
     *
     */
    public boolean tag1;
    public boolean tag2;


    public FilterCondition(Integer age, String houseProperty, Integer assetType, String maritalStatus, String profession) {
        this.age = age;
        this.houseProperty = houseProperty;
        this.assetType = assetType;
        this.maritalStatus = maritalStatus;
        this.profession = profession;

        /**
         *
         */
        tag1 = this.age >= FilterConditionConstants.AGE_THIRTY_FIVE && FilterConditionConstants.HOUSE_HAVE.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_SPECIAL_HIGH.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag2 = this.age <= FilterConditionConstants.AGE_THIRTY && this.age >= FilterConditionConstants.AGE_NINETEEN && FilterConditionConstants.HOUSE_NOT_REQUIRED.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_HIGH.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag3 = this.age > FilterConditionConstants.AGE_THIRTY && FilterConditionConstants.HOUSE_HAVE.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_HIGH.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag4 = this.age <= FilterConditionConstants.AGE_THIRTY_FIVE && FilterConditionConstants.AGE_NINETEEN <= this.age && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag5 = this.age >= FilterConditionConstants.AGE_THIRTY && this.age <= FilterConditionConstants.AGE_FORTY_FIVE && FilterConditionConstants.HOUSE_HAVE.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_HAVE.equals(this.maritalStatus);
//        tag6 = this.age <= FilterConditionConstants.AGE_THIRTY && FilterConditionConstants.AGE_NINETEEN <= this.age && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_LOW.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag7 = this.age <= FilterConditionConstants.AGE_THIRTY_FIVE && FilterConditionConstants.AGE_NINETEEN <= this.age && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_LOW.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_HAVE.equals(this.maritalStatus);
//
//        tag8 = this.age > FilterConditionConstants.AGE_THIRTY && FilterConditionConstants.HOUSE_HAVE.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_SPECIAL_HIGH.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag9 = this.age <= FilterConditionConstants.AGE_THIRTY && this.age >= FilterConditionConstants.AGE_NINETEEN && FilterConditionConstants.HOUSE_NOT_REQUIRED.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_HIGH.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag10 = this.age > FilterConditionConstants.AGE_THIRTY && FilterConditionConstants.HOUSE_HAVE.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_HIGH.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag11 = this.age <= FilterConditionConstants.AGE_THIRTY && this.age >= FilterConditionConstants.AGE_NINETEEN && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag12 = this.age >= FilterConditionConstants.AGE_THIRTY_FIVE && this.age <= FilterConditionConstants.AGE_FORTY_FIVE && FilterConditionConstants.HOUSE_HAVE.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_HAVE.equals(this.maritalStatus);
//        tag13 = this.age <= FilterConditionConstants.AGE_THIRTY && this.age >= FilterConditionConstants.AGE_NINETEEN && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_LOW.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_NOT_REQUIRED.equals(this.maritalStatus);
//        tag14 = this.age <= FilterConditionConstants.AGE_THIRTY_FIVE && this.age >= FilterConditionConstants.AGE_NINETEEN && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_LOW.equals(this.assetType) && FilterConditionConstants.MARITALSTATUS_HAVE.equals(this.maritalStatus);
//
//        tag15 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_TWENTY_FIVE && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_LOW.equals(this.assetType) && FilterConditionConstants.PROFESSION_STUDENT.equals(this.profession);
//        tag16 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_TWENTY_FIVE && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.PROFESSION_STUDENT.equals(this.profession);
//        tag17 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_THIRTY_FIVE && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.PROFESSION_STAFF.equals(this.profession);
//        tag18 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_THIRTY_FIVE && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_LOW.equals(this.assetType) && FilterConditionConstants.PROFESSION_NOT_REQUIRED.equals(this.profession);
//        tag19 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_THIRTY_FIVE && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.PROFESSION_NOT_REQUIRED.equals(this.profession);
//        tag20 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_FORTY && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_HIGH.equals(this.assetType) && FilterConditionConstants.PROFESSION_NOT_REQUIRED.equals(this.profession);
//
//        tag21 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_TWENTY_FIVE && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_LOW.equals(this.assetType) && FilterConditionConstants.PROFESSION_STUDENT.equals(this.profession);
//        tag22 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_TWENTY_FIVE && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.PROFESSION_STUDENT.equals(this.profession);
//        tag23 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_THIRTY && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.PROFESSION_STAFF.equals(this.profession);
//        tag24 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_THIRTY && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_LOW.equals(this.assetType) && FilterConditionConstants.PROFESSION_NOT_REQUIRED.equals(this.profession);
//        tag25 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_THIRTY && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_MIDDLE.equals(this.assetType) && FilterConditionConstants.PROFESSION_NOT_REQUIRED.equals(this.profession);
//        tag26 = this.age >= FilterConditionConstants.AGE_NINETEEN && this.age <= FilterConditionConstants.AGE_FORTY && FilterConditionConstants.HOUSE_UNKNOWN.equals(this.houseProperty) && FilterConditionConstants.ASSETTYPE_HIGH.equals(this.assetType) && FilterConditionConstants.PROFESSION_NOT_REQUIRED.equals(this.profession);

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
