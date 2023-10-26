package Bcp.Header;

import Bcp.BaseTest;
import Bcp.BcpHome;
import Bcp.PageAbreTuCuenta;
import Bcp.cuentaPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Screenshot;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Test4AbrirCuenta extends BaseTest {

    @Test
    public void Test4AbrirCuenta() {

        log.info("Step 1: Navigate to viabcp.com");
        navigateTo("www.abretucuenta.viabcp.com/#/preferencias?codProd=PRICTA&pcid=viabcp:cuentas-cuenta-ahorro-cuenta-digital-bcp:cuenta-digital:masivo:banner-principal");

        log.info("Step 2 : Dar click en los cookies");
        BcpHome cookies2 = new BcpHome(getDriver());
        cookies2.clickcookies2();
        System.out.println(Screenshot.screenshot(getDriver()));

        log.info("Step 8: valor Correo");
        PageAbreTuCuenta abreTuCuenta = new PageAbreTuCuenta(getDriver());
        abreTuCuenta.clicCorreoElectronico("brayansalazar@bcp.com.pe");


        log.info("Step 9: valor Correo");
        abreTuCuenta.clicCelular("990231976");
        System.out.println(Screenshot.screenshot(getDriver()));

      ///log.info("Step 10: boton Continuar");
      ///abreTuCuenta.clicBotonContinuar();


    }
}