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

Mobile.verifyElementExist(findTestObject('Homepage/button_CREATE A PROFILE'), 0)

Mobile.tap(findTestObject('Homepage/button_CREATE A PROFILE'), 0)

Mobile.verifyElementVisible(findTestObject('Create Profile/button_Create Profile'), 0)

Mobile.setText(findTestObject('Create Profile/input_text_First Name'), 'lorem', 0)

Mobile.setText(findTestObject('Create Profile/input_text_Last Name'), 'ipsum', 0)

Mobile.setText(findTestObject('Create Profile/input_text_Country'), 'nepal', 0)

Mobile.setText(findTestObject('Create Profile/input_text_Username'), 'admin', 0)

Mobile.setText(findTestObject('Create Profile/input_text_Password'), 'admin123', 0)

Mobile.setText(findTestObject('Create Profile/input_text_Confirm Password'), 'admin123', 0)

Mobile.tap(findTestObject('Create Profile/button_Create Profile'), 0, FailureHandling.STOP_ON_FAILURE)

AppiumDriver<?> driver = MobileDriverFactory.getDriver();

def toast = driver.findElementByXPath("//android.widget.Toast[@text='Account Successfully Created']")

Mobile.verifyElementVisible(findTestObject('Homepage/button_LOGIN'), 0)

driver.terminateApp('com.example.mikebanks.bankscorpfinancial')

