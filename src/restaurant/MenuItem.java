package restaurant;

import java.util.Objects;

public class MenuItem {

    public double price;
    public String description;
    protected String category;
    protected boolean isNew;

    public MenuItem(double price, String description, String category) {

        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;

    }

    public double getPrice() { return this.price; }

    protected void setPrice(double price) { this.price = price; }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return this.category;
    }

    protected void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    protected void setIsNew(boolean aIsNew) {
        this.isNew = aIsNew;
    }

    @Override
    public String toString() {
        return this.description + " " + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }
}
