package dk.sdu.mmmi.cbse.common.serviceInterfaces;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 *
 * @author jcs
 */
public interface IPostEntityProcessingService  {
        /**
         * Called after IEntityProcessingService.process(GameData, World) has been called on all entities.
         * <br>
         * Pre conditions:
         * IEntityProcessingService.process(GameData, World) has been called.
         * <br>
         * Post conditions:
         * The entities in the world will have been post-processed.
         * <br>
         * @param gameData Information about the Game, such as screen size etc.
         * @param world The world object that the Plugin will be added to.
         */
        void process(GameData gameData, World world);
}
