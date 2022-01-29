package me.philosophywithjosh.besosMC;

import org.bukkit.plugin.java.JavaPlugin;
import me.philosophywithjosh.besosMC.listeners.crouchListener;
import me.philosophywithjosh.besosMC.listeners.playerListener;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		new crouchListener(this);
		new playerListener(this);
	}
}
