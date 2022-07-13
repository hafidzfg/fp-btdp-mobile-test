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

CucumberKW.runFeatureFile('Include/features/MP-8 Hafidz-TC Login Bank App.feature')

Mobile.startExistingApplication('com.example.mikebanks.bankscorpfinancial', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Homepage/button_LOGIN'), 0)

Mobile.setText(findTestObject('Homepage/input_text_Username'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('Homepage/input_text_Password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Homepage/button_LOGIN'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Homepage/button_LOGIN'), 10, FailureHandling.OPTIONAL)) {
    Mobile.callTestCase(findTestCase('User Credentials/UC 001 Create a profile'), [:], FailureHandling.STOP_ON_FAILURE)
	Mobile.setText(findTestObject('Homepage/input_text_Username'), GlobalVariable.username, 0)
	
	Mobile.setText(findTestObject('Homepage/input_text_Password'), GlobalVariable.password, 0)
	
	Mobile.tap(findTestObject('Homepage/button_LOGIN'), 0)
	
	Mobile.verifyElementVisible(findTestObject('Dashboard/text_Good evening, Firstname. Welcome to the Bank App Demo. Happy Tuesday'),
		10)
} else {
    Mobile.verifyElementVisible(findTestObject('Dashboard/text_Good evening, Firstname. Welcome to the Bank App Demo. Happy Tuesday'), 
        10)
}

