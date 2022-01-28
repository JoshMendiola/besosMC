package me.philosophywithjosh.besosMC.listeners;

import org.bukkit.Bukkit;
import org.bukkit.EntityEffect;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import me.philosophywithjosh.besosMC.listeners.*;

import me.philosophywithjosh.besosMC.Main;

public class crouchListener implements Listener
{
	@SuppressWarnings("unused")
	private static Main plugin;
	
	public crouchListener(Main plugin)
	{
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this,plugin);
	}
	
	//returns if the player is sneaking or not
	public boolean isLoverSneaking(PlayerToggleSneakEvent i, Player lover)
	{
		if(lover.isSneaking())
		{
			return true;
		}
		return false;
	}
	//Listens for when the player crouches, and handles the appropriate actions in that case
	@EventHandler
	public void playerKissEvent(PlayerToggleSneakEvent i)
	{
		Player kisser = i.getPlayer();
		if(playerListener.isAroundLover(kisser) && kisser.isSneaking() && playerListener.getReciever().isSneaking())
		{
			Player reciever = playerListener.getReciever();
            reciever.playEffect(EntityEffect.LOVE_HEARTS);
            kisser.playEffect(EntityEffect.LOVE_HEARTS);
		}
	}
	
}
