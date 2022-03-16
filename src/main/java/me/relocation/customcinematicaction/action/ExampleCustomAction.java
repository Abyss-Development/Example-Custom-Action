package me.relocation.customcinematicaction.action;

import net.abyssdev.abysscinematics.api.action.CustomAction;
import net.abyssdev.abysscinematics.cinematic.Cinematic;
import net.abyssdev.abysscinematics.cinematic.action.CinematicAction;
import org.bukkit.entity.Player;

public final class ExampleCustomAction implements CustomAction {

    @Override
    public String getName() {
        return "example";
    }

    @Override
    public void execute(final Player player, final Cinematic cinematic, final CinematicAction cinematicAction) {
        player.sendMessage("Example action!");
    }

}