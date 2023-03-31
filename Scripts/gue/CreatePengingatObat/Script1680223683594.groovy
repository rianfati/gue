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
while (Mobile.verifyElementNotExist(findTestObject('Object Repository/gue/rekaman/pengingatObatTitle'), 2, FailureHandling.OPTIONAL)) {
	Mobile.swipe(676, 1711, 674, 1300)
}
Mobile.tap(findTestObject('Object Repository/gue/rekaman/addPengingatObatButton'), 1)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/pengingatObatTambahkanButton'), 1)
Mobile.sendKeys(findTestObject('Object Repository/gue/rekaman/drugName'), 'Panadol')
Mobile.tap(findTestObject('Object Repository/gue/rekaman/sebelumMakan'), 1)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/pengingatObatTambahkanButton2'), 1)
Mobile.verifyElementExist(findTestObject('Object Repository/gue/rekaman/listObat'), 5)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/pengingatObatSubmitButton'), 1)
Mobile.verifyElementExist(findTestObject('Object Repository/gue/rekaman/listPengingatObat1'), 5)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/pengingatObatUbahButton'), 1)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/sesudahMakan'), 1)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/pengingatObatTambahkanButton2'), 1)
Mobile.verifyElementExist(findTestObject('Object Repository/gue/rekaman/listObat2'), 5)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/pengingatObatSubmitButton'), 1)
Mobile.verifyElementExist(findTestObject('Object Repository/gue/rekaman/listPengingatObat1'), 5)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/pengingatObatHapusButton'), 1)
Mobile.tap(findTestObject('Object Repository/gue/rekaman/konfirmasiYesButton'), 1)
Mobile.verifyElementNotExist(findTestObject('Object Repository/gue/rekaman/listPengingatObat1'), 5)