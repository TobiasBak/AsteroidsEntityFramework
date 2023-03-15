package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * Contains a start and stop method, which is used to incorporate components into the game
 *
 * Start method uses two arguments GameData and World
 * Used to add data on component install
 *
 * Stop method uses the same two arguments (GameData and World)
 * Method is used to remove the component and it cleans up after itself
 *
 * @author jcs
 */
public interface IGamePluginService {
    /**
     * Used to add data on component install
     *
     * @param gameData
     * @param world
     *
     * Preconditions: ???
     *
     * Postconditions: Data will be added to the component
     */
    void start(GameData gameData, World world);

    /**
     * Used to remove and cleanup when the method is called.
     * Should contain logic to cleanup and remove what component has done
     * Should be called when component is uninstalled
     *
     * @param gameData
     * @param world
     *
     * Preconditions: ???
     *
     * Postconditions: Everything start added has been cleaned up and component can be removed
     *
     */
    void stop(GameData gameData, World world);
}
