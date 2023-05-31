package dk.sdu.mmmi.cbse.bulletsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BulletControlSystemTest {

    // Testing create bullet method
    @Test
    void testCreateBulletWithNull() {
        BulletControlSystem bulletControlSystem = new BulletControlSystem();
        Entity bullet = bulletControlSystem.createBullet(null, null);
        assertNull(bullet);
    }
}