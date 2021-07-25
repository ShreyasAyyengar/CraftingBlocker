package me.shreyasayyengar.craftingblocker;

import java.util.List;

public class Config {
    private static CraftingBlockerPlugin plugin;

    public Config(CraftingBlockerPlugin plugin) {
        Config.plugin = plugin;
        plugin.getConfig().options().configuration();
        plugin.saveDefaultConfig();
    }

    public static List<String> getBlockedMaterials() {
        return plugin.getConfig().getStringList("blocked-items");
    }
}
