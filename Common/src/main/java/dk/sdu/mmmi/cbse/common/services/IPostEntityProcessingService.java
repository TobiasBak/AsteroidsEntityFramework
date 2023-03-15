package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * This interface should be used in the case of wanting to manipulate entities based on their last process call
 * An example of this could be collision
 *
 * @author jcs
 */
public interface IPostEntityProcessingService  {
        /**
         * Method is called each time update is called
         * Should be used to update an entity or multiple entities
         *
         * @param gameData
         * @param world
         *
         * Preconditions: ???
         *
         * Postcondtions: An entity or multiple entities have been updated
         */
        void process(GameData gameData, World world);
}
