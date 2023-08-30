package com.appium.Appium_Demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class NewBrowserLaunch {
  public static void main(String[] args) throws MalformedURLException {
	
	  File f=new File("./src/main/Android-NativeDemoApp-0.2.0.apk");
	  
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	  cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
	  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	  
	  AndroidDriver  driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
	  
}
}
