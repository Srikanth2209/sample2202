package org.test.falconWebAutomation.testscript;/*
User: srikanth
Description: verifying change password module is working
*/

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import org.openqa.selenium.By;
import org.test.falconWebAutomation.constant.FilePathConstants;
import org.test.falconWebAutomation.constant.LocatorKeyContainer;
import org.test.falconWebAutomation.testsuite.SampleTestSuiteBase;
import static com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler.getLocatorValue;


public class Change_Password extends SampleTestSuiteBase {
    private ReportLogService report = new ReportLogServiceImpl(Change_Password.class);
    String filePath = FilePathConstants.ASPIRE;
    Browser browser;
    public Change_Password(Browser browser)
    {
        this.browser = browser;
    }
    public void change_password()
    {
        boolean change_password_icon = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_102))).isDisplayed();
        Verify.verifyTrue(change_password_icon,"Verifying change_password_icon");
        boolean change_password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_103))).isDisplayed();
        Verify.verifyTrue(change_password,"Verifying change_password");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_103));
        boolean update_Password_header = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_111))).isDisplayed();
        Verify.verifyTrue(update_Password_header,"Verifying update_Password_header");
        boolean old_Password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_112))).isDisplayed();
        Verify.verifyTrue(old_Password,"Verifying old_Password");
        boolean new_Password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_113))).isDisplayed();
        Verify.verifyTrue(new_Password,"Verifying new_Password");
        boolean conform_Password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_114))).isDisplayed();
        Verify.verifyTrue(conform_Password,"Verifying conform_Password");
        boolean reset_Password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_115))).isDisplayed();
        Verify.verifyTrue(reset_Password,"Verifying reset_Password");
        browser.getNavigate().back();
    }

}
