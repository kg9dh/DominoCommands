package ch.kg9dh.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class DominoCommands extends JavaPlugin{
	
	public Map<String, String>domino = new HashMap<String, String>();
	public List<String>triggers = new ArrayList<String>();

    public void onEnable() {        
    	loadConfig();

    	this.getServer().getPluginManager().registerEvents(new DominoCommandsListener(this), this);
    	
    	for(String s : this.getConfig().getStringList("commandlist")){
    		triggers.add(s);
    	}
    	
    	for(String s : triggers){
    		domino.put(s, this.getConfig().getString("commands."+s));
    	}
    		
    }
 	
 	
 	public void onDisable() {
 		domino.clear();
 		triggers.clear();
 	}
	
	private void loadConfig() {
		FileConfiguration cfg = this.getConfig();
		cfg.options().copyDefaults(true);
		this.saveConfig();		
	}
 	
}
