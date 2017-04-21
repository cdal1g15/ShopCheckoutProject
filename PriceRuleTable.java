import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by conor on 21/04/17.
 */
public class PriceRuleTable {
    protected Hashtable<Item, PriceRule> listOfRules;

    public PriceRuleTable(){
        listOfRules = new Hashtable<>();
    }

    public void addRule(PriceRule rule){
        listOfRules.put(rule.getItem(), rule);
    }

    public void removeRule(PriceRule rule){
         listOfRules.remove(rule);
    }

    public Hashtable getList(){
        return listOfRules;
    }
}
