package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 *
 * All classes implementing this interface, their update method will be called each time the game updates
 * Therefore all logic about entity behaviour should be in the process method
 *
 * @author jcs
 *
 *
 */
public interface IEntityProcessingService {
    /**
     * Method is called each time update is called
     * Should be used to update an entity or multiple entities
     *
     * @param gameData
     * @param world
     *
     * Preconditions: ????
     *
     * Postconditions: An entity or multiple entities have been updated in the World
     */
    void process(GameData gameData, World world);
}
