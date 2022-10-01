package ghozti.gdxsandbox.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;

import java.awt.*;

public abstract class Entity {

    public float xPos,yPos;
    public float width , height;
    public float speed;
    public float health;
    public Texture texture;
    public com.badlogic.gdx.math.Rectangle hitbox;
    public Batch batch;

    public Entity(float xPos, float yPos, float width, float height, float speed,float health, Texture texture, Rectangle rectangle, Batch batch){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.health = health;
        this.texture = texture;
        this.hitbox = rectangle;
        this.batch = batch;
    }

    public void moveEntity(float xChange, float yChange){
        this.xPos += xChange * Gdx.graphics.getDeltaTime();
        this.yPos += yChange * Gdx.graphics.getDeltaTime();
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

    public abstract void updateEntity();

    public abstract void drawEntity();
}     