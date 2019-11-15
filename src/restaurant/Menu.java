package restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {

    protected Date lastUpdated;
    public ArrayList<MenuItem> menuItems;

    public Menu (ArrayList<MenuItem> menuItems, Date lastUpdated) {

        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;

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

}
