package com.young;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    String json = "[" +
            "{'ID':463,'登录名':'阿阳','姓名':'ton','手机号码':'17521289783','会员等级':'青铜会员','性别':'男','注册时间':'2019-05-14 13:28','入会方式':'自主注册','邀请人':'','钱包余额':0}," +
            "{'ID':450,'登录名':'浩','姓名':'刘浩','手机号码':'18608402953','会员等级':'青铜会员','性别':'男','注册时间':'2019-04-28 10:39','入会方式':'自主注册','邀请人':'','钱包余额':0}" + "]";

    @Test
    public void shouldAnswerWithTrue() {
        JSONArray object = JSONObject.parseArray(json);
        System.out.println("object = " + object);
    }
}
