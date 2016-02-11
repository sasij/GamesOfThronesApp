package me.juanjo.gamesofthrones.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import me.juanjo.gamesofthrones.models.Character;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class CharacterRepositoryImp implements CharacterRepository {

    private Cache cache;

    public CharacterRepositoryImp(Cache cache) {
        this.cache = cache;
    }

    @Override
    public List<Character> getCharacters() {

        //TODO
        System.out.println("=> to retrofit");
        List<Character> data = (List<Character>) cache.get("CHARACTERS");
        if (data == null) {
            //TODO to retrofit
            data = new ArrayList<>();
            data.add(new Character("Image 1", "http://cdn1.theweek.co.uk/sites/theweek/files/styles/gallery_adv/public/2015/06/1-dany.jpg?itok=Gay-eOae", ""));
            data.add(new Character("Image 2", "http://blogs-images.forbes.com/insertcoin/files/2015/06/thrones-hardhome.jpg", ""));
            data.add(new Character("Image 3", "http://imagenes.montevideo.com.uy/imgnoticias/201504/497160.jpg", ""));
            data.add(new Character("Image 4", "http://dorkshelf.com/wordpress/wp-content/uploads//2014/04/Game-of-Thrones-Season-4-Episode-2-Joffrey-Dead.jpg", ""));
            data.add(new Character("Image 5", "http://www.zoomenlinea.com/wp-content/uploads/2013/11/game-of-thrones-hd-wallpapers.jpg", ""));
            data.add(new Character("Image 6", "http://media.vanityfair.com/photos/5589d3d3ca2dc24e4d27065a/master/pass/game-of-thrones-jon-snow-death.jpg", ""));

            cache.put("CHARACTERS", (Serializable) data, 60);
        }
        return data;
    }

    @Override
    public Character getCharater(String name) {
        return null;
    }
}
