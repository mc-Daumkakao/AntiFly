package com.snshmedev.daumkakao.AntiFly;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiFly extends JavaPlugin{
		public void onEnable(){
			getLogger().info("AntiFly 실행");
			getLogger().info("Spigot 1.7.9 1543기반");
			Bukkit.broadcastMessage("AntiFly플러그인 활성화");
			//플라이금지월드 로드
			getConfig().options().copyDefaults(true);
			saveConfig();
			//커맨드 로드
			getCommand("af").setExecutor(new AntiFlyCommand());
		}

		public void onDisable(){
			getLogger().info("AntiFly 비활성화");
			Bukkit.broadcastMessage("AntiFly플러그인 비활성화");
		}
}
