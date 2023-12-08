package Base;

import Item.MenuItem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataBase {
   public static List<MenuItem> dishes = new LinkedList<>();
    public static List<MenuItem> drinks = new LinkedList<>();
    public static List<MenuItem> salads = new LinkedList<>();
    public static List<MenuItem> desserds  = new LinkedList<>(Arrays.asList(
            new MenuItem("Medovyi",200,"10-min"),
            new MenuItem("Tvorojnyi",170,"10-min"),
            new MenuItem("Shokoladnyi",190,"10-min"),
            new MenuItem("Klubnichnyi",210,"10-min"),
            new MenuItem("Fistashka",230,"10-min")
    ));
}
