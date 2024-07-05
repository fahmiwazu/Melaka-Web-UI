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

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Daftar Sekarang  Melaka/svg_Solusi Kami_h-7 w-full mdh-full'))

WebUI.navigateToUrl('https://www.melaka.app/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Solusi Melaka'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Edukasi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_masuk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_hubungi kami'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/h1_Melaka Omnichannel Kelola Bisnis Online _204032'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/h1_Melaka Omnichannel Kelola Bisnis Online _204032'), 
    'Melaka Omnichannel: Kelola Bisnis Online dan Toko Kamu dengan Mudah')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_MULAI GUNAKAN, GRATIS'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Pelajari Selengkapnya'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Solusi Khusus untuk Setiap Tipe BisnisP_06e3b2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/h1_Solusi Khusus untuk Setiap Tipe Bisnis'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/h1_Solusi Khusus untuk Setiap Tipe Bisnis'), 
    'Solusi Khusus untuk Setiap Tipe Bisnis')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/p_Percayakan operasional bisnis kamu dengan_728b6f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/p_Percayakan operasional bisnis kamu dengan_728b6f'), 
    'Percayakan operasional bisnis kamu dengan fitur-fitur yang menyesuaikan kebutuhan kamu dari Melaka ✨')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Penjual OnlineKelola berbagai toko mark_33c8e5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_Solusi Khusus_image-52'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Penjual Online'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_Solusi Khusus_image-71'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Penjual Online'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kelola berbagai toko marketplace kamu d_ff723d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_SELENGKAPNYA'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Toko RetailTingkatkan efektivitas opera_e24f38'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_SELENGKAPNYA_image-51'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Toko Retail'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_SELENGKAPNYA_image-71'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Toko Retail'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Tingkatkan efektivitas operasional bisn_b3e879'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_SELENGKAPNYA_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_BrandKembangkan kebutuhan Brand dalam m_2fa4e6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_SELENGKAPNYA_image-51_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Brand'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_SELENGKAPNYA_image-71_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Brand'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kembangkan kebutuhan Brand dalam memant_79503d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_SELENGKAPNYA_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACEPunya banyak_458566'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_SELENGKAPNYA_image-3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACE'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Punya banyak toko di banyak marketplace_1a7ca3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Dengan Melaka, kamu dapat memusatkan se_446b79'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_INTEGRASI ANTAR MARKETPLACEPunya banyak_458566_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDERAtur inven_23f353'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_MANAJEMEN INVENTORI DAN ORDER'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Atur inventori dan pesanan toko online-_6acacf'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kurangi resiko stok tidak sinkron atau _2d18f8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_PROMOSI DAN ANALISIS PELANGGANBikin pro_17f7b1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_PROMOSI DAN ANALISIS PELANGGAN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Bikin promosi yang tepat gak bingung ka_2b35e5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Maksimalkan keuntungan dari promosi yan_dc5583'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_CATATAN KEUANGANKelola hasil penjualan _42c2b9'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_CATATAN KEUANGAN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kelola hasil penjualan di semua bisnis _2f0e4e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Tidak pusing lihat laporan penjualan sa_8eea9c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Pelajari Lebih Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Keamanan  Privasi TerjaminLayanan Pelan_6b2486'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Keamanan  Privasi Terjamin'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_Pelajari Lebih Lanjut_image-4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Keamanan  Privasi Terjamin'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Layanan Pelanggan 247'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_Keamanan  Privasi Terjamin_image-4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Layanan Pelanggan 247'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Praktis dan Gratis'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_Layanan Pelanggan 247_image-4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Praktis dan Gratis'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Layanan Pengaduan Konsumen dan Masyarak_4dd2e2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_1_2_3_4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Layanan Pengaduan Konsumen dan Masyarak_3905fa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Layanan Pengaduan Konsumen dan Masyarakat'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_(PT Melaka Commerce Technologies)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_helpmelaka.app'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_(PT Melaka Commerce Technologies)_mobil_2f56e5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Direktorat Jenderal Perlindungan Konsum_fe5647'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Direktorat Jenderal Perlindungan Konsum_3807ad'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_62 853 1111 1010'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_helpmelaka.app_mobile-footer-icon'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Terdaftar di'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Terdaftar di_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_Terdaftar di_image-6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Solusi KamiIntegrasi MarketplaceManajem_5d5bc0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_EdukasiSeller AcademyPusat Bantuan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kebijakan KamiSyarat dan KetentuanPriva_f4cf47'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Solusi Kami'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Integrasi Marketplace'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Manajemen Inventori'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Manajemen Order'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Promosi Melaka'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Catatan Keuangan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Analisa Pelanggan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Edukasi_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Seller Academy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Pusat Bantuan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kebijakan Kami'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Syarat dan Ketentuan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_Privasi dan Keamanan Data'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_melaka_app'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_melaka_app_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/a_melaka_app_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_melaka_app'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_1_2_3_4_5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_melaka_app'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_1_2_3_4_5_6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_melaka_app'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/img_1_2_3_4_5_6_7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/div_Kami baru saja melakukan perubahan pada_4bdee1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/strong_Kami baru saja melakukan perubahan p_07a891'), 
    'Kami baru saja melakukan perubahan pada Ketentuan Penggunaan dan Kebijakan Privasi')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Main Logo Redirection/Page_Melaka - Solusi Pengelolaan Toko Onlin_bc7d1f/button_Setuju'), 
    0)

WebUI.closeBrowser()

