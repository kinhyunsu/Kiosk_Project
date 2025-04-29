package Kiosk.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;
    private List<MenuItem> menuItems;

    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }
    //Getter
    public String getCategoryName() { return categoryName; }
    public List<MenuItem> getMenuItems() { return menuItems; }

    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
    public void setMenuItems(List<MenuItem> menuItems) { this.menuItems = menuItems; }
}
