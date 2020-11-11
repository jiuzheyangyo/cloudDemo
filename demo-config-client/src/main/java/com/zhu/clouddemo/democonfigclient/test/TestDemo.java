package com.zhu.clouddemo.democonfigclient.test;

import com.alibaba.fastjson.JSON;
import com.zhu.clouddemo.democonfigclient.decorator.Coffe;
import org.apache.commons.lang3.StringUtils;

import javax.sound.midi.Soundbank;
import java.time.LocalTime;

public class TestDemo {

    public static final Coffe CC;
    static {
        CC = new Coffe();
        CC.setName("cc");
    }
    public static void main(String[] args) {
        String str = "场次 15:00 16:20";
        String[] s = StringUtils.split(str, " ");
        System.out.println(JSON.toJSONString(s));

        LocalTime now = LocalTime.of(13, 20,00);
        LocalTime now1 = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(now);


    }

    public static void aa(Func<String ,String> ff){
        String aaa = ff.doS("aaa");
        System.out.println(aaa);
    }

    public void bbb(){
        System.out.println("bbbb");
    }
}
