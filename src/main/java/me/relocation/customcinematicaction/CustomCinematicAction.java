package me.relocation.customcinematicaction;

import me.relocation.customcinematicaction.action.ExampleCustomAction;
import net.abyssdev.abysscinematics.api.CinematicAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomCinematicAction extends JavaPlugin {

    @Override
    public void onEnable() {
        CinematicAPI.registerCustomAction(new ExampleCustomAction());
        CinematicAPI.updateCustomActions();
    }

}
