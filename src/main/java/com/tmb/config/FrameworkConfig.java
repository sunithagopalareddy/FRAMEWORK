package com.tmb.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources(value="file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameworkConfig  extends Config {

    long timeout();
    String url();

    String browser();
    /*public static void main(String[] args) {
        FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
        System.out.println(config.url());

        System.out.println(System.getProperty("user.dir"));
    }*/
}
