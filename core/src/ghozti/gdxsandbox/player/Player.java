package ghozti.gdxsandbox.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import ghozti.gdxsandbox.animation.SpriteAnimator;
import ghozti.gdxsandbox.entities.Entity;

import java.util.ArrayList;

public class Player extends Entity implements InputProcessor {

    boolean moveUp, moveDown, moveLeft, moveRight;
    float xDirection, yDirection;
    SpriteAnimator animator;
    ArrayList<Texture> topWalk, bottomWalk, leftWalk, rightWalk;
    String state;

    public Player(float xPos, float yPos, float width, float height, float speed, float health, Texture texture, Rectangle rectangle, Circle circle, Batch batch) {
        super(xPos, yPos, width, height, speed, health, texture, rectangle, circle, batch);

        topWalk = new ArrayList<>();
        topWalk.add(new Texture(Gdx.files.internal("entityWalk5.png")));
        topWalk.add(new Texture(Gdx.files.internal("entityWalk6.png")));

        bottomWalk = new ArrayList<>();
        bottomWalk.add(new Texture(Gdx.files.internal("entityWalk5.png")));
        bottomWalk.add(new Texture(Gdx.files.internal("entityWalk6.png")));

        leftWalk = new ArrayList<>();
        leftWalk.add(new Texture(Gdx.files.internal("enityWalk2.png")));
        leftWalk.add(new Texture(Gdx.files.internal("enityWalk3.png")));

        rightWalk = new ArrayList<>();
        rightWalk.add(new Texture(Gdx.files.internal("enityWalk2.png")));
        rightWalk.add(new Texture(Gdx.files.internal("enityWalk3.png")));

        state = "U";
        animator = new SpriteAnimator(topWalk,bottomWalk,leftWalk,rightWalk,state,this);
    }

    @Override
    public void updateEntity() {
        animator.update(state);
        if (moveUp){
            yDirection = speed;
        }else if (moveDown){
            yDirection = -speed;
        }
        if (moveLeft){
            xDirection = -speed;
        }else if (moveRight){
            xDirection = speed;
        }
        moveEntity(xDirection,yDirection);
        xDirection = 0;
        yDirection = 0;
    }

    @Override
    public void drawEntity() {
        batch.draw(texture,xPos,yPos,width,height);
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.W){
            state = "U";
            moveUp = true;
        }
        if (keycode == Input.Keys.A){
            state = "L";
            moveLeft = true;
        }
        if (keycode == Input.Keys.S){
            state = "D";
            moveDown = true;
        }
        if (keycode == Input.Keys.D){
            state = "R";
            moveRight = true;
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.W){
            moveUp = false;
        }
        if (keycode == Input.Keys.A){
            moveLeft = false;
        }
        if (keycode == Input.Keys.S){
            moveDown = false;
        }
        if (keycode == Input.Keys.D){
            moveRight = false;
        }
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
