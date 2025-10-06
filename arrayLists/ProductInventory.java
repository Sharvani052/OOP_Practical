package arrayLists;

import java.util.ArrayList;

public class ProductInventory {
    public static void main(String[] args){
        ArrayList<Integer> quantities=new ArrayList<>();
        quantities.add(50);
        quantities.add(30);
        quantities.add(20);
        System.out.println("Product Quantities: " +quantities);
        quantities.set(1,35);
        System.out.println("After updating index 1: "+quantities);
        int total=0;
        for(int q:quantities){
            total +=q;
        }
        System.out.println("Total Quantity: "+total);
        quantities.clear();
        System.out.println("Inventory cleared. Current size: "+quantities.size());
    }
}

