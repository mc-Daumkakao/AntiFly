package com.snshmedev.daumkakao.AntiFly;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiFly extends JavaPlugin implements Listener{
		public void onEnable(){
			getLogger().info("AntiFly 실행");
			getLogger().info("Spigot 1.7.9 1543기반");
			Bukkit.broadcastMessage("AntiFly플러그인 활성화");
			//플라이금지월드 로드
			getConfig().options().copyDefaults(true);
			//버전 입력
			getConfig().addDefault("version", 0.2);
			getConfig().addDefault("worldlist", 0);
			saveConfig();
			//커맨드 로드
			getCommand("af").setExecutor(new AntiFlyCommand());
			Bukkit.getPluginManager().registerEvents(this, this);
		}

		public void onDisable(){
			getLogger().info("AntiFly 비활성화");
			Bukkit.broadcastMessage("AntiFly플러그인 비활성화");
			saveConfig();
		}

	 @EventHandler
	 //플라이권한 없는 유저의 플라이 해제
	 public void playertpevent(PlayerChangedWorldEvent e){
		Player p=e.getPlayer();
		if(!p.hasPermission("essentials.fly")){
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "fly " + p.getName() + " off");
			p.sendMessage(ChatColor.GRAY + "[알림] " + ChatColor.WHITE + p.getName() + ChatColor.GOLD +"님의 " + ChatColor.YELLOW + "fly" + ChatColor.GOLD + "가" + ChatColor.AQUA + " 해제" + ChatColor.GOLD  + "되었습니다.");
		}
	}
}
