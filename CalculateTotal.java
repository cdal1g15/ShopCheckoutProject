import java.util.Iterator;
import java.util.Set;

/**
 * Created by conor on 21/04/17.
 */
public class CalculateTotal {


    //Calcuate the price of the item list given
    public Double calculate(ItemTable list, PriceRuleTable rulesList){
        Set<Item> keys = list.getList().keySet();
        Iterator<Item> itemIterator = keys.iterator();
        Double total = 0D;
        while(itemIterator.hasNext()){
            Item currentItem = itemIterator.next();
            Double price = null;
            Integer numberOfItem = (Integer)(list.getList().get(currentItem));
            price = checkOffers(currentItem,numberOfItem,rulesList);
            Double cost = numberOfItem*currentItem.getCost();
            if(price!=null){
                total = total + price;
            }else {
                total = total + cost;
            }
        }
        return total;
    }

    //check the item and amount of it for any offers
    public Double checkOffers(Item item, Integer amount, PriceRuleTable rules){
        Double price = null;
        if(rules.getList().containsKey(item)){
            PriceRule checking =(PriceRule) rules.getList().get(item);
            int numberNeeded = checking.getAmount();
            if(numberNeeded <= amount){
                price = checking.checkPrice(item, amount);
            }
        }
        return price;
    }
}
