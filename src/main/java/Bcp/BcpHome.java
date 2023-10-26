package Bcp;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitsHelpers;
import java.time.Duration;

@Slf4j
public class BcpHome {
     WebDriver driver;
     WaitsHelpers wait;

    public BcpHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WaitsHelpers(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[2]/div/div[1]/section/div[2]/main/div[1]/div/div[2]/button[2]")
    WebElement cookies;

    @FindBy(xpath = "/html/body/main/div[1]/div/div[2]/button[2]")
    WebElement cookies2;

    @FindBy(css = "#bcp-mean-content > div > div.component-control.id-Z7_0064I3S0MOSC40ARML1T140074 > section > div.wpthemeControlBody._wpthemeOverflowAuto_.wpthemeClear > header > div.container.bcp_nivel2 > div > ul > li.bcp_categoria.con_opciones")
    WebElement productos;

    public void clickcookies() {
        log.debug("Clic en los cookies");
        wait.waitForElementByWebElement(cookies, Duration.ofSeconds(10), Duration.ofSeconds(10));
        cookies.click();
    }

    public void clickcookies2() {
        log.debug("Clic en los cookies");
        wait.waitForElementByWebElement(cookies2, Duration.ofSeconds(10), Duration.ofSeconds(10));
        cookies2.click();
    }

    public void clickproductos() {
        log.debug("Clic en Header Productos");
        wait.waitForElementByWebElement(productos, Duration.ofSeconds(10), Duration.ofSeconds(10));
        productos.click();
    }
}
