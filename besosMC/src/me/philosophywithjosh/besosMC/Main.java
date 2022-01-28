package me.philosophywithjosh.besosMC;

import org.bukkit.plugin.java.JavaPlugin;
import me.philosophywithjosh.besosMC.listeners.crouchListener;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		new crouchListener(this);
	}
}
