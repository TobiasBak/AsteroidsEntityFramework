package dk.sdu.mmmi.cbse.common.data.entityparts;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;

public class ColorPart implements EntityPart {
    private final int[] colors;

    public ColorPart(int r, int g, int b, int a) {
        colors = new int[4];
        colors[0] = r;
        colors[1] = g;
        colors[2] = b;
        colors[3] = a;
    }

    public int getR() {
        return colors[0];
    }

    public int getG() {
        return colors[1];
    }

    public int getB() {
        return colors[2];
    }

    public int getA() {
        return colors[3];
    }

    @Override
    public void process(GameData gameData, Entity entity) {
    }
}
