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

WebUI.click(findTestObject('tdtre4101m002/div_tdtre4101m002-1-button-std'))

not_run: WebUI.delay(10)

WebUI.click(findTestObject('tdtre4101m002/PickPackInvoice'))

WebUI.click(findTestObject('tdtre4101m002/label_Location'))

WebUI.click(findTestObject('tdtre4101m002/div_dlg-tdtre4101m002-1-input-'))

not_run: WebUI.click(findTestObject('tdtre4101m002/div_dlg-tdtre4101m002-1-input-'))

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('tdtre4101m002/input_ttstpsplopen-5-devc-1-lo'), 'd')

WebUI.click(findTestObject('tdtre4101m002/label_Continue'))

WebUI.delay(15)

WebUI.click(findTestObject('tdtre4101m002/PSO_multiOCC'))

WebUI.click(findTestObject('tdtre4101m002/PSO_multiOCC_PSOfilter'))

WebUI.setText(findTestObject('tdtre4101m002/PSO_multiOCC_PSOfilter'), GlobalVariable.G_PSO)

WebUI.sendKeys(findTestObject('tdtre4101m002/PSO_multiOCC_PSOfilter'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('tdtre4101m002/PSO_mutliocc_customerfilter'))

WebUI.scrollToElement(findTestObject('tdtre4101m002/PSO_multiOCC_status'), 10)

status1 = WebUI.getText(findTestObject('tdtre4101m002/PSO_multiOCC_status'))

println(status1)

WebUI.verifyEqual(status1, 'Completed')

WebUI.click(findTestObject('tdtre4101m002/PSOTab'))

G_PSOheader_InvoiceAmt = WebUI.getAttribute(findTestObject('tdtre4101m002/InvoiceTotal'), 'value')

