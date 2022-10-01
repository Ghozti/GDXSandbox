package ghozti.gdxsandbox.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import ghozti.gdxsandbox.entities.Entity;

public class Player extends Entity implements InputProcessor {

    boolean moveUp, moveDown, moveLeft, moveRight;
    boolean stopX, stopY;

    public Player(float xPos, float yPos, float width, float height, float speed, float health, Texture texture, Rectangle rectangle, Batch batch) {
        super(xPos, yPos, width, height, speed, health, texture, rectangle, batch);
    }

    @Override
    public void updateEntity() {
        if (moveUp && !stopY){
            moveEntity(0,speed);
        }
        if (moveDown && !stopY){
            moveEntity(0,-speed);
        }
        if (moveLeft && !stopX){
            moveEntity(-speed,0);
        }
        if (moveRight && !stopX){
            moveEntity(speed,0);
        }
    }

    @Override
    public void drawEntity() {
        batch.draw(texture,xPos,yPos,width,height);
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.W){
            moveUp = true;
            stopY = false;
        }
        if (keycode == Input.Keys.A){
            moveLeft = true;
            stopX  = false;
        }
        if (keycode == Input.Keys.S){
            moveDown = true;
            stopY = false;
        }
        if (keycode == Input.Keys.D){
            moveRight = true;
            stopX = false;
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.W){
            moveUp = false;
            stopY = true;
        }
        if (keycode == Input.Keys.A){
            moveLeft = false;
            stopX = true;
        }
        if (keycode == Input.Keys.S){
            moveDown = true;
            stopY = true;
        }
        if (keycode == Input.Keys.D){
            moveRight = true;
            stopX  = true;
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
