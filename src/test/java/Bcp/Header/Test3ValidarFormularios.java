package Bcp.Header;

import Bcp.BaseTest;
import Bcp.BcpHome;
import Bcp.PageAbreTuCuenta;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import utils.Screenshot;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Test3ValidarFormularios extends BaseTest {

    @Test //Test para validar el formulario del correo y celular
    public void Test3ValidarFormularios() {


        log.info("Step 1: Navigate to viabcp.com");
        navigateTo("www.abretucuenta.viabcp.com/#/preferencias?codProd=PRICTA&pcid=viabcp:cuentas-cuenta-ahorro-cuenta-digital-bcp:cuenta-digital:masivo:banner-principal");

        log.info("Step 2 : Dar click en los cookies");
        BcpHome cookies2 = new BcpHome(getDriver());
        cookies2.clickcookies2();
        System.out.println(Screenshot.screenshot(getDriver()));

        log.info("Step 3: validar formulario Correo");
        PageAbreTuCuenta abreTuCuenta = new PageAbreTuCuenta(getDriver());
        abreTuCuenta.clicCorreoElectronico("brayansalazarbcp.com.pe");

        log.info("Step 4: Validar Formulario Celular");
        abreTuCuenta.clicCelular("890231976");
        System.out.println(Screenshot.screenshot(getDriver()));


    }
}