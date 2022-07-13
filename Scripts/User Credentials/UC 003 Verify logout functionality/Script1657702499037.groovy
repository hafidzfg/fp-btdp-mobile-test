import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication('com.example.mikebanks.bankscorpfinancial', FailureHandling.STOP_ON_FAILURE)


if (Mobile.verifyElementNotExist(findTestObject('Homepage/button_LOGIN'), 5, FailureHandling.OPTIONAL)) {
	AppiumDriver<?> driver = MobileDriverFactory.getDriver()
	driver.terminateApp('com.example.mikebanks.bankscorpfinancial')
}

Mobile.callTestCase(findTestCase('User Credentials/UC 002 Login to app'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('menu_Open Navigation drawer'), 0)

Mobile.tap(findTestObject('Navigation Drawer/text_Logout'), 0)

Mobile.waitForElementPresent(findTestObject('Homepage/button_LOGIN'), 0)

Mobile.verifyElementVisible(findTestObject('Homepage/button_LOGIN'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

driver.terminateApp('com.example.mikebanks.bankscorpfinancial')

