package abstractclasses;

abstract class FoodOrder{
    int orderId;
    String customerName;
    abstract double calculateTotal();
    void generateBill() {
        System.out.println("Order ID: " +orderId);
        System.out.println("Customer: " +customerName);
        System.out.println("Total Amount: " +calculateTotal());
    }
}
class RestaurantOrder extends FoodOrder{
    double foodPrice;
    double serviceCharge;
    RestaurantOrder(int id,String name,double foodPrice,double serviceCharge) {
        this.orderId=id;
        this.customerName=name;
        this.foodPrice=foodPrice;
        this.serviceCharge=serviceCharge;
    }
    @Override
    double calculateTotal(){
        return foodPrice+serviceCharge;
    }
}
class CloudKitchenOrder extends FoodOrder{
    double foodPrice;
    double packagingFee;
    double deliveryFee;
    CloudKitchenOrder(int id,String name,double foodPrice,double packagingFee,double deliveryFee){
        this.orderId=id;
        this.customerName=name;
        this.foodPrice=foodPrice;
        this.packagingFee=packagingFee;
        this.deliveryFee=deliveryFee;
    }
    @Override
    double calculateTotal(){
        return foodPrice+packagingFee+deliveryFee;
    }
}
public class OnlineFood{
    public static void main(String[] args){
        FoodOrder order1 = new RestaurantOrder(101,"Sharvani",300,50);
        FoodOrder order2 = new CloudKitchenOrder(102,"Vani",250,30,40);
        order1.generateBill();
        order2.generateBill();
    }
}
