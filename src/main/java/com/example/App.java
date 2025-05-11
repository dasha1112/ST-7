package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver-win64\\chromedriver.exe");

        testSelenium();

        System.out.println("\nGet IP");
        Task2.getIPAddress();

        System.out.println("\nGet wether");
        Task3.getWeatherForecast();
    }

    public static void testSelenium() {
        WebDriver webDriver = new ChromeDriver();
        try {
            webDriver.get("https://www.calculator.net/password-generator.html");
            System.out.println(webDriver.getTitle());
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("Error:");
            System.out.println(e.toString());
        } finally {
            webDriver.quit();
        }
    }
}