package navy.warspite.spigot.QuickSleep.Commands

import org.bukkit.ChatColor
import org.bukkit.Statistic
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class GetInsomnia : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<String>
    ): Boolean {
        if (sender is Player) {
            sender.sendMessage(
                ChatColor.GREEN.toString() +
                sender.getStatistic(Statistic.TIME_SINCE_REST).toString()
            )
            return true
        } else {
            sender.sendMessage(
                ChatColor.GREEN.toString() +
                "This is Players own command."
            )
            return true
        }
    }
}