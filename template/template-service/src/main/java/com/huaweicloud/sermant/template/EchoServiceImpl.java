package com.huaweicloud.sermant.template;

/**
 * 模板接口实现
 *
 * @author luanwenfei
 * @since 2023-02-15
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public void echo(String string) {
        // 回应别人的问候
        string = string.replaceAll("[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "");
        System.out.println("ECHO: " + string + " to you!");
    }
}
