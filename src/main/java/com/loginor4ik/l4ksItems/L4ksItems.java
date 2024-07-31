package com.loginor4ik.l4ksItems;

import com.loginor4ik.l4ksItems.events.bookUseEvent;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class L4ksItems extends JavaPlugin {

    public static FileConfiguration config;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        config = getConfig();

        getServer().getPluginManager().registerEvents(new bookUseEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
