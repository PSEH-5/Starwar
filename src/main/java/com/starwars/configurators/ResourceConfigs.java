package com.starwars.configurators;

import com.starwars.helper.Helper;
import com.starwars.helper.RequestValidator;
import com.starwars.service.impl.StarwarsServiceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class ResourceConfigs extends ResourceConfig {

    public ResourceConfigs() {
        register(StarwarsServiceImpl.class);
        register(Helper.class);
        register(RequestValidator.class);
    }
}
