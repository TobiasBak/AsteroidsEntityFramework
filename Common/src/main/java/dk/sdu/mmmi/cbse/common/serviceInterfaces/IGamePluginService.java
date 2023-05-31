package dk.sdu.mmmi.cbse.common.serviceInterfaces;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IGamePluginService {
    /**
     * Called to start the plugin and add the entity to the world.
     * <br>
     * Pre conditions:
     * The start method must not have been called before or the stop method must have been called since.
     * <br>
     * Post conditions:
     * The world contains the entity created.
     * <br>
     * @param gameData Information about the Game, such as screen size etc.
     * @param world The world object that the Plugin will be added to.
     */
    void start(GameData gameData, World world);

    /**
     * Called to remove the plugin/the entity from the world. <br>
     * <br>
     * Pre condtions:
     * The start method has been called.
     * <br>
     * <h2>Post conditions:</h2>
     * The world to remove the entity from.
     * <br>
     * @param gameData Information about the Game, such as screen size etc.
     * @param world The world object that the Plugin will be removed from.
     */
    void stop(GameData gameData, World world);
}
