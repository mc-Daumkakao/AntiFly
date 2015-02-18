package com.snshmedev.daumkakao.AntiFly;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AntiFlyCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label,String[]args) {
		Player p = (Player) sender;
		if(p.isOp()){
			  sender.sendMessage(ChatColor.AQUA + "/af add <월드이름>" + " - " + ChatColor.YELLOW + "해당 월드의 플라이를 차단합니다.");
			  sender.sendMessage(ChatColor.AQUA + "/af remove <월드이름>" + " - " + ChatColor.YELLOW + "해당 월드의 플라이 차단을 해제합니다.");
			  sender.sendMessage(ChatColor.AQUA + "/af list" + " - " + ChatColor.YELLOW + "플라이가 차단된 월드의 목록을 불러옵니다.");
			  sender.sendMessage(ChatColor.AQUA + "/af reload" + " - " + ChatColor.YELLOW + "config의 월드목록을 리로딩합니다.");
			  return true;
		}else{
			sender.sendMessage(ChatColor.RED + "당신은 권한이 없습니다.");
			return true;
		}

	 }
}
