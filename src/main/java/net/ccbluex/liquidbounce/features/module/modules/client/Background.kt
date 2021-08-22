package net.ccbluex.liquidbounce.features.module.modules.client

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.ui.client.GuiBackground

@ModuleInfo(name = "Background", category = ModuleCategory.CLIENT, canEnable = false)
class Background : Module() {
    override fun onEnable(){
        mc.displayGuiScreen(GuiBackground())
    }
}