package me.philosophywithjosh.besosMC.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.entity.*;

import me.philosophywithjosh.besosMC.Main;

public class playerListener implements Listener
{
	private static Main plugin;
	private static Player reciever;
	
	public playerListener(Main plugin)
	{
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this,plugin);
	}
	
	public static boolean isAroundLover(Player player)
	{
		double radius = 2D;
		Player lover = player;
		for(Entity e : lover.getNearbyEntities(2, 2, 2))
		{
		    if(e instanceof Player)
		    {
		    	reciever = (Player)e;
		        return true;
		    }
		}
		return false;
	}
	
	public static Player getReciever()
	{
		return reciever;
	}
}
