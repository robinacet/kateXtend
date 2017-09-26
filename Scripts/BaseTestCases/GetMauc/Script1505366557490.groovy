import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.supercsv.cellprocessor.ParseInt as ParseInt

WebUI.callTestCase(findTestCase('OpenSession'), [('SessionID') : 'whina1512m000'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MAUC/div_whina1512m000-0-button-std'))

WebUI.delay(3)

WebUI.click(findTestObject('MAUC/input_whina1512m000-1-whinr112'))

WebUI.setText(findTestObject('MAUC/input_whina1512m000-1-whinr112'), PartName)

WebUI.click(findTestObject('MAUC/input_whina1512m000-1-whinr112 (1)'))

WebUI.setText(findTestObject('MAUC/input_whina1512m000-1-whinr112 (1)'), Warehouse)

WebUI.click(findTestObject('MAUC/label_OK'))

not_run: WebUI.click(findTestObject('MAUC/img_gwt-Image'))

WebUI.delay(3)

WebUI.click(findTestObject('MAUC/scrolltolast'))

WebUI.click(findTestObject('MAUC/checkbox_mauc_selectHeader'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MAUC/option_mauc_selectAll'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('MAUC/button_mauc_action'))

WebUI.click(findTestObject('MAUC/label_I ventory Receipt Transa'))

GlobalVariable.G_Line1Mauc = ((WebUI.getText(findTestObject('MAUC/label_18.4369'))) as Float)

//GlobalVariable.G_Line1Mauc = GlobalVariable.G_Line1Mauc * Qty
println(GlobalVariable.G_Line1Mauc)

GlobalVariable.G_Line1Mauc =GlobalVariable.G_Line1Mauc

