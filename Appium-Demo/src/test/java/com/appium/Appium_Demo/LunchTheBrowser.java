package com.appium.Appium_Demo;

import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.concurrent.Immutable;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LunchTheBrowser {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		driver.get("https://www.facebook.com");
				
	}
}
