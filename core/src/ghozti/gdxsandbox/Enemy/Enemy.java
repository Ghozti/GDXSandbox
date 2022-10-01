package ghozti.gdxsandbox.Enemy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import ghozti.gdxsandbox.entities.Entity;

import java.awt.*;

public class Enemy extends Entity {
    public Enemy(float xPos, float yPos, float width, float height, float speed,float health, Texture texture, Rectangle rectangle) {
        super(xPos, yPos, width, height, speed, health, texture, rectangle);
    }

    @Override
    public void updateEntity() {

    }
}
