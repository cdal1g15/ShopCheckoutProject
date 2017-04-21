import java.util.Iterator;

/**
 * Created by conor on 21/04/17.
 */
public class CheckOut {
    private ItemTable itemTable;
    private Double cost;
    private PriceRuleTable rules;

    public CheckOut(PriceRuleTable r){
        rules = r;
        itemTable = new ItemTable();
    }

    public void scan(Item a){
        itemTable.addItem(a);
    }

    public void remove(Item a){
        itemTable.removeItem(a);
    }

    public Double total(){
        CalculateTotal calculateTotal = new CalculateTotal();
        cost = calculateTotal.calculate(itemTable, rules);
        return cost;
    }

    public Double getCost(){
        return cost;
    }

    public ItemTable getItems(){
        return itemTable;
    }
}
