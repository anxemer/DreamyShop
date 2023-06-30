/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author anxem
 */
public class Game {
    private int id;
    private String name;
    private float price;
    private String title;
    private String description;
    private int cateId;
    private String image;

    public Game() {
    }

    public Game(int id, String name,String image, float price, String title, String description, int cateId ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.title = title;
        this.description = description;
        this.cateId = cateId;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Game{" + "id=" + id + ", name=" + name + ", price=" + price + ", title=" + title + ", description=" + description + ", cateId=" + cateId + ", image=" + image + '}';
    }
    
    
}
