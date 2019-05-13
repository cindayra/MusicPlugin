package me.sin.music;

import me.sin.music.player.PlayerHandeler;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.lang.reflect.Array;

public class SoundManager implements Listener {

/*    Sound sounds[] = new Sound[] {
            Sound.BLOCK_NOTE_BLOCK_BANJO,
            Sound.BLOCK_NOTE_BLOCK_BASEDRUM,
            Sound.BLOCK_NOTE_BLOCK_BASS,
            Sound.BLOCK_NOTE_BLOCK_BELL,
            Sound.BLOCK_NOTE_BLOCK_BIT,
            Sound.BLOCK_NOTE_BLOCK_CHIME,
            Sound.BLOCK_NOTE_BLOCK_COW_BELL,
            Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO,
            Sound.BLOCK_NOTE_BLOCK_FLUTE,
            Sound.BLOCK_NOTE_BLOCK_GUITAR,
            Sound.BLOCK_NOTE_BLOCK_HARP,
            Sound.BLOCK_NOTE_BLOCK_HAT,
            Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE,
            Sound.BLOCK_NOTE_BLOCK_PLING,
            Sound.BLOCK_NOTE_BLOCK_SNARE,
            Sound.BLOCK_NOTE_BLOCK_XYLOPHONE

};*/


    Sound banjo = Sound.BLOCK_NOTE_BLOCK_BANJO;
    Sound kick = Sound.BLOCK_NOTE_BLOCK_BASEDRUM;
    Sound bass = Sound.BLOCK_NOTE_BLOCK_BASS;
    Sound bell = Sound.BLOCK_NOTE_BLOCK_BELL;
    Sound bit = Sound.BLOCK_NOTE_BLOCK_BIT;
    Sound chime = Sound.BLOCK_NOTE_BLOCK_CHIME;
    Sound cowBell = Sound.BLOCK_NOTE_BLOCK_COW_BELL;
    Sound didgeridoo = Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO;
    Sound flute = Sound.BLOCK_NOTE_BLOCK_FLUTE;
    Sound guitar = Sound.BLOCK_NOTE_BLOCK_GUITAR;
    Sound harp = Sound.BLOCK_NOTE_BLOCK_HARP;
    Sound highHat = Sound.BLOCK_NOTE_BLOCK_HAT;
    Sound ironXylophone = Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE;
    Sound pling = Sound.BLOCK_NOTE_BLOCK_PLING;
    Sound snare = Sound.BLOCK_NOTE_BLOCK_SNARE;
    Sound xylophone = Sound.BLOCK_NOTE_BLOCK_XYLOPHONE;

    @EventHandler
    public void onEggThrow(PlayerEggThrowEvent event)
    {
        Player player = PlayerHandeler.getPlayer();

        player.playSound(player.getLocation(), flute, 2.0F, 1.0F);


    }

}
