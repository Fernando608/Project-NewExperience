package newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchProductPage {

    public static final Target INPUT_PRODUCT = Target.the("").located(By.id("search_query_top"));
    public static final Target BUTTON_SEARCH = Target.the("").located(By.name("submit_search"));
    public static final Target INPUT_QUANTITY= Target.the("").located(By.id("quantity_wanted"));
    public static final Target INPUT_SIZE    = Target.the("").located(By.id("group_1"));
    public static final Target BUTTON_ADD    = Target.the("").located(By.name("Submit"));
    public static final Target BUTTON_CLOSE  = Target.the("").located(By.xpath("//span[@class='cross']"));
    public static final Target BUTTON_CART   = Target.the("").located(By.xpath("//div[@class='shopping_cart']/a"));
    public static final Target TOTAL_PRODUCT = Target.the("").located(By.id("summary_products_quantity"));
}

