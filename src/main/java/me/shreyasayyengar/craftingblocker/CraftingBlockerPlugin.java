package me.shreyasayyengar.craftingblocker;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CraftingBlockerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new CraftingCancel(), this);
        this.getCommand("craftingreload").setExecutor(new CraftingReloadCommand());
        new Config(this);
    }

    @Override
    public void onDisable() {
        getLogger().warning("Shutting down...");
    }
}
