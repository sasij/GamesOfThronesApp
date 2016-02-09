package me.juanjo.gamesofthrones.models;

/**
 * Created by juanjo on 9/12/15.
 */
public class Character {

    String name;
    int image;
    String description;

    public Character(String name, int image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
