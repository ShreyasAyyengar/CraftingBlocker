package me.shreyasayyengar.craftingblocker;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class CraftingCancel implements Listener {

    @EventHandler
    private void onPrepare(PrepareItemCraftEvent e) {
        if (!e.getView().getPlayer().hasPermission("craftingblocker.bypass")) {
            if (e.getInventory().getResult() != null) {
                Material craftedItem = e.getInventory().getResult().getType();

                for (String configItem : Config.getBlockedMaterials()) {
                    if (craftedItem.toString().equalsIgnoreCase(configItem)) {
                        e.getInventory().setResult(new ItemStack(Material.AIR));
                    }
                }
            }
        }
    }
}
