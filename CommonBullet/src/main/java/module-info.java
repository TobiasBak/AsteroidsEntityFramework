import dk.sdu.mmmi.cbse.common.bullet.BulletSPI;
import dk.sdu.mmmi.cbse.common.bullet.BulletService;

module CommonBullet {
    exports dk.sdu.mmmi.cbse.common.bullet;
    requires Common;
    uses BulletSPI;
}