/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TeamSurvival.control;

import byui.cit260.TeamSurvival.model.Player;
import team.survival.TeamSurvival;

/**
 *
 * @author Aboli
 */
public class GameControl {
    
    public static Player createPlayer(String name){
         
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        TeamSurvival.setPlayer(player); //save the player
         return player;
    }
    
}
