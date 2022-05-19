package newexperience.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import newexperience.userinterface.SearchProductPage;

import java.util.ArrayList;

public class SearchProductAnsw implements Question<String> {
    @Override
    public String  answeredBy(Actor actor) {
        String quantity = "";
        String sms_shopping = Text.of(SearchProductPage.TOTAL_PRODUCT).viewedBy(actor).asString();
        ArrayList<Character> list_number = new ArrayList<>();
        for(int i = 0; i < sms_shopping.length(); i ++) {
            if(Character.isDigit(sms_shopping.charAt(i))) {
                list_number.add(sms_shopping.charAt(i));
            }
        }
        for(int j = 0; j < list_number.size();j ++)  {
            quantity +=list_number.get(j);
        }
        return quantity;
    }

    public static Question<String> value() {  return new SearchProductAnsw(); }

    }