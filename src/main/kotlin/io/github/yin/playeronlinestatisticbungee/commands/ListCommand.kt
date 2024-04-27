package io.github.yin.playeronlinestatisticbungee.commands

import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.plugin.Command

class ListCommand : Command("listbungee", "bungeecord.command.list") {
    override fun execute(sender: CommandSender, arguments: Array<out String>) {
        ProxyServer.getInstance().pluginManager.dispatchCommand(ProxyServer.getInstance().console, "glist")
    }
}