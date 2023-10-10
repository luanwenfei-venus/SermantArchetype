package com.huaweicloud.sermant.template;

import com.huaweicloud.sermant.core.plugin.service.PluginService;

/**
 * 模版插件服务接口
 *
 * @author luanwenfei
 * @since 2023-02-15
 */
public interface EchoService extends PluginService {
    void echo(String string);
}
