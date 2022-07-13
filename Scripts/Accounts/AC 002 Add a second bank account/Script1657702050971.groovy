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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

Mobile.callTestCase(findTestCase('User Credentials/UC 002 Login to app'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Dashboard/text_Good evening, Firstname. Welcome to the Bank App Demo. Happy Tuesday'), 
    0)

Mobile.tap(findTestObject('menu_Open Navigation drawer'), 0)

Mobile.tap(findTestObject('Navigation Drawer/text_Accounts'), 0)

Mobile.tap(findTestObject('Accounts/button_Add an account'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/button_ADD'), 0)

Mobile.setText(findTestObject('Accounts/input_text_Account Name'), 'firmansyah', 0)

Mobile.setText(findTestObject('Accounts/input_text_Initial Balance (Optional)'), '1000', 0)

Mobile.tap(findTestObject('Accounts/button_ADD'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts/Acc Details/text_Account no A1'), 5)

Mobile.verifyElementText(findTestObject('Accounts/Acc Details/text_acc2_Account-colonSign- -dollarSign-balance 5.00'), ('Account balance: $' + 
    1000) + '.00')

Mobile.verifyElementText(findTestObject('Accounts/Acc Details/text_acc2'), 'firmansyah')

AppiumDriver<?> driver = MobileDriverFactory.getDriver();
driver.terminateApp('com.example.mikebanks.bankscorpfinancial')

