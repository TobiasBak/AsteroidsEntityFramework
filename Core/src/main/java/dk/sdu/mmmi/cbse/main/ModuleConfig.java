package dk.sdu.mmmi.cbse.main;

import dk.sdu.mmmi.cbse.common.serviceInterfaces.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.serviceInterfaces.IGamePluginService;
import dk.sdu.mmmi.cbse.common.serviceInterfaces.IPostEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.EntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.GamePluginService;
import dk.sdu.mmmi.cbse.common.services.PostEntityProcessingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class ModuleConfig {

    public ModuleConfig() {
    }

    @Bean
    public Game hello(){
        return new Game(gamePluginServices(), entityProcessingServiceList(), postEntityProcessingServices());
    }

    @Bean
    public List<IEntityProcessingService> entityProcessingServiceList(){
//        return ServiceLoader.load(IEntityProcessingService.class).stream().map(ServiceLoader.Provider::get).collect(toList());
        return EntityProcessingService.getInstance().returnAll();
    }

    @Bean
    public List<IGamePluginService> gamePluginServices() {
//        return ServiceLoader.load(IGamePluginService.class).stream().map(ServiceLoader.Provider::get).collect(toList());
        return GamePluginService.getInstance().returnAll();
    }

    @Bean
    public List<IPostEntityProcessingService> postEntityProcessingServices() {
//        return ServiceLoader.load(IPostEntityProcessingService.class).stream().map(ServiceLoader.Provider::get).collect(toList());
        return PostEntityProcessingService.getInstance().returnAll();
    }
}




