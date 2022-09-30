package ghozti.gdxsandbox.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

import java.awt.*;

public class Entity {

    float xPos,yPos;
    float width , height;
    float speed;
    float health;
    Texture texture;
    com.badlogic.gdx.math.Rectangle hitbox;

    public Entity(float xPos, float yPos, float width, float height, float speed,float health, Texture texture, Rectangle rectangle){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.health = health;
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

    public void dealDamage(float damage){
        health -= damage;
    }

    public boolean isDead(){
        return health <= 0;
    }

    public boolean isHitBoxTriggered(Rectangle rectangle){
        return hitbox.overlaps(rectangle);
    }
}     