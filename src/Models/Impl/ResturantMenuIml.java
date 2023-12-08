package Models.Impl;

import Base.DataBase;
import Item.MenuItem;
import Models.ResturantMenuInter;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ResturantMenuIml implements ResturantMenuInter {

    @Override
    public void addcreate(MenuItem menuItem) {
        DataBase.desserds.add(menuItem);
        System.out.println("Successfully created! ");
        System.out.println();
    }

    @Override
    public List<MenuItem> remove(String index) {
        for (int i = 0; i < DataBase.desserds.size(); i++) {
            if(DataBase.desserds.get(i).getName().equalsIgnoreCase(index)){
               DataBase.desserds.remove(DataBase.desserds.get(i));
                System.out.println("Successfully");
            }
        }
        return null;
    }

    @Override
    public List<MenuItem> getAll() {
        return DataBase.desserds;
    }

    @Override
    public List<MenuItem> sortByPrice(String ascOrDesc) {
        Comparator<MenuItem> linkk = Comparator.comparing(MenuItem::getPrice);
        if(ascOrDesc.equalsIgnoreCase("asc")){
            DataBase.desserds.sort(linkk);
            return DataBase.desserds;
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            DataBase.desserds.sort(linkk.reversed());
            return DataBase.desserds;

        }
        return null;
    }

    @Override
    public List<MenuItem> getbyName(String name) {
        List<MenuItem> link = new LinkedList<>();
        for (MenuItem desserd : DataBase.desserds) {
            if(desserd.getName().equalsIgnoreCase(name)){
                link.add(desserd);
            }
        }
        return link;
    }

};
