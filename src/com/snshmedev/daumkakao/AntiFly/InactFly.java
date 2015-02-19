package com.snshmedev.daumkakao.AntiFly;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class InactFly implements Listener{
	
	public void playertpevent(PlayerChangedWorldEvent e){
		Player p=e.getPlayer();
		if(!p.hasPermission("essentials.fly")){
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "fly " + p.getName() + " off");
			Bukkit.broadcastMessage("fly 해제");
		}
	}
}
