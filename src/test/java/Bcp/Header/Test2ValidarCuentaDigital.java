package Bcp.Header;
import Bcp.BaseTest;
import Bcp.BcpHome;
import Bcp.PageAbreTuCuenta;
import Bcp.cuentaPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Screenshot;
import org.openqa.selenium.By;
import java.util.List;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;


    @Slf4j
    public class Test2ValidarCuentaDigital extends BaseTest {

        @Test
        public void ValidarCuentaDigital() {
            log.info("Step 1: Navigate to viabcp.com");
            navigateTo("www.viabcp.com");

            log.info("Step 2 : Dar click en los cookies");
            BcpHome cookies = new BcpHome(getDriver());
            cookies.clickcookies();
            System.out.println(Screenshot.screenshot(getDriver()));

            log.info("Step 3 : Dar click en los Productos");
            BcpHome productos = new BcpHome(getDriver());
            productos.clickproductos();
            System.out.println(Screenshot.screenshot(getDriver()));

            log.info("Step 4 : Dar click en Cuentas");
            cuentaPage cuentas = new cuentaPage(getDriver());
            cuentas.clickcuentas();
            System.out.println(Screenshot.screenshot(getDriver()));

            log.info("Step 5 : Dar click en Cuenta Digital");
            cuentaPage cuentadigital = new cuentaPage(getDriver());
            cuentadigital.clickcuentadigital();
            System.out.println(Screenshot.screenshot(getDriver()));

          /*  WebElement menuElement = getDriver().findElement(By.cssSelector("#uhf-g-nav > ul"));
            List<String> mylist = menuElement.findElements(By.tagName("a")).stream()
                    .map(WebElement::getText)
                    .collect(Collectors.toList());*/

           log.info("Step 6 : Validar titulo Beneficios");
            assertThat(cuentadigital.labelTitleBeneficiosGetText("#bcp-mean-content > div > div.component-control.id-Z7_0064I3S0M86SC0AR690A0V0SU0 > section > div.wpthemeControlBody._wpthemeOverflowAuto_.wpthemeClear > main > div.container.bcp_grupo_titulos > div:nth-child(1) > div > h3 > p > span"))
                    .as("El titulo del producto no es el esperado")
                    .isEqualTo("Beneficios de tu Cuenta Digital BCP");

            log.info("Step 7 : Validar titulo tu Cuenta");
            assertThat(cuentadigital.labelTitleTuCuentaGetText())
                    .as("El titulo del producto no es el esperado")
                    .isEqualTo("Tu Cuenta Digital BCP en simples pasos");

            log.info("Step 8 : Validar titulo Todo lo que debes saber");
            assertThat(cuentadigital.labelTitleTodoGetText())
                    .as("El titulo del producto no es el esperado")
                    .isEqualTo("Todo lo que debes saber");

            log.info("Step 9 : Validar titulo Preguntas Frecuentes");
            assertThat(cuentadigital.labelTitlePreguntasGetText())
                    .as("El titulo del producto no es el esperado")
                    .isEqualTo("Preguntas Frecuentes");

            log.info("Step 7 : Dar click en Abrir Cuenta");
            PageAbreTuCuenta abreTuCuenta = new PageAbreTuCuenta(getDriver());
            abreTuCuenta.clickabretucuenta();
            System.out.println(Screenshot.screenshot(getDriver()));

            log.info("Step 8: valor Correo");
            abreTuCuenta.clicCorreoElectronico("brayansalazar@gmail.com");
            System.out.println(Screenshot.screenshot(getDriver()));

        }
    }

