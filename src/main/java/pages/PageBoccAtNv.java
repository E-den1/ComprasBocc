package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;



public class PageBoccAtNv {
	WebDriver driver;
	 By boccMenOp = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div/ul/li[2]/a");
	 By boccMenAtNv = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div/ul/li[2]/ul/li[6]/a");
	 By boccAtNvBuscarPor = By.name("ctl00$contenido$drpOpcionBusqueda");
	 By boccAtNvParametro = By.name("ctl00$contenido$txtParametro");
	 By boccAtNvBuscar = By.name("ctl00$contenido$btnBuscarAfiliado");
	 By boccAtNvSelAfil = By.name("ctl00$contenido$gvAfiliado$ctl02$imbEditar");
	 By boccAtNvDespachador = By.name("ctl00$contenido$tbNombreDespachador");
	 By boccAtNvMedioTrx = By.name("ctl00$contenido$txtCardNumber");
	 By boccAtNvbuscarCard = By.name("ctl00$contenido$btnBuscarTarjeta");
	 By	boccAtNvMercancias = By.name("ctl00$contenido$ddlMercancia");
	 By boccAtNvbuscarNotas = By.name("ctl00$contenido$btnSearchNv");
	 By boccAtNvMarcarNv = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[9]/div[2]/div[1]/div/div/table/tbody/tr[2]/td[3]/input");
	 By boccAtNvConsumirNv = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[9]/div[2]/div[1]/div/div/table/tbody/tr[2]/td[1]/input");
	 By boccAtNvCantidad = By.xpath("ctl00$contenido$txtQuantity");
	 By boccAtNvPrecioSur = By.xpath("ctl00$contenido$txtPrice");
	 By boccAtNvComprar = By.xpath("ctl00$contenido$btnPurchase");
	 By boccAtNvConfComp = By.name("ctl00$contenido$PopPupConfirm$btnOk");
	 By boccAtNvResultado = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[18]");
	 //Elementos de Salida
	 By boccAtNvFechaOp = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[2]");
	 By boccAtNvHoraTrx = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[4]");
	 By boccAtNvNumAuto = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[6]");
	 By boccAtNvCantLit = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[8]");
	 By boccAtNvPrecioXL = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[10]");
	 By boccAtNvTotalCom = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[12]");
	 By boccAtNvMontoAut = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[14]");
	 By boccAtNvResultadof = By.xpath("/html/body/form/div[4]/div/div/div[1]/div[5]/div[3]/div/fieldset/span[18]");
	 
	 public PageBoccAtNv(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 	public void PageBoccAtNvPrincipal() {
	 		driver.findElement(boccMenOp).click();
	 		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		driver.findElement(boccMenAtNv).click();
	 	}
	 	
	 	/*1. Proporcione datos del afiliado*/
	 	
		/* Seleccionar el tipo de búsqueda
		 * 1 - Código de Afiliado
		 * 2 - Número Estación
		 * 3 - Razón Social
		 * 0 - Seleccione... 
		 */
	 	public void PageBoccAtNvPrincipal1BuscarPor(String busqueda) {
	 		Select  object1 = new Select(driver.findElement(boccAtNvBuscarPor));
	 		object1.selectByValue(busqueda);
	 	}
	 	
	 	/*Enviar Afiliado*/
	 	public void PageBoccAtNvPrincipal1Parametro(String param) {
	 		driver.findElement(boccAtNvParametro).clear();
	 		driver.findElement(boccAtNvParametro).sendKeys(param);
	 		
	 	}
	 	/*Clic en buscar afiliado*/
	 	public void PageBoccAtNvPrincipal1ClicBuscar() {
	 		driver.findElement(boccAtNvBuscar).click();
	 	}
	 	
	 	/*Clic seleccionar afiliado*/
		public void PageBoccAtNvPrincipal1BSelectAfil() {
			driver.findElement(boccAtNvSelAfil).click();
		}
		
		/*Enviar el despachador*/
		public void PageBoccAtNvPrincipal1SetDespachador(String despacha) {
			driver.findElement(boccAtNvDespachador).clear();
			driver.findElement(boccAtNvDespachador).sendKeys(despacha);
		}
		
		/*2.- Proporcione el medio de transacción*/
		
		/*Ingresar el Medio --TArjeta*/
		public void PageBoccAtNvPrincipal2SetMedio(String medio) {
			driver.findElement(boccAtNvMedioTrx).clear();
			driver.findElement(boccAtNvMedioTrx).sendKeys(medio);
		}
		
		/*Clic en Buscar */
		public void PageBoccAtNvPrincipal2ClicBuscar() {
			driver.findElement(boccAtNvbuscarCard).click();
		}
		
		/*Seleccionar mercancía */
		public void PageBoccAtNvPrincipal4SelMerc(String mercancia) {
			Select objt2 = new Select(driver.findElement(boccAtNvMercancias));
			objt2.selectByValue(mercancia);
		}
		
		/*Clic Buscar Notas */
		public void PageBoccAtNvPrincipal4BuscarNv() {
			driver.findElement(boccAtNvbuscarNotas).click();
		}
		
		/*Marcar NV */
		public void PageBoccAtNvPrincipal4MarcarNv() {
			driver.findElement(boccAtNvMarcarNv).click();
		}
		
		/*Marcar NV */
		public void PageBoccAtNvPrincipal4ConsumirNv() {
			driver.findElement(boccAtNvConsumirNv).click();
		}

		/*6.- Proporcione Datos de la Transacción*/
		
		/*Ingresar Cantidad Litros*/
		public void PageBoccAtNvPrincipal6SetCant(String cantidad) {
			driver.findElement(boccAtNvCantidad).clear();
			driver.findElement(boccAtNvCantidad).sendKeys(cantidad);
		}
		
		/*Ingresar precio surtidor*/
		public void PageBoccAtNvPrincipal6precioSur(String precioS) {
			driver.findElement(boccAtNvPrecioSur).clear();
			driver.findElement(boccAtNvPrecioSur).sendKeys(precioS);
		}
		
		/*Clic en comprar*/
		public void PageBoccAtNvPrincipal6ClicCom() {
			driver.findElement(boccAtNvPrecioSur).click();
		}
		
		/*Clic en confirmar*/
		public void PageBoccAtNvPrincipal6ClicConf() {
			driver.findElement(boccAtNvConfComp).click();
		}
		/*Retorna el estatus de la trx --Esperado 3000*/
		public String PageBoccAuthTelPrincipal63000() {
			return driver.findElement(boccAtNvResultado).getText();
		}
		
		//Recuperación de Info de salida
				public String  PageBoccAtNvResumeFechaOp() {
					return driver.findElement(boccAtNvFechaOp).getText(); 
				
				}
				
				public String PageBoccAtNvResumeHoraTrx() {
					return driver.findElement(boccAtNvHoraTrx).getText(); 
					
				}
				
				public String PageBoccAtNvResumeNumAuto() {
					return driver.findElement(boccAtNvNumAuto).getText(); 
					
				}
				
				public String PageBoccAtNvResumeCantLit() {
					return driver.findElement(boccAtNvCantLit).getText(); 
					
				}
				
				public String PageBoccAtNvResumePrecioXL() {
					return driver.findElement(boccAtNvPrecioXL).getText(); 

				}
				
				public String PageBoccAtNvResumeTotalCom() {
					return driver.findElement(boccAtNvTotalCom).getText(); 
					
				}
				
				public String  PageBoccAtNvResumeMontoAut() {
					return driver.findElement(boccAtNvMontoAut).getText();
				}
				
				public void PageSSoAtNvMainFunction(String v1,String v2, String v3,String v4,String v5, String v6, String v7) {
					this.PageBoccAtNvPrincipal();
					this.PageBoccAtNvPrincipal1BuscarPor(v1);
					this.PageBoccAtNvPrincipal1Parametro(v2);
					this.PageBoccAtNvPrincipal1ClicBuscar();
					this.PageBoccAtNvPrincipal1BSelectAfil();
					this.PageBoccAtNvPrincipal1SetDespachador(v3);
					this.PageBoccAtNvPrincipal2SetMedio(v4);
					this.PageBoccAtNvPrincipal2ClicBuscar();
					this.PageBoccAtNvPrincipal4SelMerc(v5);
					this.PageBoccAtNvPrincipal4BuscarNv();
					this.PageBoccAtNvPrincipal4MarcarNv();
					this.PageBoccAtNvPrincipal4ConsumirNv();
					this.PageBoccAtNvPrincipal6SetCant(v6);
					this.PageBoccAtNvPrincipal6precioSur(v7);
					this.PageBoccAtNvPrincipal6ClicCom();
					this.PageBoccAtNvPrincipal6ClicConf();
					
				}
}