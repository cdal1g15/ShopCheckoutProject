/**
 * Created by conor on 21/04/17.
 */
public class Item {

    protected String name;
    protected Double cost;

    public Item(Double cost, String name){
        this.name = name;
        this.cost = cost;
    }

    public Double getCost(){
        return cost;
    }
}
