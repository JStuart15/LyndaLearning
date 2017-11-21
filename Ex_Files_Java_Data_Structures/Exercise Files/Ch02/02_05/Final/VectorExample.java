/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorexample;

import java.util.Vector;

/**
 *
 * @author Producer
 */
public class VectorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] platform1 = {"PS4"};
        String[] platform2 = {"3DS", "Wii U"};
        VideoGame game1 = new VideoGame("Battlefield 1", 2001, "M", platform1);
        VideoGame game2 = new VideoGame("Pokemon Sun", 2016, "E", platform2);
        VideoGame game3 = new VideoGame("The Legend of Zelda", 2017, "E", platform2);
        
        Vector videoGames = new Vector();
        videoGames.add(game1);
        videoGames.add(game2);
        videoGames.add(game3);
        System.out.println(videoGames);
       
    }
    
}
