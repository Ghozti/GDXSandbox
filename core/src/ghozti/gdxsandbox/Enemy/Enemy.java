package ghozti.gdxsandbox.Enemy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import ghozti.gdxsandbox.entities.Entity;

import java.awt.*;

public class Enemy extends Entity {
    public Enemy(float xPos, float yPos, float width, float height, float speed, float health, Texture texture, Rectangle rectangle , Circle circle, Batch batch) {
        super(xPos, yPos, width, height, speed, health, texture, rectangle, circle, batch);
    }

    @Override
    public void updateEntity() {

    }

    @Override
    public void drawEntity() {
        batch.draw(texture,xPos,yPos,width,height);
    }
}
