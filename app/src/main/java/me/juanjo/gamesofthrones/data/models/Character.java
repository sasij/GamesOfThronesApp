package me.juanjo.gamesofthrones.data.models;

import java.io.Serializable;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class Character implements Serializable {

    String name;
    String image;
    String description;

    public Character(String name, String image, String description) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
