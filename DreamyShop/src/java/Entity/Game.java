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
    private String cateName;
    private float price;
    private int cateId;
    private String image;
    

    public Game() {
    }

    public Game(int id, String name,String image, float price, int cateId ) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.cateId = cateId;
        
    }

    public Game(int id, String name,String image, float price, int cateId,  String cateName) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.cateId = cateId;
        this.cateName = cateName;
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

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Override
    public String toString() {
        return "Game{" + "id=" + id + ", name=" + name + ", cateName=" + cateName + ", price=" + price + ", cateId=" + cateId + ", image=" + image + '}';
    }

    

    
    
    
}
