package tests;
import pages.PageSsoLogin;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

import pages.PageSolCtrtds;
import pages.PageBoccAuthTel;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestPageBoccAuthTel2 {
	WebDriver driver;
	PageSsoLogin objSsoLogin;
	PageSolCtrtds objSolCtrtds;
	PageBoccAuthTel objBoccAuthTel;
	String dpath="./src/main/resources/chromedriver/chromedriver.exe";
	String SsoUrl="http://emx-mo-websites-q-01.azurewebsites.net/MX/EdenredSSO/Account/LogOn";
	String CsvPath ="./src/main/resources/excel/AuthTel.csv";
	FileReader file;
	CSVReader reader;
	String Valor[];
	//("1","3081", "Romulo Cuervo","6363180040636365", "102", "200","19.20")
	String BuscarPor=null;
	String Afiliado=null;
	String Despachador=null;
	String Tarjeta=null;
	String Mercancia=null;
	String Litros=null;
	String Precio=null;
	
	
	
	
	@BeforeTest
	public void Inicializar() {
		System.setProperty("webdriver.chrome.driver", dpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(SsoUrl);
	}
	
	@Test(priority =0)
	public void Test() throws CsvValidationException, IOException {
		objSsoLogin = new PageSsoLogin(driver);
		objSolCtrtds = new PageSolCtrtds(driver);	
		objBoccAuthTel = new PageBoccAuthTel(driver);
		String title1 = objSsoLogin.PageSsoGetTitle();
		Assert.assertEquals(title1, "Bienvenido a Edenred Secure");
		objSsoLogin.PageSSoMainFunction("bocccontrol", "Abcd1234");
		objSolCtrtds.PageSolCtrtdsMainFunction();
		String title2 = objSolCtrtds.PageSolCtrtdsGetTitle(); 
		//Assert.assertEquals(title2, "Index");
		file = new FileReader(CsvPath);
		reader = new CSVReader(file);
		while((Valor = reader.readNext())  != null){
			BuscarPor = Valor[0];
			Afiliado =Valor[1];
			Despachador =Valor[2];
			Tarjeta =Valor[3];
			Mercancia =Valor[4];
			Litros =Valor[5];
			Precio =Valor[6];
			objBoccAuthTel.PageSSoMainFunction(BuscarPor, Afiliado, Despachador, Tarjeta, Mercancia, Litros, Precio);
			String Resultado = objBoccAuthTel.PageBoccAuthTelPrincipal63000();
			Assert.assertEquals(Resultado, "3000 AUTORIZADA");
			
			  System.out.print("Fecha: ");
			  System.out.print(objBoccAuthTel.PageBoccAuthTelResumeFechaOp());
			  System.out.print("||");
			  System.out.print("Hora: ");
			  System.out.print(objBoccAuthTel.PageBoccAuthTelResumeHoraTrx());
			  System.out.print("||");
			  System.out.print("Autorización: ");
			  System.out.print(objBoccAuthTel.PageBoccAuthTelResumeNumAuto());
			  System.out.print("||");
			  System.out.print("Litros: ");
			  System.out.print(objBoccAuthTel.PageBoccAuthTelResumeCantLit());
			  System.out.print("||");
			  System.out.print("Total: ");
			  System.out.print(objBoccAuthTel.PageBoccAuthTelResumeTotalCom());
			  System.out.print("||");
			  System.out.print("Autorizado: ");
			  System.out.print(objBoccAuthTel.PageBoccAuthTelResumeMontoAut());
			  System.out.print("||");
			  System.out.print("Resultado: ");
			  System.out.print(objBoccAuthTel.PageBoccAuthTelResumeResultado());
			  System.out.println("");
			 
		}
		
	}
		
	
	
}
