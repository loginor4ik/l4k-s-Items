package com.loginor4ik.l4ksItems.items;

import com.loginor4ik.l4ksItems.L4ksItems;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class bookItem {
    public static ItemStack getBook() {
        ItemStack item = new ItemStack(Material.BOOK);
        ItemMeta meta = item.getItemMeta();

        meta.setCustomModelData(L4ksItems.config.getInt("bookCustomModelData"));
        meta.setDisplayName(ChatColor.of(Objects.requireNonNull(L4ksItems.config.getString("bookNameColor"))) + L4ksItems.config.getString("bookName"));

        item.setItemMeta(meta);
        return item;
    }
}
