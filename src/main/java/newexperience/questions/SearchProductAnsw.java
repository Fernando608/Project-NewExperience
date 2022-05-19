package newexperience.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import newexperience.tasks.SearchProduct;
import newexperience.userinterface.SearchProductPage;

import java.util.List;

public class SearchProductAnsw implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean res;
        String total = (SearchProductPage.TOTAL_PRODUCT.resolveFor(actor).getText());
        if (total.contains(SearchProduct.sum_qty())){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    public static SearchProductAnsw vl(){return new SearchProductAnsw();}
}
