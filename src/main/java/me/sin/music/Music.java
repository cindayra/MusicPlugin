package me.sin.music;

import me.sin.music.player.PlayerHandeler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Music extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Starting Music");

        Bukkit.getPluginManager().registerEvents(new SoundManager(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerHandeler(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
