package com.object.serviceFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 周振平
 * on 2016/4/9 0:06
 * noninstantiable class for service registartion and access
 * 给提供者注册API、服务访问API提供实例化class
 *
 */
public class Services {

    private Services(){}//prevents instantiation 预防 实例化
    //Maps service names to services
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    //Provider registeration API
    public static void registerDefaultProvider(Provider provider) {
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }
    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    //Service access API
    public static Service getInstance() {
        return getInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service getInstance(String name) {
        Provider provider = providers.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("No provider registered with name : " + name);
        }
        return provider.newService();
    }
}
