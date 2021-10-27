package lippia.web.constants;

import org.openqa.selenium.By;


public class Practica1ClaseWebConstants {

    public static final String SELECT_SORT_XPATH = "xpath://select[contains(@id,'selectProductSort')]";
    public static final By OPTION = By.xpath("xpath://option[contains(@value,'reference:asc')]");

    public static final String SPAN_TEXT_XPATH = "xpath://*[@id=\"center_column\"]/h1/span[1]";
    public static final String SPAN_SORT_PRICE1 = "xpath://div[@class='right-block']/div[@class='content_price']/span[contains(@class,'price product-price')]";

    public static final String SPAN_SORT_PRICE2 = "xpath://*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[1]/span";

    public static final String SEARCH_BUTTON_XPATH = "xpath://*[@id=\"searchbox\"]/button";
    public static final String BUTTON_SIGNIN1_XPATH = "xpath://a[contains(@title,'Log')]";
    public static final String BUTTON_LOGIN_XPATH = "xpath://button[@id='SubmitLogin']";

    public static final String INPUT_SEARCH_XPATH = "xpath://*[@id=\"search_query_top\"]";
    public static final String INPUT_EMAIL_XPATH = "xpath://input[@id='email']";
    public static final String INPUT_PASSW_XPATH = "xpath://input[@id='passwd']";

    public static final String UL_LIST_XPATH = "xpath://ul[contains(@class,'product_list grid row')]";

    public static final String H1_TITULO_XPATH = "xpath://h1[text()='My account']";



}
