package dk.sdu.mmmi.cbse.common.serviceInterfaces;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IEntityProcessingService {

    /**
     * Called to process the entities in the world.
     *
     * <br>
     * Pre conditions:
     * The previous call to process must have finished.
     * <br>
     * Post conditions:
     * The data in the world entities will have been updated.
     * <br>
     * @param gameData Contains the GameData information used for processing the entities.
     *                 Including the DeltaTime since the last update.
     * @param world Contains all the entities present in the world. Process should operate on a subset of these.
     */
    void process(GameData gameData, World world);
}
