package ghozti.gdxsandbox.player;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import ghozti.gdxsandbox.entities.Entity;

public class Player extends Entity implements InputProcessor {

    boolean moveUp, moveDown, moveLeft, moveRight;
    float xDirection, yDirection;

    public Player(float xPos, float yPos, float width, float height, float speed, float health, Texture texture, Rectangle rectangle, Circle circle, Batch batch) {
        super(xPos, yPos, width, height, speed, health, texture, rectangle, circle, batch);
    }

    @Override
    public void updateEntity() {
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
            moveUp = true;
        }
        if (keycode == Input.Keys.A){
            moveLeft = true;
        }
        if (keycode == Input.Keys.S){
            moveDown = true;
        }
        if (keycode == Input.Keys.D){
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
