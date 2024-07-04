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

WebUI.click(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Daftar Sekarang  Melaka/div_Solusi Kami'))

WebUI.click(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Daftar Sekarang  Melaka/span_Manajemen Inventori'))

WebUI.navigateToUrl('https://www.melaka.app/#store-management')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDERAtur inven_23f353'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDERAtur inven_23f353_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDER'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDER'), 
    'MANAJEMEN INVENTORI DAN ORDER')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Atur inventori dan pesanan toko online-_6acacf'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Atur inventori dan pesanan toko online-_6acacf'), 
    'Atur inventori dan pesanan toko online-mu dengan mudah dan terpusat')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kurangi resiko stok tidak sinkron atau _2d18f8'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kurangi resiko stok tidak sinkron atau _2d18f8'), 
    'Kurangi resiko stok tidak sinkron atau pun pesanan lupa diproses karena repot mesti buka semua marketplace.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Pelajari Lebih Lanjut'), 
    'Pelajari Lebih Lanjut')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard/Melaka Solution 2 Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_1'), 
    0)

WebUI.closeBrowser()

