package restaurant;

public class MenuItem {

    public String name;
    public String description;
    protected String category;
    protected boolean isNew;

    public MenuItem(String name, String description, String category, boolean isNew) {

        this.name = name;
        this.description = description;
        this.category = category;
        this.isNew = isNew;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

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

}
