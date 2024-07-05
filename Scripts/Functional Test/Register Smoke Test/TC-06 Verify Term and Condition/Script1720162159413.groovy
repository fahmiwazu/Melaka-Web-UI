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

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Daftar Sekarang  Melaka/span_Syarat dan Ketentuan'))

WebUI.navigateToUrl('https://www.melaka.app/term-condition')

WebUI.switchToWindowTitle('Syarat dan Ketentuan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/h1_Ketentuan Penggunaan'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/h1_Ketentuan Penggunaan'), 
    'Ketentuan Penggunaan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/div_Selamat datang di www.melaka.app'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_A. Definisi'), 
    'A. Definisi')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Platform ini adalah suatu situs (lamanpor_036e57'), 
    'Platform ini adalah suatu situs (laman/portal web) dan/atau aplikasi milik Perusahaan yang menyediakan layanan pengelolaan bisnis penjualan secara online dengan nama Melaka.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Perusahaan adalah suatu perseroan terbata_b4e782'), 
    'Perusahaan adalah suatu perseroan terbatas yang didirikan berdasarkan hukum yang berlaku di Republik Indonesia yang menjalankan kegiatan usaha jasa web portal dengan nama domain www.melaka.app, yakni sebuah situs untuk pengelolaan bisnis penjualan secara online.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Ketentuan Penggunaan adalah perjanjian an_243cc6'), 
    'Ketentuan Penggunaan adalah perjanjian antara Pengguna dan Perusahan yang berisikan ketentuan-ketentuan yang mengatur hak, kewajiban, tanggung jawab baik dari Pengguna maupun Perusahaan, serta tata cara penggunaan sistem layanan yang disediakan oleh Perusahaan di dalam Platform.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Pengguna adalah pihak yang menggunakan la_5d7f82'), 
    'Pengguna adalah pihak yang menggunakan layanan Perusahaan, termasuk namun tidak terbatas pada, pihak yang mengakses dan menggunakan Platform, konten di dalam Platform, layanan Platform, dan/atau produk-produk milik Perusahaan.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Events adalah fitur pada Platform yang me_65586a'), 
    'Events adalah fitur pada Platform yang menampilkan konten terkait suatu event yang diselenggarakan oleh Perusahaan maupun mitra Perusahaan.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Learning Center adalah fitur pada Platfor_5a514b'), 
    'Learning Center adalah fitur pada Platform dan yang menampilkan konten terkait suatu cara/langkah/saran mengenai pengembangan bisnis penjualan secara online yang disediakan oleh Perusahaan maupun pihak ketiga lain yang merupakan mitra Perusahaan.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Campaign adalah fitur pada Platform yang _756fb9'), 
    'Campaign adalah fitur pada Platform yang menampilkan, mengolah, dan menghubungkan data promosi yang dibuat oleh Pengguna ke channel-channel penjualan milik Pengguna melalui toko online tertentu.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Chat with Buyer adalah fitur yang disedia_ec539a'), 
    'Chat with Buyer adalah fitur yang disediakan pada Platform yang menampilkan, mengolah, dan menghubungkan pesan yang dibuat oleh Pengguna untuk pelanggan pihak ketiga ke channel-channel penjualan yang digunakan Pengguna melalui toko online tertentu.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Inventory Management adalah fitur yang di_1d2c4d'), 
    'Inventory Management adalah fitur yang disediakan pada Platform yang menampilkan, mengolah, dan menghubungkan data stok produk yang dimiliki Pengguna baik yang hanya terdaftar di Platform maupun yang terdaftar di pihak ketiga lain.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Terminologi berikut berlaku untuk Ketentu_c15328'), 
    'Terminologi berikut berlaku untuk Ketentuan Penggunaan ini, Kebijakan Privasi dan semua Perjanjian: “Pengguna”, “Pengguna” dan “Milik Pengguna” mengacu pada Pengguna, orang yang mendaftar, menggunakan dan/atau mengakses Platform ini dan mematuhi Ketentuan Penggunaan Perusahaan. “Perusahaan”, “Perusahaan”, dan “Milik Perusahaan”, mengacu pada PT Melaka Commerce Technologies.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_B. Akun, Kata Sandi, Keamanan, dan P_72bafb'), 
    'B. Akun, Kata Sandi, Keamanan, dan Pengaturan Layanan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Agar Pengguna dapat menggunakan layanan _a96e57'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_C. Ketentuan Umum Layanan'), 
    'C. Ketentuan Umum Layanan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/div_Perusahaan menyediakan berbagai macam f_8aff5b'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_D. Kewajiban Pengguna'), 
    'D. Kewajiban Pengguna')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Pengguna memahami bahwa dalam hal pihakn_d9296b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ul_mengutamakan Perdagangan barang danatau _d8a432'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_E. Ketentuan Perusahaan Untuk Menghu_5087a2'), 
    'E. Ketentuan Perusahaan Untuk Menghubungkan ke Toko Online Milik Pengguna')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Perusahaan menyediakan layanan kepada Pe_57b26e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Perusahaan dapat memperbarui ketentuan ke_e04772'), 
    'Perusahaan dapat memperbarui ketentuan kebijakan pada Platform untuk menghubungkan akun Pengguna di Platform ke toko(-toko) online milik Pengguna dan tindakan Pengguna untuk terus menggunakan layanan Platform untuk menghubungkan akun Pengguna di Platform ke toko online milik Pengguna setelah perubahan tersebut merupakan sebuah tindakan persetujuan dari Pengguna atas, dan Pengguna menyetujui seluruh, perubahan-perubahan yang dibuat oleh Perusahaan.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_F. Ketentuan Penggunaan Fitur Ngide Jualan'), 
    'F. Ketentuan Penggunaan Fitur Ngide Jualan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Fitur Ngide Jualan yang Perusahaan sedia_0e3c69'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_G. Transaksi Pembelian Layanan'), 
    'G. Transaksi Pembelian Layanan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Pengguna wajib melakukan transaksi pembe_aac419'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_H. Hak dan Batasan'), 
    'H. Hak dan Batasan')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Hak dan Batasan mengenai seluruh informas_35ddd5'), 
    'Hak dan Batasan mengenai seluruh informasi yang terdapat di Platform ini hanya diperlukan untuk penggunaan pribadi Pengguna untuk (i) melihat, (ii) menyimpan, (iii) mencetak, atau (iv) mengirimkannya melalui email terdaftar Pengguna. Pengguna diberikan hak terbatas, dapat dibatalkan, dan tidak eksklusif untuk membuat hyperlink ke beranda Platform selama tautan tersebut tidak menggambarkan Perusahaan, mitranya, atau produk serta layanan yang Perusahaan sediakan yang dianggap salah, menyesatkan, merendahkan, atau menyinggung pihak lainnya. Pengguna tidak boleh menggunakan logo Perusahaan, grafik, merek dagang dan/atau hak kekayaan intelektual lainnya milik Perusahaan sebagai bagian dari tautan tanpa izin tertulis dari Perusahaan. Pengguna setuju untuk tidak mereproduksi, memodifikasi, mendistribusikan, mendekompilasi, membongkar, atau merekayasa balik bagian mana pun dari Platform ini. Pengguna selanjutnya menyetujui bahwa Pengguna tidak akan menggunakan Platform ini untuk melakukan hal-hal sebagai berikut:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Mencoba mendapatkan akses secara tidak s_373523'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_(selanjutnya poin (i) sampai dengan (v) d_58ed04'), 
    '(selanjutnya poin (i) sampai dengan (v) disebut sebagai “Aktivitas Yang Dilarang”).')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Lebih lanjut, Pengguna tidak dapat'), 
    'Lebih lanjut, Pengguna tidak dapat:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Menampilkan (baik sebagian atau seluruhn_4f674a'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_I. Ketentuan Lisensi dan Hak Kekayaa_8eafe1'), 
    'I. Ketentuan Lisensi dan Hak Kekayaan Intelektual')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Kecuali dinyatakan lain, Perusahaan danat_a35028'), 
    'Kecuali dinyatakan lain, Perusahaan dan/atau pemberi lisensinya memiliki hak kekayaan intelektual untuk semua materi, layanan maupun konten yang tersedia di Platform. Semua hak kekayaan intelektual yang terdapat di Platform dilindungi oleh ketentuan peraturan perundang-undangan yang berlaku. Pengguna dapat mengakses seluruh materi, layanan maupun konten dari Platform untuk penggunaan pribadi Pengguna sendiri sehubungan dengan pembelian layanan ini berdasarkan pemberian lisensi terbatas, non-ekskusif, dapat ditarik kembali, tidak bisa dialihkan (tanpa hak untuk sub-lisensi) dari Perusahaan dan/atau pemberi lisensinya, dengan tunduk pada batasan yang ditetapkan dalam Ketentuan Penggunaan ini. Semua hak dan keistimewaan yang tidak secara nyata ditetapkan di dalam Ketentuan Penggunaan ini merupakan milik dari Perusahaan dan atau pemberi lisensinya dan Pengguna tidak memiliki hak apapun atas hak kekayaan intelektual yang tersedia dan/atau terdapat pada Platform selain dari yang secara tegas diatur di dalam Ketentuan Penggunaan ini.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Setiap penyalinan, pendistribusian, pembu_16e1f9'), 
    'Setiap penyalinan, pendistribusian, pembuatan produk turunan, penjualan, tawaran penjualan, dan penggunaan dari Platform, baik secara manual maupun digital, termasuk namun tidak terbatas pada penggunaan aplikasi emulator atau modifier, yang menyimpang dari Ketentuan Penggunaan ini atau tujuan yang wajar dari penggunaan Platform oleh Pengguna, merupakan pelanggaran dari hak kekayaan intelektual Perusahaan dan/atau pemberi lisensinya. Pengguna berkewajiban untuk mengganti rugi dan biaya-biaya hukum yang timbul dan/atau mungkin timbul kepada Perusahaan dan/atau pemberi lisensinya atas pelanggaran hak kekayaan intelektual milik Perusahaan dan/atau pemberi lisensinya.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Mempublikasikan ulang materi, layanan da_1dd576'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Salah satu layanan dari Platform ini yait_dbe8b3'), 
    'Salah satu layanan dari Platform ini yaitu Chat With Buyer dan/atau layanan semacamnya yang menawarkan kesempatan bagi Pengguna untuk mengolah dan mengirimkan pesan kepada pelanggan pihak ketiga di Chat With Buyer dan/atau layanan semacamnya di penjualan online milik Pengguna di platform lainnya, yang mungkin terintegrasi dengan Platform sesuai pilihan Pengguna. Perusahaan tidak memfilter, mengedit, menerbitkan, atau meninjau pesan-pesan tersebut di Platform. Sejauh diizinkan oleh ketentuan perundang-undangan yang berlaku, Perusahaan tidak akan bertanggung jawab atas pesan atau untuk setiap kewajiban, kerusakan atau biaya yang disebabkan dan/atau diderita sebagai akibat dari penggunaan layanan Chat With Buyer dan/atau layanan semacamnya di Platform.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Perusahaan berhak untuk memantau dan memp_06f3d6'), 
    'Perusahaan berhak untuk memantau dan memperingati Pengguna dalam penggunaan layanan tersebut yang dapat dianggap tidak pantas, menyinggung pihak lain, atau menyebabkan pelanggaran Ketentuan Penggunaan ini.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Pengguna menjamin dan menyatakan bahwa'), 
    'Pengguna menjamin dan menyatakan bahwa:')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Pengguna berhak untuk menggunakan layana_d8e0bc'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_J. Validitas Konten Situs Web'), 
    'J. Validitas Konten Situs Web')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Perusahaan akan mengambil semua langkah w_1e83e7'), 
    'Perusahaan akan mengambil semua langkah wajar untuk memastikan bahwa informasi yang tersedia di Platform benar. Perusahaan tidak dapat menjamin sepenuhnya mengenai kebenaran dan kelengkapan materi serta informasi yang ditampilkan atau disediakan di Platform ini, sehingga Perusahaan tidak bertanggung jawab atas pengeluaran atau kerugian yang terjadi atau tindakan yang diambil Pengguna sebagai akibat penerimaan informasi maupun materi berdasarkan Platform ini di mana keseluruhan resiko yang timbul atas penggunaan informasi dan materi pada Platform ini berada pada Pengguna. Namun, Perusahaan dapat dan akan melakukan pembaharuan dan/atau memperbaiki ketidakakuratan pada materi dan informasi yang tersedia di Platform ini kapan saja dan tanpa pemberitahuan sebelumnya kepada Pengguna.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Khusus untuk konten yang tersedia pada fi_41a7ec'), 
    'Khusus untuk konten yang tersedia pada fitur Ngide Jualan yang disediakan oleh Perusahaan sehubungan dengan ide dan inspirasi bisnis/usaha, Pengguna memahami bahwa konten tersebut dibuat oleh chatbot engine dengan menggunakan artificial intelligence milik pihak ketiga yang terintegrasi dengan Platform berdasarkan informasi yang Pengguna berikan dan/atau informasi yang telah berada di domain publik. Dengan demikian, Perusahaan tidak bertanggung jawab atas kebenaran, keakuratan, dan keseluruhan informasi yang tersedia atau dihasilkan oleh chatbot engine tersebut.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_K. Tanggung Jawab Pengguna'), 
    'K. Tanggung Jawab Pengguna')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Pengguna dengan ini menyetujui untuk bert_472fdf'), 
    'Pengguna dengan ini menyetujui untuk bertanggung jawab atas seluruh keputusan yang dibuat untuk menggunakan atau mengakses Platform, metode pembayaran, termasuk layanan yang disediakan oleh Perusahaan. Pengguna wajib bertanggung jawab atas setiap kerugian dan/atau klaim yang timbul dari penggunaan layanan pada Platform yang disediakan oleh Perusahaan, dengan cara yang bertentangan dengan Ketentuan Penggunaan ini, Kebijakan Privasi yang telah ditetapkan Perusahaan maupun ketentuan peraturan perundang-undangan yang berlaku, termasuk namun tidak terbatas untuk tujuan anti pencucian uang, anti pendanaan terorisme, aktivitas kriminal, penipuan dalam bentuk apapun (termasuk namun tidak terbatas pada kegiatan phishing dan/atau social engineering), pelanggaran hak kekayaan intelektual, dan/atau aktivitas lain yang merugikan publik dan/atau pihak lain manapun atau yang dapat atau dianggap dapat merusak reputasi Perusahaan.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Pengguna setuju untuk menggunakan seluruh_108a46'), 
    'Pengguna setuju untuk menggunakan seluruh layanan pada Platform atas risiko Pengguna sendiri. Pengguna menyatakan bahwa pihaknya akan senantiasa berhati-hati dalam memutuskan informasi apa yang Pengguna sediakan kepada Perusahaan, publik, dan/atau pihak ketiga lain. Selain itu, Kami tidak bertanggung jawab atas pengelakan pengaturan privasi atau tindakan keamanan apa pun yang terkandung di layanan Platform, atau situs web pihak ketiga.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_L. Batasan Tanggung Jawab Perusahaan'), 
    'L. Batasan Tanggung Jawab Perusahaan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/div_Perusahaan menyediakan Platform sebagai_5c51c5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_M. Tindakan Yang Dianggap Perlu Oleh_19f8ab'), 
    'M. Tindakan Yang Dianggap Perlu Oleh Perusahaan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/div_Dalam hal ditemukan atau Perusahaan mem_985008'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_N. Keadaan Kahar'), 
    'N. Keadaan Kahar')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Pengguna memahami dan menyetujui bahwa Pl_c59cec'), 
    'Pengguna memahami dan menyetujui bahwa Platform yang disediakan oleh Perusahaan dapat diinterupsi oleh kejadian di luar kewenangan atau kontrol Perusahaan, termasuk namun tidak terbatas pada bencana alam, gangguan listrik, gangguan telekomunikasi, kebijakan pemerintah, dan lain-lain (“Keadaan Kahar”). Pengguna menyetujui untuk membebaskan Perusahaan dari setiap tuntutan dan tanggung jawab, jika Perusahaan tidak dapat memfasilitasi layanan yang disediakan di Platform, termasuk memenuhi instruksi yang diberikan Pengguna melalui Platform, baik sebagian maupun seluruhnya, karena suatu Keadaan Kahar.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_O. Pelanggaran Oleh Pengguna'), 
    'O. Pelanggaran Oleh Pengguna')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Perusahaan berhak, atas kebijakan Perusa_0948e2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_P. Ganti Rugi'), 
    'P. Ganti Rugi')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/div_Pengguna dengan ini menyetujui untuk da_d7465c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_Q. Pernyataan dan Jaminan'), 
    'Q. Pernyataan dan Jaminan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/div_Pengguna dengan ini menyatakan dan menj_a29af3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_R. Pilihan Hukum'), 
    'R. Pilihan Hukum')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Ketentuan Penggunaan ini dan Kebijakan Pr_0b4fcc'), 
    'Ketentuan Penggunaan ini dan Kebijakan Privasi Perusahaan diatur oleh dan ditafsirkan sesuai dengan hukum Negara Republik Indonesia, tanpa memperhatikan pertentangan aturan hukum. Pengguna setuju bahwa tindakan hukum apapun atau sengketa yang mungkin timbul dari, berhubungan dengan, atau berada dalam cara apapun berhubungan dengan Platform dan/atau Ketentuan Penggunaan ini, maka akan diselesaikan secara eksklusif dalam yurisdiksi Pengadilan Negeri Jakarta Selatan untuk kepentingan penyelesaian sengketa dan/atau perselisihan apa pun sehubungan dengan atau yang ditimbulkan atas Ketentuan Penggunaan ini dan Kebijakan Privasi Perusahaan.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/strong_S. Pembaharuan'), 
    'S. Pembaharuan')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Ketentuan Penggunaan mungkin dapat diubah_febc34'), 
    'Ketentuan Penggunaan mungkin dapat diubah dan/atau diperbarui oleh Perusahaan dari waktu ke waktu. Perusahaan menyarankan agar Pengguna membaca secara seksama dan memeriksa halaman Ketentuan Penggunaan ini dari waktu ke waktu untuk mengetahui perubahan pada Ketentuan Penggunaan. Dengan tetap mengakses dan menggunakan layanan Platform, maka Pengguna menyatakan bahwa pihaknya menyetujui dan terikat serta tunduk kepada perubahan-perubahan dalam Ketentuan Penggunaan ini.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/h3_T. Lain-lain'), 
    'T. Lain-lain')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/ol_Tunduk pada perjanjian tambahan apa pun _352ea5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Term and Condition/Page_Syarat dan Ketentuan/p_Terakhir diperbarui November 2023'), 
    'Terakhir diperbarui: November 2023')

WebUI.closeBrowser()

