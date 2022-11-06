package ghozti.gdxsandbox.Enemy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import ghozti.gdxsandbox.NPC.CircleTriggerPath;
import ghozti.gdxsandbox.entities.Entity;
import ghozti.gdxsandbox.player.Player;

public class Enemy extends Entity {

    CircleTriggerPath path;

    public Enemy(float xPos, float yPos, float width, float height, float speed, float health, Texture texture, Rectangle rectangle , Circle circle, Batch batch) {
        super(xPos, yPos, width, height, speed, health, texture, rectangle, circle, batch);
    }

    public void setPath(Player player){
        path = new CircleTriggerPath(this,player);
    }

    @Override
    public void updateEntity() {
        path.update();
    }

    @Override
    public void drawEntity() {
        batch.draw(texture,xPos,yPos,width,height);
    }
}
