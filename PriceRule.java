/**
 * Created by conor on 21/04/17.
 */
public class PriceRule {
    protected int amount;
    protected Double cost;
    protected Item item;

    public PriceRule(int n, Double x, Item a){
        amount = n;
        cost = x;
        item = a;
    }

    //check for offers, if enough of the item exist calculate cost
    public Double checkPrice(Item a, int b){
        if(a==item && b==amount){
            return cost;
        }else if(a==item && isAFactor(b)){
            return cost * factor(b);
        }else if (a ==item && b>amount){
            int remain = b%amount;
            System.out.println(remain);
            return (cost * factor(b)) + remain * a.getCost();
        }
        return null;
    }

    public boolean isAFactor(int b){
        if(b!=0 && b%amount==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int factor(int b){
        int answer = b/amount;
        return  answer;
    }

    public Item getItem(){
        return item;
    }

    public int getAmount(){
        return amount;
    }
}
