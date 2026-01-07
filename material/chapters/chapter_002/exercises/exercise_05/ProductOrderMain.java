package chapters.chapter02.exercises.exercise_05;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("상품 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        app.products = new ProductOrder[n];

        for (int i = 0; i < app.products.length; i++) {
            System.out.println((i+1)+ "번째 상품 이름을 입력하세요: ");
            String productName = scanner.nextLine();
            
            System.out.println((i+1)+ "번째 상품 수량을 입력하세요: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println((i+1)+ "번째 상품 가격을 입력하세요: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            app.products[i] = InitProduct(productName, quantity, price);
        }
        scanner.close();

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
