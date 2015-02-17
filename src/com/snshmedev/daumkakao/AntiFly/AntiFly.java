package com.snshmedev.daumkakao.AntiFly;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class AntiFly extends JavaPlugin{
		public void onEnable(){
			getLogger().info("AntiFly 실행");
			getLogger().info("Spigot 1.7.9 1543기반");
			Bukkit.broadcastMessage("AntiFly플러그인 활성화");
			//config파일 로드
			getConfig().options().copyDefaults(true);
			saveConfig();
			//커맨드 로드
			getCommand("af").setExecutor(this);
		}

		public void onDisable(){
			getLogger().info("AntiFly 비활성화");
			Bukkit.broadcastMessage("AntiFly플러그인 비활성화");
		}
		//커맨드
		public boolean onCommand(CommandSender sender, Command cmd, String Label,String[]args) {
			Player p = (Player) sender;
			if(p.isOp()){
				  sender.sendMessage(ChatColor.AQUA + "/af add" + " - " + ChatColor.YELLOW + "해당 월드의 플라이를 차단합니다.");
				  sender.sendMessage(ChatColor.AQUA + "/af remove" + " - " + ChatColor.YELLOW + "해당 월드의 플라이 차단을 해제합니다.");
				  sender.sendMessage(ChatColor.AQUA + "/af list" + " - " + ChatColor.YELLOW + "플라이가 차단된 월드의 목록을 불러옵니다.");
				  sender.sendMessage(ChatColor.AQUA + "/af reload" + " - " + ChatColor.YELLOW + "config의 월드목록을 리로딩합니다.");
				  return true;
			}else{
				sender.sendMessage(ChatColor.RED + "당신은 권한이 없습니다.");
				return true;
			}

		 }
}
