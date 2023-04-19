import dk.sdu.mmmi.cbse.common.serviceInterfaces.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.serviceInterfaces.IGamePluginService;
import dk.sdu.mmmi.cbse.common.serviceInterfaces.IPostEntityProcessingService;

module Common {
    uses IGamePluginService;
    uses IEntityProcessingService;
    uses IPostEntityProcessingService;
    exports dk.sdu.mmmi.cbse.common.data;
    exports dk.sdu.mmmi.cbse.common.data.entityparts;
    exports dk.sdu.mmmi.cbse.common.events;
    exports dk.sdu.mmmi.cbse.common.serviceInterfaces;
    exports dk.sdu.mmmi.cbse.common.services;
}