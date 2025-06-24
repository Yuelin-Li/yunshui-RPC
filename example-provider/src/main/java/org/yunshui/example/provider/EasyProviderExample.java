package org.yunshui.example.provider;


import org.yunshui.example.common.service.UserService;
import org.yunshui.rpc.registry.LocalRegistry;
import org.yunshui.rpc.server.HttpServer;
import org.yunshui.rpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}

