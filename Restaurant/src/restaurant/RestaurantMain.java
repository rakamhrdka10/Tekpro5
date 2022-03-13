
package restaurant;

public class RestaurantMain {
    
public static void main(String[] args) {
    Restaurant menu = new Restaurant();
    System.out.println("===============================");
    System.out.println("Stok Makanan yang tersedia :");
    System.out.println("===============================");
    menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Gehu", 1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Tahu", 1_000, 0);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Molen", 1_000, 20);
    menu.tampilMenuMakanan();
   
    
    
    
    System.out.println("===============================");
    System.out.println("Stok makanan setelah dipesan :");
        menu.takeOrder("Bala-Bala", 5);
        menu.takeOrder("Gehu", 17);
        menu.takeOrder("Tahu", 2);
        menu.takeOrder("Molen", 14);
     System.out.println("===============================");
        menu.tampilMenuMakanan2();
        ;
      System.out.println("===============================");
    }
}
