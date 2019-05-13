package me.sin.music.player;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

public class PlayerHandeler implements Listener {

    private ArrayList<Player> onlinePlayers = new ArrayList<>();

    Player player;

    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event)
    {
        player = event.getPlayer();
        onlinePlayers.add(player);
    }

    public Player getPlayer ()
    {
        return player;
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerEggThrow(PlayerEggThrowEvent event)
    {

        player = event.getPlayer();

    }
}
