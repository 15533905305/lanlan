package edu.wjl.lanlan;

import com.aliyun.odps.udf.UDF;

import java.util.ArrayList;
import java.util.List;

/**
 * @author junli wang
 * @date 18-9-16
 */

public class ConditionFunction extends UDF {


    /**
     * 根据参数获取参数标签
     *
     * @param str
     * @return
     */
    public String getTags(String str) {


        String[] split = str.split(",");
        Integer age = Integer.valueOf(split[0]);
        String houseProperty = "" + split[1];
        Integer assetType = Integer.valueOf(split[2]);
        String maritalStatus = "" + split[3];
        String profession = "" + split[4];
        FilterCondition filterCondition = new FilterCondition(age,houseProperty,assetType,maritalStatus,profession);

        List tagList = new ArrayList();
        if (filterCondition.tag1 == true) {
            tagList.add("tag1");
        }


        return str+ tagList.toString();
    }


    public static void main(String[] args) {
        ConditionFunction conditionFunction = new ConditionFunction();
        String tags = conditionFunction.getTags("36,有房,1,/,/");
        System.out.println(tags);
    }
}
