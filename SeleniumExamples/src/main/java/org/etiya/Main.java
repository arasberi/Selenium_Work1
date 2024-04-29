package org.etiya;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        //sayfa url'ine girme ve sayfanın başlığını string değerinde alma
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.saucedemo.com/v1/");
        String title = webDriver.getTitle();


        //kullanıcı girişi çin "username" alanını verilen değer ile doldurma
        WebElement usernameInput = webDriver.findElement(By.id("user-name"));
        usernameInput.sendKeys("standard_user");
        Thread.sleep(1000);


        //bir elementin içeriğini temizleme (useername alanı)
        WebElement usernameInputsil = webDriver.findElement(By.id("user-name"));
        usernameInputsil.clear();
        Thread.sleep(3000);


        //kullanıcı girişi çin "password" alanını verilen değer ile doldurma
        WebElement passwordInput = webDriver.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");
        Thread.sleep(1000);

        //butona tıklayarak login işlemi yapma
        WebElement loginBtn = webDriver.findElement(By.id("login-button"));
        loginBtn.click();
        Thread.sleep(3000);


        // sayfadaki bir elemente tıklama
        WebElement linkElement = webDriver.findElement(By.linkText("Sauce Labs Backpack"));
        linkElement.click();
        Thread.sleep(1000);

        //Bir önceki sayfaya geri gitme
        webDriver.navigate().back();
        Thread.sleep(1000);
        //webDriver.quit();


        // sayfadaki bir elementin boyutlarını alma
        WebElement element = webDriver.findElement(By.id("item_4_title_link"));
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();
        System.out.println("Genişlik: " + width + "yükseklik: " + height);
        //webDriver.quit();

        //sayfadaki bir elementin konumunu alma
        int xCoordinate = element.getLocation().getX();
        int yCoordinate = element.getLocation().getY();
        System.out.println("x koordinatı: " + xCoordinate + "y koordinatı: " + yCoordinate);
        //webDriver.quit();


        //arka plan rengi alma
        String backgroundColor = element.getCssValue("background-color");
        System.out.println(backgroundColor);
        //webDriver.quit();

        //sayfanın url'ini string tipinde döndürme
        String currentUrl = webDriver.getCurrentUrl();
        System.out.println("Sayfa url'i: " + currentUrl);
        //webDriver.quit();


        //sayfa yenileme
        webDriver.navigate().refresh();
        //webDriver.quit();




    }
}