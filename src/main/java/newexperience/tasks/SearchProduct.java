package newexperience.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import newexperience.model.ItemsData;
import newexperience.utils.WaitTime;
import org.openqa.selenium.By;

import java.util.List;

import static newexperience.userinterface.SearchProductPage.*;

public class SearchProduct implements Task {
    private static List<ItemsData> it;
    private String suma;
    public SearchProduct(List<ItemsData> it){this.it = it;}


    @Override
    public <T extends Actor> void performAs(T actor) {
        int sum=0;

        for (int i = 0; i < it.size(); i++) {
            String quanty = String.valueOf(it.get(i).getQty());
            sum = sum + it.get(i).getQty();

            actor.attemptsTo(
                    Click.on(INPUT_PRODUCT),
                    Enter.theValue(it.get(i).getProduct()).into(INPUT_PRODUCT),
                    Click.on(BUTTON_SEARCH),
                    Click.on(By.xpath("//h5/a[@title='" + it.get(i).getProduct() + "']")),
                    Enter.theValue("").into(INPUT_QUANTITY),
                    Enter.theValue(quanty).into(INPUT_QUANTITY),
                    SelectFromOptions.byVisibleText(it.get(i).getSize()).from(INPUT_SIZE),
                    Click.on(By.name( ""+it.get(i).getColor()+"")),
                    Click.on(BUTTON_ADD)

            );
            WaitTime.Time(10000);
            actor.attemptsTo(
                    Click.on(BUTTON_CLOSE)
            );
        }

        actor.attemptsTo(
                DoubleClick.on(BUTTON_CART)
        );

        System.out.println("La suma es: "+(sum+2));
       suma = String.valueOf(sum);

        public String sum_qty(){

            return suma;
        }

    }

    public static SearchProduct SP(List<ItemsData> it){
        return Tasks.instrumented(SearchProduct.class, it);
    }
}
