package edu.wjl.lanlan.demo;

import com.aliyun.odps.udf.UDF;
import edu.wjl.lanlan.condition.FilterCondition;
import edu.wjl.lanlan.constants.FilterConditionConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * @author junli wang
 * @date 18-9-16
 */

public class ConditionFunction extends UDF {


    public static String splitStr = ";";

    /**
     * 根据参数获取参数标签
     *
     * @param str
     * @return
     */
    public String getTags(String str) {

        String[] split = str.split(",");
        FilterCondition filterCondition;
        try {
            Integer age = Integer.valueOf(split[0]);
            String houseProperty = "" + split[1];
            Integer assetType = Integer.valueOf(split[2]);
            String maritalStatus = "" + split[3];
            String profession = "" + split[4];
            filterCondition = new FilterCondition(age, houseProperty, assetType, maritalStatus, profession);
        } catch (Exception e) {
            throw new RuntimeException("拆分字符串发生异常" + e.getMessage());
        }

        List tagList = getTagList(filterCondition);
        return str + splitStr + tagList.toString();
    }


    /**
     * 根据filterCondition对象获取tagList
     *
     * @param filterCondition
     * @return
     */
    public List<String> getTagList(FilterCondition filterCondition) {
        List<String> tagList = new ArrayList<String>();
        if (filterCondition.tag1 == true) {
            /**
             * TAG1 定义在FilterConditionConstants类中根据具体业务打标签名称
             *
             * 只写两个其他的在用if然后往tagList添加
             */
            tagList.add(FilterConditionConstants.TAG1);
        }
        if (filterCondition.tag2 == true) {
            tagList.add(FilterConditionConstants.TAG2);
        }
        return tagList;
    }

    public static void main(String[] args) {
        ConditionFunction conditionFunction = new ConditionFunction();
        String tags = conditionFunction.getTags("36,有房,1,/,/");
        System.out.println(tags);
    }
}
