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

Mobile.startApplication('/Users/rianfati/Documents/gue/temandiabetes.apk', true)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/gue/login/masukButton'), 1)
Mobile.sendKeys(findTestObject('Object Repository/gue/login/loginEmailField'), 'rian@mail.com')
Mobile.sendKeys(findTestObject('Object Repository/gue/login/loginPasswordField'), 'Qwerty123!')
Mobile.tap(findTestObject('Object Repository/gue/login/loginSubmitButton'), 1)
Mobile.tap(findTestObject('Object Repository/gue/login/agreementChecklist'), 5)
Mobile.tap(findTestObject('Object Repository/gue/login/agreementLanjutButton'), 5)
Mobile.verifyElementExist(findTestObject('Object Repository/gue/rekaman/rekamButton'), 5)
