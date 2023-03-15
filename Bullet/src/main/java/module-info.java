import dk.sdu.mmmi.cbse.bulletsystem.BulletControlSystem;
import dk.sdu.mmmi.cbse.bulletsystem.BulletPlugin;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

module Bullet {
    exports dk.sdu.mmmi.cbse.bulletsystem;
    requires Common;
    requires CommonBullet;

    provides IGamePluginService with BulletPlugin;
    provides IEntityProcessingService with BulletControlSystem;
}