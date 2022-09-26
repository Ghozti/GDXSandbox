package ghozti.gdxsandbox.entities;

import com.badlogic.gdx.graphics.Texture;

import java.awt.*;

public class Entity {

    float xPos,yPos;
    float width , height;
    float speed;
    Texture texture;
    Rectangle hitbox;

    public Entity(float xPos, float yPos, float width, float height, float speed, Texture texture, Rectangle rectangle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.texture = texture;
        this.hitbox = rectangle;
    }

    public void moveEntity(float xChange, float yChange){
        this.xPos += xChange;
        this.yPos += yChange;
    }

    public void teleportEntity(float xPos, float yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
}