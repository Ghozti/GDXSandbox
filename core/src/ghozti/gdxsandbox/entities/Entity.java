package ghozti.gdxsandbox.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;

public abstract class Entity {

    public float xPos,yPos;
    public float width , height;
    public float speed;
    public float health;
    public Texture texture, hitboxTexture, circleTexture;
    public com.badlogic.gdx.math.Rectangle hitbox;
    public Circle circle;
    public Batch batch;

    public Entity(float xPos, float yPos, float width, float height, float speed,float health, Texture texture, Rectangle rectangle, Circle circle, Batch batch){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.health = health;
        this.texture = texture;
        this.hitbox = rectangle;
        this.circle = circle;
        this.batch = batch;

        hitboxTexture = new Texture(Gdx.files.internal("hitbox.png"));
        circleTexture = new Texture(Gdx.files.internal("circle.png"));
    }

    public void moveEntity(float xChange, float yChange){
        if (xChange != 0 && yChange != 0){
            xChange = xChange/1.5f;
            yChange = yChange/1.5f;
        }
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

    public boolean isCircleTriggered(Circle circle){
        return this.circle.overlaps(circle);
    }

    public void drawHitBox(){
        batch.draw(hitboxTexture,xPos,yPos,width,height);
    }

    public void drawCircle(){
        batch.draw(circleTexture,(width == circle.radius ? xPos : xPos - ((circle.radius/2)-width/2)),(width == circle.radius ? yPos : yPos - ((circle.radius/2)-height/2)),circle.radius,circle.radius);
    }

    public abstract void updateEntity();

    public abstract void drawEntity();
}     