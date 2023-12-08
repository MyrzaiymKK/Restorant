package Models;

import Item.MenuItem;

import java.util.List;

public interface ResturantMenuInter {
    void addcreate(MenuItem menuItem);
    List<MenuItem> remove (String index);
    List<MenuItem> getAll();
    List<MenuItem> sortByPrice(String ascOrDesc);
    List<MenuItem> getbyName(String name);
}
