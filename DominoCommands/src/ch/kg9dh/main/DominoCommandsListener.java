package ch.kg9dh.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class DominoCommandsListener implements Listener{

	public DominoCommands plugin;
	
	public DominoCommandsListener(DominoCommands instance) {
        plugin = instance;
    }
	
    @EventHandler
    public void onPlayerCommandPreprocess(final PlayerCommandPreprocessEvent event) {
    	   	
    	plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {    		   		
    	    @Override 
    	    public void run() {
    	    	for(String s : plugin.triggers){
    	    		if(event.getMessage().startsWith("/"+s)){      
    	    			//Runs a command as the player
    	    			Bukkit.getServer().dispatchCommand(event.getPlayer(),plugin.domino.get(s));
    	        	}    
    	    	}
    	    }
    	}, 10L);//0.5 second delay so its run After the first command
    	    	
    }
    
    
	
}
