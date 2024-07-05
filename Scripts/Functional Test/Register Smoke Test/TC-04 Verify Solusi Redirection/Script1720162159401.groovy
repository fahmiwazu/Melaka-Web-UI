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

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Integrasi Marketplace'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Integrasi Marketplace'), 
    'Integrasi Marketplace')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Integrasi Marketplace'))

WebUI.navigateToUrl('https://www.melaka.app/#marketplace-integration')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACE'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACE'), 
    'INTEGRASI ANTAR MARKETPLACE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Punya banyak toko di banyak marketplace_1a7ca3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Punya banyak toko di banyak marketplace_1a7ca3'), 
    'Punya banyak toko di banyak marketplace? Koneksikan aja dulu')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/span_banyak marketplace'), 
    'banyak marketplace')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Dengan Melaka, kamu dapat memusatkan se_446b79'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Dengan Melaka, kamu dapat memusatkan se_446b79'), 
    'Dengan Melaka, kamu dapat memusatkan seluruh manajemen toko online-mu di berbagai marketplace hanya di satu platform saja.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_SELENGKAPNYA_image-3'), 
    0)

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Manajemen Inventori'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Manajemen Inventori'), 
    'Manajemen Inventori')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Manajemen Inventori'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDER'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDER'), 
    'MANAJEMEN INVENTORI DAN ORDER')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Atur inventori dan pesanan toko online-_6acacf'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Atur inventori dan pesanan toko online-_6acacf'), 
    'Atur inventori dan pesanan toko online-mu dengan mudah dan terpusat')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/span_inventori'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/span_inventori'), 
    'inventori')

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Manajemen Order'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Manajemen Order'), 
    'Manajemen Order')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Manajemen Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDER'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDER'), 
    'MANAJEMEN INVENTORI DAN ORDER')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Atur inventori dan pesanan toko online-_6acacf'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Atur inventori dan pesanan toko online-_6acacf'), 
    'Atur inventori dan pesanan toko online-mu dengan mudah dan terpusat')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/span_pesanan'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/span_pesanan'), 
    'pesanan')

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Catatan Keuangan'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Catatan Keuangan'), 
    'Catatan Keuangan')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Catatan Keuangan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_CATATAN KEUANGAN'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_CATATAN KEUANGAN'), 
    'CATATAN KEUANGAN')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kelola hasil penjualan di semua bisnis _2f0e4e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kelola hasil penjualan di semua bisnis _2f0e4e'), 
    'Kelola hasil penjualan di semua bisnis online dan toko kamu dengan mudah')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/span_hasil penjualan di semua bisnis online_d30f4b'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/span_hasil penjualan di semua bisnis online_d30f4b'), 
    'hasil penjualan di semua bisnis online dan toko kamu')

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Analisa Pelanggan'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Analisa Pelanggan'), 
    'Analisa Pelanggan')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Analisa Pelanggan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_PROMOSI DAN ANALISIS PELANGGAN'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_PROMOSI DAN ANALISIS PELANGGAN'), 
    'PROMOSI DAN ANALISIS PELANGGAN')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Bikin promosi yang tepat gak bingung ka_2b35e5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/span_target'), 
    'target')

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Melaka Market'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Solution Redirection/Page_Daftar Sekarang  Melaka/span_Melaka Market'), 
    'Melaka Market')

WebUI.closeBrowser()

