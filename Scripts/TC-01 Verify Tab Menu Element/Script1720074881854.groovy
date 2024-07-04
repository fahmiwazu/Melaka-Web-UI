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

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Solusi KamiEdukasi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Solusi Kami'), 
    0)

WebUI.click(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/button_Integrasi MarketplaceManajemen Inven_56e75a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Integrasi Marketplace'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/span_Integrasi Marketplace'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/svg_Solusi Kami_text-le group-hovertext-blu_537b0d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Manajemen Inventori'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/span_Manajemen Inventori'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/svg_Solusi Kami_text-le group-hovertext-blu_537b0d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Manajemen Order'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/span_Manajemen Order'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/svg_Solusi Kami_text-le group-hovertext-blu_537b0d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Catatan Keuangan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/span_Catatan Keuangan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/svg_Solusi Kami_text-le group-hovertext-blu_537b0d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Analisa Pelanggan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/span_Analisa Pelanggan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/svg_Solusi Kami_text-le group-hovertext-blu_537b0d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Melaka Market'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/span_Melaka Market'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/svg_Analisa Pelanggan_text-le group-hoverte_bb4da5'), 
    0)

WebUI.click(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Solusi KamiIntegrasi MarketplaceManajem_8d8282'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/button_Integrasi MarketplaceManajemen Inven_56e75a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Edukasi'), 
    0)

WebUI.click(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Edukasi'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/button_Seller AcademyPusat Bantuan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Seller Academy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/span_Seller Academy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_Pusat Bantuan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/span_Pusat Bantuan'), 
    0)

WebUI.click(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/div_EdukasiSeller AcademyPusat Bantuan'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Register Dashboard/Tab Menu/Page_Daftar Sekarang  Melaka/button_Seller AcademyPusat Bantuan'), 
    0)

WebUI.closeBrowser()

