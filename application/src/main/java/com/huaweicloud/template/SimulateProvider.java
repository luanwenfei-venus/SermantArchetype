package com.huaweicloud.template;

import java.util.HashMap;

/**
 * 模拟一个下游服务
 *
 * @author luanwenfei
 * @since 2023-02-17
 */
public class SimulateProvider {
    public static void handleConsume(HashMap<String, String> body) {
        assert !body.isEmpty();
    }
}
