import Item.MenuItem;
import Models.Impl.ResturantMenuIml;
import Models.ResturantMenuInter;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        ResturantMenuInter service = new ResturantMenuIml();
        while (true){
            System.out.println("""
                    Dessert Home by Mika :)
                    
                    1.Add (Create)
                    2.Remove
                    3.GetAll
                    4.Sort by Price
                    5.Get by Name
                    """);
            switch (scanner.nextLine()){
                case"1"->{
                    MenuItem menuItem = new MenuItem();
                    System.out.println("Write name of Dessert: ");
                    String name = scanner.nextLine();
                    menuItem.setName(name);
                    System.out.println("Write price of product: ");
                    int price = scanner.nextInt();
                    menuItem.setPrice(price);
                    System.out.println("Write preperation time: ");
                    String time = scanner1.nextLine();
                    menuItem.setPreperationTime(time);
                    service.addcreate(menuItem);
                }
                case"2"->{
                    System.out.println("Write name of dessert for delete: ");
                    String namee = scanner.nextLine();
                    service.remove(namee);
                }
                case"3"->{
                    System.out.println(service.getAll());
                }
                case"4"->{
                    System.out.println("Write asc or desc: ");
                    String sort = scanner.nextLine();
                    System.out.println(service.sortByPrice(sort));
                }
                case"5"->{
                    System.out.println("Write name of dessert: ");
                    String named = scanner.nextLine();
                    System.out.println(service.getbyName(named));
                }
            }
        }
    }
}