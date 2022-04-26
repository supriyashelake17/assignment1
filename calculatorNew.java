package qsp;

public class calculatorNew {
	package testpack;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class CalculatorNew {
		
		WebDriver driver;
		SoftAssert softAssert=new SoftAssert();
		
		@Test
		@Parameters({"operationMultiplication","operationDivision","operationAddition","operationSubtraction"})
		public void calculatorOptions(String opM,String opD, String opA,String opS)
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.calculator.net");
			Reporter.log("The Multiplication Operation Started",true);
			driver.findElement(By.xpath("//span[.='4']")).click();
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			
			driver.findElement(By.xpath("//span[.='"+opM+"']")).click();
			
			driver.findElement(By.xpath("//span[.='5']")).click();
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='5']")).click();
			
			driver.findElement(By.xpath("//span[.='=']")).click();
			
			String answerOfMultiplication = driver.findElement(By.id("sciOutPut")).getText();
			System.out.println(answerOfMultiplication);
			answerOfMultiplication = answerOfMultiplication.trim();
			softAssert.assertEquals(answerOfMultiplication, "222075", "Multiplication Operation is giving Expected Results");
			
			driver.navigate().refresh();
			//_________________________________________________________
			Reporter.log("The Division Operation Started",true);
			driver.findElement(By.xpath("//span[.='4']")).click();
			driver.findElement(By.xpath("//span[.='0']")).click();
			driver.findElement(By.xpath("//span[.='0']")).click();
			driver.findElement(By.xpath("//span[.='0']")).click();
			
			driver.findElement(By.xpath("//span[.='"+opD+"']")).click();
			
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='0']")).click();
			driver.findElement(By.xpath("//span[.='0']")).click();
			
			driver.findElement(By.xpath("//span[.='=']")).click();
			
			String answerOfDivision = driver.findElement(By.id("sciOutPut")).getText();
			answerOfDivision=answerOfDivision.trim();
			softAssert.assertEquals(answerOfDivision, "20", "Division Operation is giving Expected Results");
		
			
			driver.navigate().refresh();
			
			//______________________________________________________
			Reporter.log("The Addition Operation Started",true);
			driver.findElement(By.xpath("//span[.='–']")).click();
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			driver.findElement(By.xpath("//span[.='4']")).click();
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			driver.findElement(By.xpath("//span[.='4']")).click();
			
			driver.findElement(By.xpath("//span[.='"+opA+"']")).click();
			
			driver.findElement(By.xpath("//span[.='3']")).click();
			driver.findElement(By.xpath("//span[.='4']")).click();
			driver.findElement(By.xpath("//span[.='5']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			driver.findElement(By.xpath("//span[.='4']")).click();
			driver.findElement(By.xpath("//span[.='5']")).click();
			
			
			driver.findElement(By.xpath("//span[.='=']")).click();
			
			String answerOfAddition = driver.findElement(By.id("sciOutPut")).getText();
			answerOfAddition=answerOfAddition.trim();
			softAssert.assertEquals(answerOfAddition, "111111", "Addition Operation is giving Expected Results");
		
		
			driver.navigate().refresh();
			
		    //___________________________________________________
			Reporter.log("The Substraction Operation Started",true);
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			driver.findElement(By.xpath("//span[.='4']")).click();
			driver.findElement(By.xpath("//span[.='8']")).click();
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			
			driver.findElement(By.xpath("//span[.='"+opS+"']")).click();
			
			driver.findElement(By.xpath("//span[.='–']")).click();
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			driver.findElement(By.xpath("//span[.='0']")).click();
			driver.findElement(By.xpath("//span[.='9']")).click();
			driver.findElement(By.xpath("//span[.='4']")).click();
			driver.findElement(By.xpath("//span[.='8']")).click();
			driver.findElement(By.xpath("//span[.='2']")).click();
			driver.findElement(By.xpath("//span[.='3']")).click();
			
			driver.findElement(By.xpath("//span[.='=']")).click();
			
			String answerOfSubstraction = driver.findElement(By.id("sciOutPut")).getText();
			answerOfSubstraction=answerOfSubstraction.trim();
			softAssert.assertEquals(answerOfSubstraction, "23329646", "Substraction Operation is giving Expected Results");
			driver.navigate().refresh();
			softAssert.assertAll();
			
		
			
			
		   
		}
	}



}
