package com.example.roshanpatel_individualproject;

public class products {
    private String food_name;
    private Integer food_image;
    private int food_price;
    private float food_star;
    private String food_description[];
    private int food_quantity;

    public String getFood_name() {
        return food_name;
    }
    public void setFood_name(String name) {
        this.food_name = name;
    }

    public Integer getFood_image() {
        return food_image;
    }
    public void setFood_image(Integer image) {
        this.food_image = image;
    }

    public int getFood_price() {
        return food_price;
    }
    public void setFood_price(int price) {
        this.food_price = price;
    }

    public float getFood_star() {
        return food_star;
    }
    public void setFood_star(float star) {
        this.food_star = star;
    }

    public String[] getFood_description() {
        return food_description;
    }
    public void setFood_description(String description[]) { food_description = description; }


}
