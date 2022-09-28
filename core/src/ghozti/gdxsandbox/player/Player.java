package ghozti.gdxsandbox.player;

import com.badlogic.gdx.graphics.Texture;
import ghozti.gdxsandbox.entities.Entity;

import java.awt.*;

public class Player extends Entity {
    public Player(float xPos, float yPos, float width, float height, float speed, Texture texture, Rectangle rectangle) {
        super(xPos, yPos, width, height, speed, texture, rectangle);
    }
}
