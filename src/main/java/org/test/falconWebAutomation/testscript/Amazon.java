package org.test.falconWebAutomation.testscript;

import org.test.falconWebAutomation.constant.FilePathConstants;
import org.test.falconWebAutomation.constant.LocatorKeyContainer;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.test.falconWebAutomation.testsuite.SampleTestSuiteBase;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.ui.seleniuminterfaces.IKeys.KeyType;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;

import static com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler.getLocatorValue;

public class Amazon extends SampleTestSuiteBase {

    private ReportLogService report = new ReportLogServiceImpl(SampleTestScript.class);

    @Test
    @Parameters({"os", "osVersion", "browser", "browserVersion"})
    public void sampleTest(String os, String osVersion, String br, String browserVersion) {
        // write your first test script here
        // sample
        report.info("Opening browser: " + br);
        String a_Url= getLocatorValue(FilePathConstants.AMAZON_HOME, LocatorKeyContainer.Amazon_Url);
        browser.openURL(a_Url,os, osVersion, br, browserVersion);
        report.info("Maximizing browser window");
        browser.maximizeWindow();
    }
}
