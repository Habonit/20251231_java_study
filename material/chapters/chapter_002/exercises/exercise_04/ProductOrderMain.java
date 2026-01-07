package chapters.chapter02.exercises.exercise_04;

public class ProductOrderMain {
    ProductOrder[] products;

    void PrintProducts() {
        for (ProductOrder product : products) {
            System.out.println(product.productName);
            System.out.println(product.quantity);
            System.out.println(product.price);
        }
    }
    int getTotalAmount() {
        int totalAmount = 0;
        for (ProductOrder product : products) {
            totalAmount += product.price * product.quantity;
        }
        System.out.println("totalAmount = " + totalAmount);
        return totalAmount;
    }
    public static void main(String[] args) {
        ProductOrderMain app = new ProductOrderMain();
        app.products = new ProductOrder[3];
        app.products[0] = InitProduct("두부", 2, 2000);
        app.products[1] = InitProduct("김치", 1, 5000);
        app.products[2] = InitProduct("콜라", 2, 1500);

        app.PrintProducts();
        app.getTotalAmount();

    }
    static ProductOrder InitProduct(String productName, int quantity, int price) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.quantity = quantity;
        product.price = price;
        return product;
    }
}
