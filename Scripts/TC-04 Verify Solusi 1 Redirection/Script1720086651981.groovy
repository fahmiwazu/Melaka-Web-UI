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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.click(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.click(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Daftar Sekarang  Melaka/span_Integrasi Marketplace'))

WebUI.navigateToUrl('https://www.melaka.app/#marketplace-integration')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACEPunya banyak_458566'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_SELENGKAPNYA_image-3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACEPunya banyak_458566_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACE'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACE'), 
    'INTEGRASI ANTAR MARKETPLACE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Punya banyak toko di banyak marketplace_1a7ca3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Punya banyak toko di banyak marketplace_1a7ca3'), 
    'Punya banyak toko di banyak marketplace? Koneksikan aja dulu')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Dengan Melaka, kamu dapat memusatkan se_446b79'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Dengan Melaka, kamu dapat memusatkan se_446b79'), 
    'Dengan Melaka, kamu dapat memusatkan seluruh manajemen toko online-mu di berbagai marketplace hanya di satu platform saja.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Pelajari Lebih Lanjut'), 
    'Pelajari Lebih Lanjut')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 1 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img'), 
    0)

WebUI.closeBrowser()

