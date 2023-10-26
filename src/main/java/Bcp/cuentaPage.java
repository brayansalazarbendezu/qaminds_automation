package Bcp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WaitsHelpers;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class cuentaPage {
    WebDriver driver;
    ///WebDriverWait wait;
    WaitsHelpers wait;
    public cuentaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WaitsHelpers(driver);
        ///wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[2]/div/div[1]/section/div[2]/header/div[3]/div/ul/li[1]/div/li[1]/button")
    WebElement cuentas; //locator para el botón Cuentas
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[2]/div/div[1]/section/div[2]/header/div[3]/div/ul/li[1]/div/li[1]/div/ul/li[1]/a")
    WebElement cuentadigital; //locator para el botón Cuenta Digital


    public void clickcuentas() {
        ///wait.until(ExpectedConditions.visibilityOf(cuentas)).click();
        wait.waitForElementByWebElement(cuentas, Duration.ofSeconds(10), Duration.ofSeconds(10));
        cuentas.click();
    }
    public void clickcuentadigital() {
        wait.waitForElementByWebElement(cuentadigital, Duration.ofSeconds(10), Duration.ofSeconds(10));
        cuentadigital.click();
        /* wait.until(ExpectedConditions.visibilityOf(cuentadigital)).click();*/
    }

    private WebElement labelTitleBeneficios(String selector) {

        return driver.findElement(By.cssSelector(selector));
    }
    public String labelTitleBeneficiosGetText(String selector) {

        return labelTitleBeneficios(selector).getText();
    }


    private WebElement labelTitleTuCuenta() {
        return driver.findElement(By.cssSelector("#\\31 235e478-0d31-4b01-a23a-d22f87286122 > div.container > h2"));
    }
    public String labelTitleTuCuentaGetText() {

        return labelTitleTuCuenta().getText();
    }


    private WebElement labelTitleTodo() {
        return driver.findElement(By.cssSelector("#\\38 2736044-e5c8-42dd-b271-ef21d8a4cdc2 > div > h3"));
    }
    public String labelTitleTodoGetText() {

        return labelTitleTodo().getText();
    }


    private WebElement labelTitlePreguntas() {
        return driver.findElement(By.cssSelector("#bcp-mean-content > div > div.component-control.id-Z7_8ILI09412PFL7064OB3U5N2I91 > section > div.wpthemeControlBody._wpthemeOverflowAuto_.wpthemeClear > div.bcp_preguntas_frecuentes_sin_categorias > div > div > div > div.bcp_content_titulo > h2"));
    }
    public String labelTitlePreguntasGetText() {
        return labelTitlePreguntas().getText();

    }
}