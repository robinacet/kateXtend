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

WebUI.callTestCase(findTestCase('OpenSession'), [('SessionID') : 'tfgld4201m000'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Finalize/div_tfgld4201m000-0-tror.f-7-c'))

WebUI.click(findTestObject('Finalize/label_Parts (Sales)'))

WebUI.click(findTestObject('Finalize/img_gwt-Image'))

WebUI.click(findTestObject('Finalize/label_26'))

WebUI.click(findTestObject('Finalize/div_tfgld4201m000-0-button-for'))

WebUI.delay(10)

WebUI.callTestCase(findTestCase('OpenSession'), [('SessionID') : 'tfgld4510m000'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('IntTransaction/img_gwt-Image'))

WebUI.click(findTestObject('IntTransaction/div_tfgld4510m000-1-tfgld418.t'))

WebUI.click(findTestObject('IntTransaction/div_tfgld4510m000-1-tfgld418.t'))

WebUI.click(findTestObject('IntTransaction/div_item_32'))

WebUI.click(findTestObject('IntTransaction/OrderNo'))

WebUI.setText(findTestObject('IntTransaction/OrderNo'), GlobalVariable.G_PSO)

WebUI.click(findTestObject('IntTransaction/div_tfgld4510m000-1-button-std'))

WebUI.setText(findTestObject('IntTransaction/positionFilter'), '10')

WebUI.delay(2)

status = WebUI.getText(findTestObject('Finalize/TransactionStatus'))

WebUI.verifyEqual(status, 'Posted')

WebUI.click(findTestObject('IntTransaction/FinTrasactionFilter'))

WebUI.click(findTestObject('IntTransaction/COGSoption'))

WebUI.delay(2)

status = WebUI.getText(findTestObject('Finalize/TransactionStatus'))

WebUI.verifyEqual(status, 'Posted')

WebUI.click(findTestObject('IntTransaction/FinTrasactionFilter'))

WebUI.click(findTestObject('IntTransaction/RevenueAnalysisOption'))

WebUI.delay(2)

status = WebUI.getText(findTestObject('Finalize/TransactionStatus'))

WebUI.verifyEqual(status, 'Posted')

WebUI.callTestCase(findTestCase('OpenSession'), [('SessionID') : 'tfgld1504m000'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Finalize/div_tfgld1504m000-1-button-std'))

WebUI.setText(findTestObject('Finalize/input_tfgld1504m000-2-tfgld018'), GlobalVariable.G_InvoiceNo_1)

WebUI.click(findTestObject('Finalize/input_tfgld1504m000-2-tfgld018 (1)'))

WebUI.setText(findTestObject('Finalize/input_tfgld1504m000-2-tfgld018 (1)'), GlobalVariable.G_InvoiceNo_2)

WebUI.click(findTestObject('Finalize/img_tfgld1504m000-2-__exact.ma'))

WebUI.click(findTestObject('Finalize/div_tfgld1504m000-2-button-std'))

WebUI.delay(2)

WebUI.click(findTestObject('Finalize/div_tfgld1504m000-1-button-std (1)'))

WebUI.click(findTestObject('Finalize/label_ransaction Lines... (1)'))

debit = WebUI.getText(findTestObject('Finalize/div_tfgld1508m000-3-grid-1-deb'))

credit = WebUI.getText(findTestObject('Finalize/div_tfgld1508m000-3-grid-1-cre'))

WebUI.verifyEqual(debit, '88')

WebUI.verifyEqual(credit, '80')

WebUI.closeBrowser()

