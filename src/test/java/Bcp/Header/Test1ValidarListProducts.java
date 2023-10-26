package Bcp.Header;

import Bcp.BaseTest;
import Bcp.BcpHome;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Screenshot;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Test1ValidarListProducts extends BaseTest {

    @Test
    public void validarListProducts(){

        String[] menuList = {"Cuentas","Tarjetas","Préstamos","Seguros","Inversiones","Tipo de cambio","Servicios"};
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

        log.info("Step 4 :Validar elementos de Productos");
        WebElement menuElement = getDriver().findElement(By.cssSelector("#bcp-mean-content > div > div.component-control.id-Z7_0064I3S0MOSC40ARML1T140074 > section > div.wpthemeControlBody._wpthemeOverflowAuto_.wpthemeClear > header > div.container.bcp_nivel2 > div > ul > li.bcp_categoria.con_opciones"));
        List<String> myList = menuElement.findElements(By.tagName("span")).stream().map(WebElement::getText).collect(Collectors.toList());
        assertThat(myList).contains(menuList);
        System.out.println(Screenshot.screenshot(getDriver()));
        myList.forEach(l ->{
            System.out.println(l);
        });
    }
}
