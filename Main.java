/**
 * Created by conor on 21/04/17.
 */
public class Main {

    protected ItemTable itemTable;
    protected PriceRuleTable table;
    public static void main(String[] args){
        Main m = new Main();
        Item A = new Item(50D, "A");
        m.setupRules(A);
        CheckOut checkOut = new CheckOut(m.table);
        checkOut.scan(A);
        checkOut.scan(A);
        checkOut.scan(A);
        checkOut.scan(A);
        checkOut.scan(A);
        checkOut.scan(new Item(30D, "B"));
        System.out.println("Total is : £" + checkOut.total());
        checkOut.remove(A);
        checkOut.remove(A);
        System.out.println("Total is : £" + checkOut.total());
        checkOut.remove(A);
        checkOut.remove(A);
        checkOut.remove(A);
        checkOut.remove(A);
        checkOut.remove(A);
        checkOut.remove(A);
        System.out.println("Total is : £" + checkOut.total());
        System.out.println("Total is : £" + checkOut.total());


    }

    public void setupRules(Item A){
        PriceRule a = new PriceRule(3,100D, A);
        table = new PriceRuleTable();
        table.addRule(a);
    }

}
