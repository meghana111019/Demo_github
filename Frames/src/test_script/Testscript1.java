package test_script;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Bm_af;
import pom_script.pom1;

public class Testscript1 extends Bm_af
{
@Test(dataProvider = "testdata" )
public void test1(String d1,String d2)throws InterruptedException
{
	pom1 p= new pom1(driver);
	p.emailData(d1);
	p.pwdData(d2);
	p.clickLogin();
}
@DataProvider(name="testdata")
public Object[][]createData1()
{
	return new Object[][]{
		{"7406050885","Meghas@25"},
		{"megha","1234"}};
}
}