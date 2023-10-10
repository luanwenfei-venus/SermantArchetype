package com.huaweicloud.template;

import java.util.HashMap;

/**
 * 模版应用
 *
 * @author luanwenfei
 * @since 2023-01-15
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Good afternoon!");
        SimulateServer.handleRequest(new HashMap<>());
    }
}