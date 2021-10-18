package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import io.grpc.internal.ClientStream;
import lippia.web.constants.Practica1ClaseWebConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.util.List;

import static com.crowdar.core.actions.WebActionManager.*;

public class Practica1ClaseWebService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void criteriodeBusqueda(String text)  {
        setInput(Practica1ClaseWebConstants.INPUT_SEARCH_XPATH ,text);

    }

    public static void introducirMail(String text){
        setInput(Practica1ClaseWebConstants.INPUT_EMAIL_XPATH ,text);

    }

    public static void introducirPass(String text){
        setInput(Practica1ClaseWebConstants.INPUT_PASSW_XPATH ,text);

    }

    public static void clickBotonBuscar(){
        click(Practica1ClaseWebConstants.SEARCH_BUTTON_XPATH);
    }


    public static void clickBotonSort() {
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getMessage();
        }

        Select select = new Select(getElement(Practica1ClaseWebConstants.SELECT_SORT_XPATH));
        select.selectByIndex(6);

    }

    public static void clickBotonIniciar(){
        click(Practica1ClaseWebConstants.BUTTON_SIGNIN1_XPATH);
    }

    public static void clickBotonLogin(){
        click(Practica1ClaseWebConstants.BUTTON_LOGIN_XPATH);
    }



    public static void verificarResultadosBusqueda(String articulo){
        waitVisibility(Practica1ClaseWebConstants.SPAN_TEXT_XPATH);
        Assert.assertEquals(getText(Practica1ClaseWebConstants.SPAN_TEXT_XPATH),"\""+articulo.toUpperCase()+"\"");

    }

    public static void verificarOrdenamiento(){
        waitVisibility(Practica1ClaseWebConstants.UL_LIST_XPATH);
        Assert.assertTrue(RecorrerArray());

    }

    public static void verificarResultadosLogin(){
        waitVisibility(Practica1ClaseWebConstants.H1_TITULO_XPATH);
        Assert.assertEquals(getText(Practica1ClaseWebConstants.H1_TITULO_XPATH),"MY ACCOUNT","NO SE PUDO INICIAR SESION");
    }

    public static boolean RecorrerArray()  {
        boolean result = false;
        float num2 = 0;

        List<WebElement> list = getElements(Practica1ClaseWebConstants.SPAN_SORT_PRICE1);

        try {
            for (int i = 1; i < list.size() ; i+=2) {
                String cadena1 = list.get(i).getText();
                String val1 = cadena1.substring(1,cadena1.length()-1);

                if (Float.parseFloat(val1) > num2 ) {
                    num2 = Float.parseFloat(val1);
                    result = true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }



}
