module Core {
    requires Common;
    requires java.desktop;
    requires com.badlogic.gdx;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    exports dk.sdu.mmmi.cbse.main;
    opens dk.sdu.mmmi.cbse.main to spring.core;
    uses dk.sdu.mmmi.cbse.common.serviceInterfaces.IGamePluginService;
    uses dk.sdu.mmmi.cbse.common.serviceInterfaces.IEntityProcessingService;
    uses dk.sdu.mmmi.cbse.common.serviceInterfaces.IPostEntityProcessingService;
}


