package brightspark.xpspawnercontrol;

import net.minecraftforge.common.config.Config;

@Config(modid = XpSpawnerControl.MODID)
@Config.LangKey(XpSpawnerControl.NAME)
public class ModConfig
{
    @Config.Comment("Whether the entity list is a blacklist (true) or a whitelist (false) of removing experience drops")
    @Config.RequiresMcRestart
    public static boolean isBlacklist = true;

    @Config.Comment("A list of all of the entity registry names which this mod will affect (e.g. minecraft:zombie)")
    @Config.RequiresMcRestart
    public static String[] entityList = {""};
}
