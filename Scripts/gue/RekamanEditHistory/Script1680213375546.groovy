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

Mobile.callTestCase(findTestCase('Test Cases/gue/login'), null)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/rekamButton'), 1)
Mobile.verifyElementExist(findTestObject('Object Repository/gue/rekaman/rekamanHistoryButton'), 5)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/rekamanHistoryButton'), 1)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/rekamanEditButton'), 1)
Mobile.delay(2)
Mobile.clearText(findTestObject('Object Repository/gue/rekaman/inputGulaDarahField'), 1)
Mobile.sendKeys(findTestObject('Object Repository/gue/rekaman/inputGulaDarahField'), '132')
Mobile.clearText(findTestObject('Object Repository/gue/rekaman/rekamanMakanMalam'), 1)
Mobile.sendKeys(findTestObject('Object Repository/gue/rekaman/rekamanMakanMalam'), 'Pizza')
Mobile.tap(findTestObject('Object Repository/gue/rekaman/rekamanRandomSpace'), 1)
Mobile.swipe(676, 1711, 676, 1400)
Mobile.clearText(findTestObject('Object Repository/gue/rekaman/rekamanMakanMalam2'), 1)
Mobile.sendKeys(findTestObject('Object Repository/gue/rekaman/rekamanMakanMalam2'), 'Spaghetti')
Mobile.tap(findTestObject('Object Repository/gue/rekaman/rekamanRandomSpace'), 1)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/rekamanSelesaiButton'), 1)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/rekamanYaBenarButton'), 1)
Mobile.verifyElementExist(findTestObject('Object Repository/gue/rekaman/berhasilIcon'), 2)