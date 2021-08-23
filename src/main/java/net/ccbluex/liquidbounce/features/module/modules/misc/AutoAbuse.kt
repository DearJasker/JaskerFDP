package net.ccbluex.liquidbounce.features.module.modules.misc

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo

@ModuleInfo(name = "AutoAbuse", category = ModuleCategory.MISC)

class AutoAbuse : Module() {
    override fun onEnable(){
        chat("This module is not open yet.")
        state = false
    }
}