package io.github.yin.playeronlinestatisticbungee.commands

import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.plugin.Command

class ReloadCommand : Command("reloadbungee", "bungeecord.command.reload") {
    override fun execute(sender: CommandSender, arguments: Array<out String>) {
        ProxyServer.getInstance().pluginManager.dispatchCommand(ProxyServer.getInstance().console, "greload")
    }
}