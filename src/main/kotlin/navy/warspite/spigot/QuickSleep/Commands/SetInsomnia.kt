package navy.warspite.spigot.QuickSleep.Commands

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Statistic
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class SetInsomnia : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<String>
    ): Boolean {
        if (args.isEmpty()) return false
        if (args.size > 2) return false
        val target = Bukkit.getPlayerExact(args[0])
        if (target == null) {
            sender.sendMessage(
                ChatColor.GREEN.toString() +
                        args[0] + "is Offline."
            )
            return true
        } else {
            target.setStatistic(Statistic.TIME_SINCE_REST, args[1].toInt())
            val targetName: String = args[0].possessive()
            sender.sendMessage(
                ChatColor.GREEN.toString() +
                targetName + " TIME_SINCE_REST: " + args[1])
            return true
        }
    }
}
