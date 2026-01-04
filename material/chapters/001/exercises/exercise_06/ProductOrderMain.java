public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products= new ProductOrder[3];
        products[0] = InitProduct("두부", 2, 2000);
        products[1] = InitProduct("김치", 1, 5000);
        products[2] = InitProduct("콜라", 2, 1500);
        for (ProductOrder product : products) {
            System.out.println(product.productName);
            System.out.println(product.quantity);
            System.out.println(product.price);
        }

    }
    public static ProductOrder InitProduct(String productName, int quantity, int price) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.quantity = quantity;
        product.price = price;
        return product;
    }
}
