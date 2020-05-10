package navy.warspite.spigot.QuickSleep

import navy.warspite.spigot.QuickSleep.Commands.GetInsomnia
import navy.warspite.spigot.QuickSleep.Commands.SetInsomnia
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        super.onEnable()
        OnTouchBedEventListener(this)
        getCommand("getinsomnia")!!.setExecutor(GetInsomnia())
        getCommand("setInsomnia")!!.setExecutor(SetInsomnia())
    }
}
