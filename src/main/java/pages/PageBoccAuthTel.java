package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class PageBoccAuthTel {
	WebDriver driver;         
	By boccMenOp = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div/ul/li[2]/a");
	By boccMenAuthtel = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div/ul/li[2]/ul/li[2]/a");
	By boccAtBuscarPor = By.name("ctl00$contenido$drpOpcionBusqueda"); 
	By boccAtParametro = By.name("ctl00$contenido$txtParametro");
	By boccAtBuscar = By.name("ctl00$contenido$btnBuscarAfiliado");
	By boccAtSelAfiliado = By.name("ctl00$contenido$gvAfiliado$ctl02$imbEditar");
	By boccAtDespachador = By.name("ctl00$contenido$tbNombreDespachador");
	By boccAtMedioTrx = By.name("ctl00$contenido$txtCardNumber");
	By boccAtBuscarCard = By.name("ctl00$contenido$btnBuscarTarjeta");
	By boccAtMercancias = By.name("ctl00$contenido$ddlMercancia");
	By boccAtCantidad = By.name("ctl00$contenido$txtQuantity");
	By boccAtPrecioSur = By.name("ctl00$contenido$txtPrice");
	By boccAtComprar = By.name("ctl00$contenido$btnPurchase");
	By boccAtConfCom = By.name("ctl00$contenido$PopPupConfirm$btnOk");
	By boccAtResultado = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[18]");
	//Elementos Salida
	  By FechaOp = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[2]");
	  By HoraTrx = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[4]");
	  By NumAuto = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[6]");
	  By CantLit = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[8]");
	  By PrecioXL = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[10]");
	  By TotalCom = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[12]");
	  By MontoAut = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[14]");
	  By Resultado = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[18]");
	 
	
	public PageBoccAuthTel(WebDriver driver) {
		this.driver=driver;
	}
		/*Ingresar a la pantalla principal Autorización teléfonica*/
	
		public void PAgeBoccAuthTelPrincipal() {
			driver.findElement(boccMenOp).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(boccMenAuthtel).click();
		}
		/*1. Proporcione datos del afiliado*/
			/* Seleccionar el tipo de búsqueda
			 * 1 - Código de Afiliado
			 * 2 - Número Estación
			 * 3 - Razón Social
			 * 0 - Seleccione... 
			 */
		public void PageBoccAuthTelPrincipal1BuscarPor(String valor) {
			Select objt1 = new Select(driver.findElement(boccAtBuscarPor));
			objt1.selectByValue(valor);
	}
			/*Enviar el código del afiliado*/
		public void PageBoccAuthTelPrincipal1SetParametro(String Param) {
			driver.findElement(boccAtParametro).clear();
			driver.findElement(boccAtParametro).sendKeys(Param);
		}
			/*Clic en Buscar Afiliado*/
		public void PageBoccAuthTelPrincipal1ClicBuscar() {
			driver.findElement(boccAtBuscar).click();
		}
			/*Seleccionar el Afiliado*/
		public void PageBoccAuthTelPrincipal1BSelectAfil() {
			driver.findElement(boccAtSelAfiliado).click();
		}
		
			/*Enviar el despachador*/
		public void PageBoccAuthTelPrincipal1SetDespachador(String vendedor) {
			driver.findElement(boccAtDespachador).clear();
			driver.findElement(boccAtDespachador).sendKeys(vendedor);
		}
		
		/*2.- Proporcione el medio de transacción*/
		
			/*Ingresar el Medio --TArjeta*/
		public void PageBoccAuthTelPrincipal2SetMedio(String medio) {
			driver.findElement(boccAtMedioTrx).clear();
			driver.findElement(boccAtMedioTrx).sendKeys(medio);
		}
		
		/*Clic en Buscar */
		public void PageBoccAuthTelPrincipal2ClicBuscar() {
			driver.findElement(boccAtBuscarCard).click();
		}
		
		/*4.- Seleccionar Mercancias*/
			/* 101 --
			 * 102 --
			 * 103 --
			 * 0 --
			 */
		
		public void PageBoccAuthTelPrincipal4SelMerc(String valor) {
			Select objt2 = new Select(driver.findElement(boccAtMercancias));
			objt2.selectByValue(valor);
		}
		
		/*6.- Proporcione Datos de la Transacción*/
			/*Ingresar Cantidad Litros*/
		
		public void PageBoccAuthTelPrincipal6SetCant(String valor) {
			driver.findElement(boccAtCantidad).clear();
			driver.findElement(boccAtCantidad).sendKeys(valor);
		}
			/*Ingresar precio surtidor*/
			
		public void PageBoccAuthTelPrincipal6SetPreci(String valor) {
			driver.findElement(boccAtPrecioSur).clear();
			driver.findElement(boccAtPrecioSur).sendKeys(valor);
		}
		
			/*Clic en el botón Comprar*/
		
		public void PAgeBoccAuthTelPrincipal6clicCom() {
			driver.findElement(boccAtComprar).click();
		}
		
			/*Clic en Confirmar*/
		public void PageBoccAuthTelPrincipal6clicConf() {
			driver.findElement(boccAtConfCom).click();
		}
		
		public String PageBoccAuthTelPrincipal63000() {
			return driver.findElement(boccAtResultado).getText();
		}
		
		//Recuperación de Info de salida
		public String  PageBoccAuthTelResumeFechaOp() {
			return driver.findElement(FechaOp).getText(); 
		
		}
		
		public String PageBoccAuthTelResumeHoraTrx() {
			return driver.findElement(HoraTrx).getText(); 
			
		}
		
		public String PageBoccAuthTelResumeNumAuto() {
			return driver.findElement(NumAuto).getText(); 
			
		}
		
		public String PageBoccAuthTelResumeCantLit() {
			return driver.findElement(CantLit).getText(); 
			
		}
		
		public String PageBoccAuthTelResumePrecioXL() {
			return driver.findElement(PrecioXL).getText(); 

		}
		
		public String PageBoccAuthTelResumeTotalCom() {
			return driver.findElement(TotalCom).getText(); 
			
		}
		
		public String  PageBoccAuthTelResumeMontoAut() {
			return driver.findElement(MontoAut).getText(); 

		}
		
		public String  PageBoccAuthTelResumeResultado() {
			return driver.findElement(Resultado).getText(); 
			
		}
		
		/*
		 * public void PageSsoResultado() { this.PageBoccAuthTelResumeFechaOp();
		 * this.PageBoccAuthTelResumeHoraTrx(); this.PageBoccAuthTelResumeNumAuto();
		 * this.PageBoccAuthTelResumeCantLit(); this.PageBoccAuthTelResumePrecioXL();
		 * this.PageBoccAuthTelResumeTotalCom(); this.PageBoccAuthTelResumeMontoAut();
		 * this.PageBoccAuthTelResumeResultado(); }
		 */
	
	public void PageSSoMainFunction	(String v1, String v2, String v3,String v4, String v5, String v6, String v7) {
		this.PAgeBoccAuthTelPrincipal();
		this.PageBoccAuthTelPrincipal1BuscarPor(v1);
		this.PageBoccAuthTelPrincipal1SetParametro(v2);
		this.PageBoccAuthTelPrincipal1ClicBuscar();
		this.PageBoccAuthTelPrincipal1BSelectAfil();
		this.PageBoccAuthTelPrincipal1SetDespachador(v3);
		this.PageBoccAuthTelPrincipal2SetMedio(v4);
		this.PageBoccAuthTelPrincipal2ClicBuscar();
		this.PageBoccAuthTelPrincipal4SelMerc(v5);
		this.PageBoccAuthTelPrincipal6SetCant(v6);
		this.PageBoccAuthTelPrincipal6SetPreci(v7);
		this.PAgeBoccAuthTelPrincipal6clicCom();
		this.PageBoccAuthTelPrincipal6clicConf();
		
		
		
		
	}
}		
