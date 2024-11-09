public class Main{
    public static void main(String[] args){
        Store store = new Store();

        Product apple = new Product("Apple", 0.99, 100);
        Product banana = new Product("Banana", 0.59, 150);
        Product orange = new Product("Orange", 0.79, 200);

        store.addProduct(apple);
        store.addProduct(banana);
        store.addProduct(orange);

        store.displayProducts();

        store.removeProduct("Banana");

        store.displayProducts();

        store.removeProduct("Grapes");
    }
}