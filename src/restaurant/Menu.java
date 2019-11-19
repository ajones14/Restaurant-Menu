package restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu () {

        this.menuItems = new ArrayList<MenuItem>();
        this.lastUpdated = new Date();

    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    protected void setLastUpdated(Date aLastUpdated) {
        this.lastUpdated = aLastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems () {
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> aMenuItems) {
        this.menuItems = menuItems;
    }

    public void addItem(MenuItem item) {
        this.lastUpdated = new Date();
        this.menuItems.add(item);
    }

    public void removeItem(MenuItem item) {
        this.menuItems.remove(item);
    }

    public String printItem(MenuItem item) {
        return item.toString();
    }

    public String printMenu() {
        String menu = "";
        for (MenuItem item : this.menuItems) {
            menu += item.toString() + "\n";
        }
        return menu;
    }

}
