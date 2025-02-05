package eu.midnightdust.cullleaves.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class CullLeavesConfig extends MidnightConfig {
    @Entry //  Enable/Disable the mod. Requires Chunk Reload (F3 + A).
    public static boolean enabled = true;
    @Entry //  Fixes resourcepacks utilizing leaf culling flickering when using Sodium
    public static boolean sodiumBlockFaceCullingFix = true;
}
