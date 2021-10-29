package com.exortions.bedwarsreloaded.api.team;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Team {

    String getName();

    TeamColor getTeamColor();

    int getWoolType();

    ItemStack getWool();

    ChatColor getColor();

    List<Player> getPlayers();

    List<Player> getActivePlayers();

    List<Player> getDeadPlayers();

    boolean isAlive();

    boolean isBedAlive();

}
