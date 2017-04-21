import java.util.Hashtable;

/**
 * Created by conor on 21/04/17.
 */
public class ItemTable {
    protected Hashtable<Item, Integer> listOfItems;

    public ItemTable(){
        listOfItems = new Hashtable<>();
    }

    public void addItem(Item a){
        if(!listOfItems.containsKey(a)) {
            listOfItems.put(a, 1);
        }
        else{
            listOfItems.put(a, listOfItems.get(a) + 1);
        }
    }

    public void removeItem(Item a){
        if(listOfItems.containsKey(a)) {
            if(listOfItems.get(a)<= 0){
                listOfItems.remove(a);

            }else {
                listOfItems.put(a, listOfItems.get(a) - 1);
            }
        }
        else{
            System.out.println("That item doesn't exist");
        }
    }

    public Hashtable getList(){
        return listOfItems;
    }

}
