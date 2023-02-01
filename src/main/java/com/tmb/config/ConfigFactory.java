package com.tmb.config;

public final  class ConfigFactory
{
    //final = no body can extend
    private ConfigFactory(){}// private no one can create object
    public static FrameworkConfig getConfig()
    {
        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
