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

WebUI.callTestCase(findTestCase('OpenSession'), [('SessionID') : 'tfgld4510m000'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('IntTransaction/img_gwt-Image'))

WebUI.click(findTestObject('IntTransaction/div_tfgld4510m000-1-tfgld418.t'))

WebUI.click(findTestObject('IntTransaction/div_tfgld4510m000-1-tfgld418.t'))

WebUI.click(findTestObject('IntTransaction/div_item_32'))

WebUI.click(findTestObject('IntTransaction/OrderNo'))

WebUI.setText(findTestObject('IntTransaction/OrderNo'), Order)

WebUI.click(findTestObject('IntTransaction/div_tfgld4510m000-1-button-std'))

WebUI.setText(findTestObject('IntTransaction/positionFilter'), Position)

WebUI.delay(2)

GlobalVariable.G_PartIssue = WebUI.getText(findTestObject('IntTransaction/partissue'))

WebUI.click(findTestObject('IntTransaction/FinTrasactionFilter'))

WebUI.click(findTestObject('IntTransaction/COGSoption'))

WebUI.delay(2)

GlobalVariable.G_COGS = WebUI.getText(findTestObject('IntTransaction/partissue'))

WebUI.click(findTestObject('IntTransaction/FinTrasactionFilter'))

WebUI.click(findTestObject('IntTransaction/RevenueAnalysisOption'))

WebUI.delay(2)

GlobalVariable.G_RevenueAnalysis = WebUI.getText(findTestObject('IntTransaction/partissue'))

println(' Part issue entry ' + GlobalVariable.G_PartIssue)

println(' COGS Entry ' + GlobalVariable.G_COGS)

println(' Ravenue Analysis ' + GlobalVariable.G_RevenueAnalysis)

