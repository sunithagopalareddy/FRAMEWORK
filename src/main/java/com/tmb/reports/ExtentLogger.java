package com.tmb.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.tmb.utils.ScreenshotUtil;

public final class ExtentLogger {
    private ExtentLogger(){}

    public static void pass(String message){
       //ExtentManager.getExtentTest().pass(message);
       ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getScreenshot()).build());
    }

    public static void fail(String message){
        //ExtentManager.getExtentTest().pass(message);
        ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getScreenshot()).build());
    }
    public static void info(String message){
        //ExtentManager.getExtentTest().pass(message);
        ExtentManager.getExtentTest().info(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getScreenshot()).build());
    }
}
