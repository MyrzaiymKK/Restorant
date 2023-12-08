package Item;

public class MenuItem {
    String name;
    int price;
    String preperationTime;

    public MenuItem() {
    }

    public MenuItem(String name, int price, String preperationTime) {
        this.name = name;
        this.price = price;
        this.preperationTime = preperationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPreperationTime() {
        return preperationTime;
    }

    public void setPreperationTime(String preperationTime) {
        this.preperationTime = preperationTime;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", preperationTime='" + preperationTime + '\'' +
                '}';
    }
}
