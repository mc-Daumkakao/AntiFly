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
			if(0<args.length){
				if(args[0].equalsIgnoreCase("add")){
					//예외처리
					if(2<args.length || 1==args.length){
						sender.sendMessage(ChatColor.RED + "잘못된 명령어입니다.");
						
					return true;
					}
				}else if(args[0].equalsIgnoreCase("remove")){
					//예외처리
					if(2<args.length || 1==args.length){
						sender.sendMessage(ChatColor.RED + "잘못된 명령어입니다.");
					}
					
				}else if(args[0].equalsIgnoreCase("list")){
					sender.sendMessage("/af list");
				}else if(args[0].equalsIgnoreCase("reload")){
					sender.sendMessage("/af reload");
				}else{
				  sender.sendMessage(ChatColor.AQUA + "/af add <월드이름>" + " - " + ChatColor.YELLOW + "해당 월드의 플라이를 차단합니다.");
				  sender.sendMessage(ChatColor.AQUA + "/af remove <월드이름>" + " - " + ChatColor.YELLOW + "해당 월드의 플라이 차단을 해제합니다.");
				  sender.sendMessage(ChatColor.AQUA + "/af list" + " - " + ChatColor.YELLOW + "플라이가 차단된 월드의 목록을 불러옵니다.");
				  sender.sendMessage(ChatColor.AQUA + "/af reload" + " - " + ChatColor.YELLOW + "config의 월드목록을 리로딩합니다.");
				  return true;
				}
			}
		}else{
			sender.sendMessage(ChatColor.RED + "당신은 권한이 없습니다.");
			return true;
		}
		return true;
		
	 }
	
}

