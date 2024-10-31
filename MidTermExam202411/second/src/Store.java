import java.util.ArrayList;
import java.util.List;

public class Store{
    private List<Product> products;

    public Store(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Added: " + product);
    }

    public void removeProduct(String name){
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getName().equalsIgnoreCase(name)){
                System.out.println("Removed: " + products.get(i));
                products.remove(i);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }
    public void displayProducts(){
        if (products.isEmpty()){
            System.out.println("No products available.");
            return;
        }
        System.out.println("Products in store:");
        for (Product product : products){
            System.out.println(product);
        }
    }
}
