package com.loginor4ik.l4ksItems.events;

import com.loginor4ik.l4ksItems.L4ksItems;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class bookUseEvent implements Listener {

    @EventHandler
    public void bookUse(PlayerInteractEvent e) {
        if((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && Objects.requireNonNull(e.getItem()).getType() == Material.BOOK) {
            ItemStack item = e.getItem();
            ItemMeta meta = item.getItemMeta();

            Player player = e.getPlayer();
            World world = player.getWorld();

            if(meta.getCustomModelData() == L4ksItems.config.getInt("bookCustomModelData")) {
                int i1 = item.getAmount() - 1;
                item.setAmount(i1);

                for(int i = 0; i < L4ksItems.config.getInt("strikeLightingsCount"); i++) {
                    Location location = player.getLocation();

                    location.setX(location.getX() + (Math.random() * 20 - L4ksItems.config.getInt("bookRadius")));
                    location.setZ(location.getZ() + (Math.random() * 20 - L4ksItems.config.getInt("bookRadius")));

                    world.strikeLightning(location);
                }
            }
        }
    }
}
