package io.github.yin.playeronlinestatisticbungee

import io.github.yin.playeronlinestatisticbungee.commands.ListCommand
import io.github.yin.playeronlinestatisticbungee.commands.ReloadCommand
import io.github.yin.playeronlinestatisticbungee.commands.StopCommand
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.plugin.Plugin

class Main : Plugin() {
    companion object {
        lateinit var instance: Main
        const val prefix = "§f[§2别名§f] "
    }

    override fun onEnable() {
        instance = this
        proxy.console.sendMessage(TextComponent(prefix + "插件开始加载 " + description.version))
        ProxyServer.getInstance().pluginManager.registerCommand(this, ListCommand())
        ProxyServer.getInstance().pluginManager.registerCommand(this, ReloadCommand())
        ProxyServer.getInstance().pluginManager.registerCommand(this, StopCommand())
    }

    override fun onDisable() {
        proxy.console.sendMessage(TextComponent(prefix + "插件开始卸载 " + description.version))
    }


}