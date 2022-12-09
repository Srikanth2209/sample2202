package org.test.falconWebAutomation.testscript;/*
User: Srikanth
Description: TestScript for Falcon Doc 2.0
*/

import com.atmecs.falcon.automation.ui.selenium.Click;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler;
import org.openqa.selenium.By;
import org.test.falconWebAutomation.constant.FilePathConstants;
import org.test.falconWebAutomation.constant.LocatorKeyContainer;
import org.test.falconWebAutomation.testsuite.SampleTestSuiteBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler.getLocatorValue;

public class Falcon_Docs extends SampleTestSuiteBase {
    private ReportLogService report = new ReportLogServiceImpl(Falcon_Docs.class);
    Verify verify=new Verify();
    String filePath = FilePathConstants.FALCON_HOME;
    @Test
    @Parameters({"os", "osVersion", "browser", "browserVersion"})
    public void sampleTest(String os, String osVersion, String br, String browserVersion) {
        // write your first test script here
        // sample
        report.info("Opening browser: " + br);
        browser.openURL(getLocatorValue(filePath,LocatorKeyContainer.INPUT_Url), os, osVersion, br, browserVersion);
        report.info("Maximizing browser window");
        browser.maximizeWindow();

       String HomePage_Title = browser.getCurrentPageTitle();
//        Verify.verifyString("Falcon Docs",HomePage_Title,"Verifying Home_Page Title");
//        report.info("verifying Home page logo");
//        boolean logo=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_5))).isDisplayed();
//        Verify.verifyTrue(logo,"Verifying Home page logo");
//
//        report.info("verifying Icon img");
//        boolean icon=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_6))).isDisplayed();
//        Verify.verifyTrue(icon,"Verifying Icon img of Falcon Docs");
//
//        report.info("verifying Home page Header");
//        String header=browser.getTextField().readTextByXPath(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_7));
//        report.info("Home Page Header is "+header);
//        Verify.verifyString("FALCONDOCS",header,"verifying header of home page");
//
//        report.info("verifying Home page tagline");
//        String tagline =browser.getTextField().readTextByXPath(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_8));
//        report.info("Home page tagline is "+tagline);
//        Verify.verifyString("AI Tool for your project Automation\n" +
//                "Loved by QA's Developers Alike",tagline,"verifying tagline of home page");
//
//        report.info("verifying Falcon web link is present or not");
//        boolean webFlag=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_9))).isDisplayed();
//        Verify.verifyTrue(webFlag,"Verifying Falcon web link");
//
//        report.info("verifying Falcon Mobile link is present or not");
//        boolean mobFlag=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_10))).isDisplayed();
//        Verify.verifyTrue(mobFlag,"Verifying Falcon Mobile link");
//
//        report.info("verifying Falcon API link is present or not");
//        boolean apiFlag=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_11))).isDisplayed();
//        Verify.verifyTrue(apiFlag,"Verifying Falcon API link");
//
//        report.info("verifying Falcon FAQs link is present or not");
//        boolean faqsFlag=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_12))).isDisplayed();
//        Verify.verifyTrue(faqsFlag,"Verifying Falcon FAQs link");
//
//        report.info("verifying Showcase link is present or not");
//        // boolean showcaseFlag=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_13))).isDisplayed();
//        verify.verifyIsDisplayed(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_13),true,"Verifying Showcase link");
//        //Verify.verifyTrue(showcaseFlag,"Verifying Showcase link");
//
//        report.info("verifying License & Credits link is present or not");
//        boolean lcFlag=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_14))).isDisplayed();
//        Verify.verifyTrue(lcFlag,"Verifying License & Credits link");
//
//        report.info("Clicking on Atmecs link");
        Click click= browser.getClick();
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_21));
//        String atmecs=SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_15);
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // browser.getWindowHandler().switchToWindowByTitle()
//        String url=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_15),url,"Verifying current page url");
//        browser.getWindowHandler().closeWindow(atmecs);
//        browser.getWait().HardPause(1000);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(HomePage_Title);




        report.info("clicking on Falcon Web");
        report.info("------------Opening Falcon web ---------------");
        click.waitandclick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_9),10);
        String falconWebHeader =browser.getTextField().readTextByXPath(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_16));
        report.info("falconWeb Page Header is "+falconWebHeader);
        report.info("verifying falconWeb page Header");
        Verify.verifyString("Falcon Web",falconWebHeader,"verifying header of Falcon Web page");

        report.info("verifying Search bar is present or not");
        boolean sbFlag=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_17))).isDisplayed();
        Verify.verifyTrue(sbFlag,"verifying Search bar is present or not");
        report.info("Entering text in searchbar");
        click.clickAndEnterText(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_17),"click class",10);
        report.info("verifying Search icon is present or not");
        boolean siFlag=browser.getDriver().findElement(By.xpath(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_18))).isDisplayed();
        Verify.verifyTrue(siFlag,"verifying Search icon is present or not");
        report.info("clicking on search icon");
        click.performClick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_18));

        report.info("clicking on Download locator generator");
        click.performClick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_19));
        String newurl=SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_20);
        browser.getWindowHandler().closeWindow(newurl);

        report.info("Clicking on Atmecs link");
        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_21));
        report.info("Switching to new window");
        try {
            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //String url=browser.getCurrentURL();
        report.info("verifying url");
        //Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_15),url,"Verifying current page url");
       String atmecs="https://www.atmecs.com/";
        browser.getWindowHandler().closeWindow(atmecs);
        browser.closeBrowser();
        browser.getWindowHandler().switchToWindowByTitle(HomePage_Title);

        report.info("Clicking on home link");
        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_22));
        browser.getWait().HardPause(2000);
        report.info("verifying Home page Header");
        //Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_23),header,"verifying header of home page");



//        report.info("clicking on Falcon mobile");
//        report.info("------------Opening Falcon Mobile ---------------");
//        click.waitandclick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_10),5);
//        String falconMobHeader =browser.getTextField().readTextByXPath(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_16));
//        report.info("falconMobile Page Header is "+falconMobHeader);
//        report.info("verifying falconMobile page Header");
//        Verify.verifyString("Falcon Mobile",falconMobHeader,"verifying header of Falcon Mobile page");
//
//        report.info("Entering text in searchbar");
//        click.clickAndEnterText(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_17),"Locators Generator",10);
//        report.info("clicking on search icon");
//        click.performClick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_18));
//
//        report.info("clicking on Download locator generator");
//        click.performClick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_24));
//        String moburl=SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_25);
//        browser.getWindowHandler().closeWindow(moburl);
//
//        report.info("Clicking on Atmecs link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_21));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //String url=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_15),url,"Verifying current page url");
//        // String atmecs="https://www.atmecs.com/";
//        browser.getWindowHandler().closeWindow(atmecs);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on home link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_22));
//        browser.getWait().HardPause(2000);
//        report.info("verifying Home page Header");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_23),header,"verifying header of home page");
//
//
//
//        report.info("clicking on falcon Api");
//        report.info("------------Opening Falcon API ---------------");
//        click.waitandclick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_11),5);
//       // click.waitandclick(LocatorType.XPATH,"//a[@class='link']//preceding-sibling::h3[contains(text(),'Falcon API')]",5);
//        String falconApiHeader =browser.getTextField().readTextByXPath(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_16));
//        report.info("falcon API Page Header is "+falconApiHeader);
//        report.info("verifying falconApi page Header");
//        Verify.verifyString("Falcon API",falconApiHeader,"verifying header of Falcon API page");
//
//        report.info("Entering text in searchbar");
//        click.clickAndEnterText(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_17),"click class",3);
//        report.info("clicking on search icon");
//        click.performClick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_18));
//
//        report.info("Clicking on Atmecs link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_21));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //String url=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_15),url,"Verifying current page url");
//        // String atmecs="https://www.atmecs.com/";
//        browser.getWindowHandler().closeWindow(atmecs);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on home link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_22));
//        browser.getWait().HardPause(2000);
//        report.info("verifying Home page Header");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_23),header,"verifying header of home page");
//
//
//
//        report.info("clicking on FAQs");
//        report.info("------------Opening FAQs ---------------");
//        browser.getWait().HardPause(3000);
//        click.waitandclick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_12),5);
//        String faqsHeader =browser.getTextField().readTextByXPath(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_16));
//        report.info(" Faqs Page Header is "+faqsHeader);
//        report.info("verifying FAQs page Header");
//        Verify.verifyString("FAQs",faqsHeader,"verifying header of FAqs page");
//
//        report.info("Entering text in searchbar");
//        click.clickAndEnterText(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_17),"Web Locator Generator",3);
//        report.info("clicking on search icon");
//        click.performClick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_18));
//
//        report.info("Clicking on Atmecs link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_21));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //String url=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_15),url,"Verifying current page url");
//        // String atmecs="https://www.atmecs.com/";
//        browser.getWindowHandler().closeWindow(atmecs);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on home link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_22));
//        browser.getWait().HardPause(2000);
//        report.info("verifying Home page Header");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_23),header,"verifying header of home page");
//
//
//        report.info("clicking on falcon Showcase");
//        report.info("------------Opening Showcase ---------------");
//        click.waitandclick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_13),5);
//        String showcaseHeader =browser.getTextField().readTextByXPath(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_16));
//        report.info(" Showcase Page Header is "+showcaseHeader);
//        report.info("verifying showcase page Header");
//        Verify.verifyString("Showcase",showcaseHeader,"verifying header of  Showcase page");
//
//        report.info("Entering text in searchbar");
//        click.clickAndEnterText(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_17),"Demo videos",3);
//        report.info("clicking on search icon");
//        click.performClick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_18));
//
//        report.info("Clicking on Atmecs link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_21));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //String url=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_15),url,"Verifying current page url");
//        // String atmecs="https://www.atmecs.com/";
//        browser.getWindowHandler().closeWindow(atmecs);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on home link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_22));
//        browser.getWait().HardPause(2000);
//        report.info("verifying Home page Header");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_23),header,"verifying header of home page");
//
//



//        report.info("clicking on License & Credits");
//        report.info("------------Opening License & Credits ---------------");
//        click.waitandclick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_14),5);
//        String licenseCreditsHeader =browser.getTextField().readTextByXPath(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_16));
//        report.info(" License & Credits Page Header is "+licenseCreditsHeader);
//        report.info("verifying License & Credits page Header");
//        Verify.verifyString("License & Credits",licenseCreditsHeader,"verifying header of  License & Credits page");
//
//        report.info("Entering text in searchbar");
//        click.clickAndEnterText(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_17),"Falcon Credits",3);
//        report.info("clicking on search icon");
//        click.performClick(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_18));
//
//        report.info("Clicking on buy the commercial license. link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_26));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        String contactUrl=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_27),contactUrl,"Verifying current page url");
//        browser.getWindowHandler().closeWindow(contactUrl);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on @ATMECS link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_28));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        String twitterUrl=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_29),twitterUrl,"Verifying current page url");
//        browser.getWindowHandler().closeWindow(twitterUrl);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on  ATMECS Passionate Minds");
//        click.performClick(LocatorType.PARTIALLINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_30));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        String linkedInUrl=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_31),linkedInUrl,"Verifying current page url");
//        browser.getWindowHandler().closeWindow(linkedInUrl);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on Atmecs link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_21));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //String url=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_15),url,"Verifying current page url");
//        // String atmecs="https://www.atmecs.com/";
//        browser.getWindowHandler().closeWindow(atmecs);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on  Follow ATMECS on Twitter");
//        click.performClick(LocatorType.PARTIALLINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_32));
//        report.info("Switching to new window");
//        try {
//            browser.getWindowHandler().waitForNewWindowAndSwitchToIt(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // String twitterUrl=browser.getCurrentURL();
//        report.info("verifying url");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_29),twitterUrl,"Verifying current page url");
//        browser.getWindowHandler().closeWindow(twitterUrl);
//        browser.closeBrowser();
//        browser.getWindowHandler().switchToWindowByTitle(title);
//
//        report.info("Clicking on home link");
//        click.performClick(LocatorType.LINKTEXT,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_22));
//        browser.getWait().HardPause(2000);
//        report.info("verifying Home page Header");
//        Verify.verifyString(SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_23),header,"verifying header of home page");
//

    }
}
