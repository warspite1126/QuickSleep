package navy.warspite.spigot.QuickSleep

import org.bukkit.Statistic
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerBedEnterEvent
import org.bukkit.plugin.Plugin

class OnTouchBedEventListener(plugin: Plugin) : Listener {
    @EventHandler
    fun onTouchBedEvent(e: PlayerBedEnterEvent) {
        val player = e.player
        player.setStatistic(Statistic.TIME_SINCE_REST, 0)
    }
    init {
        plugin.server.pluginManager.registerEvents(this, plugin)
    }
}