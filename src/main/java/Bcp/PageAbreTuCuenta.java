package Bcp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitsHelpers;
import lombok.extern.slf4j.Slf4j;
import java.time.Duration;

@Slf4j
public class PageAbreTuCuenta {
    WebDriver driver;
   /// WebDriverWait wait;
   WaitsHelpers wait;

    public PageAbreTuCuenta(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WaitsHelpers(driver);
      ///  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[2]/div/div[2]/section/div[2]/main[1]/div/div/div/div/div/div/a/div")
    WebElement abretucuenta;

     @FindBy(xpath = "/html/body/vd-root/vd-default-layout/div[1]/main/vd-opening-account/div/div/vd-preferences/div/div[2]/div[2]/vd-preferences-form/form/div/div[1]/bcp-input/div/input")
     WebElement correoElectronico;

     @FindBy(xpath = "/html/body/vd-root/vd-default-layout/div[1]/main/vd-opening-account/div/div/vd-preferences/div/div[2]/div[2]/vd-preferences-form/form/div/div[2]/bcp-input/div/input")
     WebElement celularWeb;

  @FindBy(xpath = "/html/body/vd-root/vd-default-layout/div[1]/main/vd-opening-account/div/div/vd-preferences/div/div[2]/div[2]/div[1]/bcp-button/button")
  WebElement botonContinuar;

    public void clickabretucuenta() {
        wait.waitForElementByWebElement(abretucuenta, Duration.ofSeconds(10), Duration.ofSeconds(10));
        abretucuenta.click();
    }
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    /*public void clicCorreoElectronico(){
    correoElectronico.click();
    correoElectronico.sendKeys("brayansalazar@bcp.com"); */

    public void clicCorreoElectronico(String correo) {
        if (correo.matches(EMAIL_REGEX)) {
            correoElectronico.click();
            correoElectronico.sendKeys(correo);
            System.out.println("Tu correo es valido: " + correo);
        } else {
            System.out.println("Correo electrónico no válido: " + correo);
        }
    }

    private static final String CELULAR_REGEX = "^9\\d{8}$";

    public void clicCelular(String celular) {
        if (celular.matches(CELULAR_REGEX)) {
            celularWeb.click();
            celularWeb.sendKeys(celular);
            System.out.println("Tu celular es valido: " + celular);
        } else {
            System.out.println("Tu celular no válido: " + celular);
        }
        botonContinuar.click();
    }

/*public void clicBotonContinuar(){
        wait.waitForElementByWebElement(abretucuenta, Duration.ofSeconds(10), Duration.ofSeconds(10));
        botonContinuar.click();*/
    }





