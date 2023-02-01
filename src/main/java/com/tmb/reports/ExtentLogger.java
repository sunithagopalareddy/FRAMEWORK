package com.tmb.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.tmb.utils.ScreenshotUtil;

public final class ExtentLogger {
    private ExtentLogger(){}

    public static void pass(String message){
       //ExtentManager.getExtentTest().pass(message);
       ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getScreenshot()).build());
    }


}
