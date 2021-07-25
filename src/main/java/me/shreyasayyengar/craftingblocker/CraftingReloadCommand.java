package me.shreyasayyengar.craftingblocker;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftingReloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("craftingblocker.reload")) {
            JavaPlugin.getPlugin(CraftingBlockerPlugin.class).reloadConfig();
            sender.sendMessage(ChatColor.YELLOW + "[CraftingBlocker] " + ChatColor.GREEN + " Configuration Reloaded!");
        }
        return false;
    }
}
