package com.exortions.bedwarsreloaded.api.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.ChatColor;

@Getter
@AllArgsConstructor
public enum TeamColor {

    RED("Red", 14, ChatColor.RED),
    BLUE("Blue", 11, ChatColor.DARK_BLUE),
    GREEN("Green", 5, ChatColor.GREEN),
    YELLOW("Yellow", 4, ChatColor.YELLOW),
    AQUA("Aqua", 3, ChatColor.AQUA),
    WHITE("White", 0, ChatColor.WHITE),
    PINK("Pink", 6, ChatColor.LIGHT_PURPLE),
    GRAY("Gray", 7, ChatColor.DARK_GRAY);

    private final String name;
    private final int wool;
    private final ChatColor color;

}
