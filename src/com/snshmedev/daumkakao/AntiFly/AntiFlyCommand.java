package com.snshmedev.daumkakao.AntiFly;

import org.bukkit.Bukkit;
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
					sender.sendMessage("/af add");
				}else if(args[0].equalsIgnoreCase("remove")){
					sender.sendMessage("/af remove");
				}else if(args[0].equalsIgnoreCase("list")){
					sender.sendMessage("/af list");
				}else if(args[0].equalsIgnoreCase("reload")){
					sender.sendMessage("/af reload");
				}else if(args[0].equalsIgnoreCase("멍판=네로")){
					Bukkit.broadcastMessage(ChatColor.GRAY + "[Member]"+ ChatColor.GREEN + "멍판" + ChatColor.WHITE + ": 나는 사실 네로와 같은 사람이었어요.");
				}else if(args[0].equalsIgnoreCase("네로=멍판")){
					Bukkit.broadcastMessage(ChatColor.GRAY + "[Member]"+ ChatColor.GREEN + "멍판" + ChatColor.WHITE + ": 나는 사실 멍판과 같은 사람이었어요.");
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

