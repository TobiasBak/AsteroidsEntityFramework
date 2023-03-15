import dk.sdu.mmmi.cbse.common.serviceInterfaces.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.serviceInterfaces.IGamePluginService;
import dk.sdu.mmmi.cbse.playersystem.PlayerControlSystem;
import dk.sdu.mmmi.cbse.playersystem.PlayerPlugin;

module Player {
    exports dk.sdu.mmmi.cbse.playersystem;
    requires Common;
    requires CommonPlayer;
    requires CommonBullet;

    provides IGamePluginService with PlayerPlugin; uses IGamePluginService;
    provides IEntityProcessingService with PlayerControlSystem; uses IEntityProcessingService;
}