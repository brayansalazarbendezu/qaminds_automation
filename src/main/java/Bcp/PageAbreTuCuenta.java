package Bcp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitsHelpers;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class PageAbreTuCuenta {
    WebDriver driver;

   WaitsHelpers wait;
    public PageAbreTuCuenta(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WaitsHelpers(driver);

    }

    @FindBy(xpath = "/html/body/vd-root/vd-default-layout/div[1]/main/vd-opening-account/div/div/vd-preferences/div/div[2]/div[2]/vd-preferences-form/form/div/div[1]/bcp-input/div/input")
    WebElement correoElectronico; //locator para el correo electronico

     @FindBy(xpath = "/html/body/vd-root/vd-default-layout/div[1]/main/vd-opening-account/div/div/vd-preferences/div/div[2]/div[2]/vd-preferences-form/form/div/div[2]/bcp-input/div/input")
     WebElement celularWeb; //locator para colocar el celular


    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    //Regex de estructura de correo
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
    //Regex para estructura de celular, que empiece con 9 y 9 digitos
    public void clicCelular(String celular) {
        if (celular.matches(CELULAR_REGEX)) {
            celularWeb.click();
            celularWeb.sendKeys(celular);
            System.out.println("Tu celular es valido: " + celular);
        } else {
            System.out.println("Tu celular no válido: " + celular);
        }

    }

    }





