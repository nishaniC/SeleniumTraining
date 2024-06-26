import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumNishani {

    protected WebDriver driver;
    @Test
    public void exlicitwait() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing “ElementNotVisibleException” exception.
//        It is an intelligent kind of wait, but it can be applied only for specified elements.
//        It gives better options than implicit wait as it waits for dynamically loaded Ajax elements.
        long time = 20;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        String eTitle = "Demo Guru99 Page";
        String aTitle = "" ;
        // launch Chrome and redirect it to the Base URL
        driver.get("http://demo.guru99.com/test/guru99home/" );
        //Maximizes the browser window
        driver.manage().window().maximize() ;
        //get the actual value of the title
        aTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (aTitle.contentEquals(eTitle))
        {
            System.out.println( "Test Passed") ;
        }
        else {
            System.out.println( "Test Failed" );
        }
        WebElement guru99seleniumlink;
        guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//i[@class='icon-suitcase']")));
        guru99seleniumlink.click();
    }

    @Test
    public void implicitwait() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait is used to tell the web driver to wait for a certain amount of time
        // before it throws a “No Such Element Exception”.
        // The default setting is 0. Once we set the time, the web driver will wait
        // for the element for that time before throwing an exception.

        long time = 20;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
        String eTitle = "Demo Guru99 Page";
        String aTitle = "" ;
        driver.get("http://demo.guru99.com/test/guru99home/");
        aTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (aTitle.equals(eTitle))
        {
            System.out.println( "Test Passed") ;
        }
        else {
            System.out.println( "Test Failed" );
        }
        driver.close();
    }
    @Test
    public void nishaniTest1() throws InterruptedException
    {
        System.out.println("hello world");
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver = new EdgeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //locate element with id
//        driver.get("https://mail.google.com/mail/u/0/#inbox");
//
//        WebElement login = driver.findElement(By.id("identifierId"));
//        login.sendKeys("nishani627@gmail.com");
//        WebElement nextButton1 = driver.findElement(By.xpath("//span[text()='Next']"));
//        nextButton1.click();

        //locate by class name
      //  WebElement createButton = driver.findElement(By.className("VfPpkd-vQzf8d"));

         //locate element with xpath
        //right click , inspect, in elements tab then ctrl+f
        // can use attribute or property
        //<span jsname="V67aGc" class="VfPpkd-vQzf8d">Create account</span>  <- this was what was in the element inspect tab
        //xpath format with an attribute:  //tag-name[@attribute-name='value']
        //e.g: //span[@jsname='V67aGc'] <- if this attribute is right we will find it
        // xpath format with a property: //tag-name[property()='value']
        // e.g: //span[text()='Create account'] we have to give the full text here
        //partial text for attributes//tag-name[contains(@attribute-name,'value']  or
        // e.g: //span[contains(@jsname,'V67aG')]
        //partial text for property//tag-name[contains(property(),'value']  or
        // e.g: //span[contains(text(),'Creat')]
        //not tag specific then use * instead of the tag name
        //e.g. //*[@jsname='V67aGc']

        //  use /.. to go to the parent
        //use /and the normal xpath syntax to go to the child or use // for decendents and the normal xpath syntax to move to a child of a child

//        driver.get("https://accounts.google.com/v3/signin/identifier?ifkv=ARZ0qKK5_EezW0xcDk5CPEtXPjY8D1uEGGA1CLKeQK9YvCx3Nd-g62sKev1-vR-1lOWDtnQOs9XOqQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-66159475%3A1713475715787520&theme=mn&ddm=0");
//        WebElement createButton = driver.findElement(By.xpath("//span[text()='Create account']"));
//
//        createButton.click();
//        WebElement createButton2 = driver.findElement(By.xpath("//span[text()='For my personal use']"));
//
//        createButton2.click();
////  <input type="text" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="on" spellcheck="false" tabindex="0" aria-label="First name" name="firstName" value="" aria-disabled="false" autocapitalize="sentences" id="firstName" data-initial-value="">
//        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
//        firstName.sendKeys("WANE1");
//        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
//        nextButton.click();

//        //dropdown menu
//        driver.get("https://developer.snapappointments.com/bootstrap-select/examples/");
//        WebElement element = driver.findElement(By.xpath("//select"));
//        Select dropdown = new Select(element);
//        dropdown.selectByIndex(0);

//        //iframe = html doc inside a html doc
//        driver.get("https://wealthynickel.com/how-to-become-a-bookkeeper/");
//
//        driver.switchTo().frame("omid_v1_present");
//        //then we can access the elements in the iframe
//        WebElement element = driver.findElement(By.xpath("//select"));
//        element.click();
//        //switching back to parent frame this could be another iframe
//        driver.switchTo().parentFrame();
//        //switching back to main frame
//        driver.switchTo().defaultContent();


//        //switching between tabs
//        driver.get("https://www.cmsk12.org/alexandergrahamMS");
//
//
//        driver.findElement(By.xpath("//span[text()='Absent']")).click();
//        //finding window handles
//        mySleep(2);
//
//        switchToTab(2,driver);
//
//        driver.findElement(By.xpath("//input[@value='Submit to School']")).click();
//
//        switchToTab(1,driver);
//        mySleep(2);
//        driver.findElement(By.xpath("//span[text()='Absent']")).click();
//
//        switchToTab(3,driver);
//        mySleep(2);
//        driver.findElement(By.xpath("//input[@value='Submit to School']")).click();




//        try {
//            driver.wait(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        driver.close();


        
    }



    static void switchToTab(int n, WebDriver driver){
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(n-1));

    }

    static void mySleep(int i) throws InterruptedException {
        try {
            sleep(i* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }





}
