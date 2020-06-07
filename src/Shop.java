public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Czekolada";
        product1.producer = "Wedel";
        product1.price = 3.5;
        product1.isAvailable = true;

        Product product2 = new Product();
        product2.name = "Mleko";
        product2.producer = "Mlekovita";
        product2.price = 2.1;
        product2.isAvailable = false;

        Product product3 = new Product();
        product3.name = "Salami";
        product3.producer = "Sokolow";
        product3.price = 5.5;
        product3.isAvailable = true;

        System.out.println("Produkt: " + product1.name + " " + product1.producer + " w cenie (zl): " + product1.price + " jest dostepny: " + product1.isAvailable);
        System.out.println("Produkt: " + product2.name + " " + product2.producer + " w cenie (zl): " + product2.price + " jest dostepny: " + product2.isAvailable);
        System.out.println("Produkt: " + product3.name + " " + product3.producer + " w cenie (zl): " + product3.price + " jest dostepny: " + product3.isAvailable);
    }
}
