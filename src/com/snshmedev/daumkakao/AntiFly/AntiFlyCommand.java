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
		if(!(sender instanceof Player)) {
			System.out.println("[AntiFly] 콘솔에서는 사용할 수 없습니다.");
			return true;
		}
		
		Player p = (Player) sender;
		if(p.isOp()){
			if(0<args.length){
				if(args[0].equalsIgnoreCase("add")){
					Bukkit.broadcastMessage(ChatColor.AQUA + "/af add 명령어를 입력하였습니다.");
				}else if(args[0].equalsIgnoreCase("remove")){
					Bukkit.broadcastMessage(ChatColor.AQUA + "/af remove 명령어를 입력하였습니다.");
				}else if(args[0].equalsIgnoreCase("list")){
					Bukkit.broadcastMessage(ChatColor.AQUA + "/af list 명령어를 입력하였습니다.");
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
			/*
			if(0<args.length){
				if(args[0].equalsIgnoreCase("멍판=네로")){
					Bukkit.broadcastMessage(ChatColor.GRAY + "[Member]" + ChatColor.GREEN + "멍판" + ChatColor.WHITE + ": 나는 사실 네로와 같은 사람이죠");
					return true;
				}else if(args[0].equalsIgnoreCase("네로=멍판")){
					Bukkit.broadcastMessage(ChatColor.GRAY + "[Member]" + ChatColor.GREEN + "네로" + ChatColor.WHITE + ": 나는 사실 멍판과 같은 사람이죠");
					return true;
				}else if(args[0].equalsIgnoreCase("멍청판")){
					Bukkit.broadcastMessage(ChatColor.GRAY + "[Member]" + ChatColor.GREEN + "멍판" + ChatColor.WHITE + ": 어드민님 저 닉네임 멍청덩어리판으로 바꿔주세요!");
				}else if(args[0].equalsIgnoreCase("얼공")){
					Bukkit.broadcastMessage(ChatColor.GRAY + "[Member]" + ChatColor.GREEN + "멍판" + ChatColor.WHITE + ": 여러분 저 오늘 " + ChatColor.YELLOW + "얼공 " + ChatColor.WHITE + "합니다");
			}
			*/
			return true;
		}
		return true;
		
	 }
	
}

