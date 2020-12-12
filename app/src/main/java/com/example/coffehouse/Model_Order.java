package com.example.coffehouse;

public class Model_Order {
    private int image;
    private String title;
    private String money;
    private int icon;
    private String description;

    public Model_Order(int image, String title, String money, int icon, String description) {
        this.image = image;
        this.title = title;
        this.money = money;
        this.icon = icon;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
