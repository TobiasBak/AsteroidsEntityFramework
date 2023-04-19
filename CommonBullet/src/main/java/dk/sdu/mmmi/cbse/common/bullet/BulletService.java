package dk.sdu.mmmi.cbse.common.bullet;


import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;

import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public class BulletService {
    private static BulletService service;
    private ServiceLoader<BulletSPI> loader;

    private BulletService(){
        loader = ServiceLoader.load(BulletSPI.class);
    }

    public static synchronized BulletService getInstance(){
        if (service == null){
            service = new BulletService();
        }

        return service;
    }

    public Entity createBullet(Entity entity, GameData gameData){
        Entity out = null;
        try{
            for (BulletSPI service : loader) {
                out = service.createBullet(entity, gameData);
                System.out.println("BulletService creating");
            }
        } catch (ServiceConfigurationError serviceConfigurationError){
            serviceConfigurationError.printStackTrace();
        }
        return out;

    }
}
