package ghozti.gdxsandbox.animation;

import com.badlogic.gdx.graphics.Texture;
import ghozti.gdxsandbox.entities.Entity;

import java.util.ArrayList;

public class SpriteAnimator {

    ArrayList<Texture> topWalk, bottomWalk, leftWalk, rightWalk;
    String walkState;
    Entity entity;
    int delta = 0, index = 0;

    public SpriteAnimator(ArrayList<Texture> topWalk, ArrayList<Texture> bottomWalk, ArrayList<Texture> leftWalk, ArrayList<Texture> rightWalk, String walkState, Entity entity){
        this.topWalk = topWalk;
        this.bottomWalk = bottomWalk;
        this.leftWalk = leftWalk;
        this.rightWalk = rightWalk;
        this.walkState = walkState;
        this.entity = entity;
    }

    public void update(String state) {
        this.walkState = state;
        //if (delta > 500){
        //    delta = 0;
        //}else {
        //    delta++;
        //}
        //if (walkState.equals("U")) {
        //    if (delta % 500 == 0) {
        //        entity.texture = topWalk.get(index);
        //        if (index > topWalk.size() - 1) {
        //            index = 0;
        //        } else {
        //            index++;
        //        }
        //    }
        //}
        //if (walkState.equals("D")) {
        //    if (delta % 500 == 0) {
        //        entity.texture = bottomWalk.get(index);
        //        if (index > bottomWalk.size() - 1) {
        //            index = 0;
        //        } else {
        //            index++;
        //        }
        //    }
        //}
        //if (walkState.equals("L")) {
        //    if (delta % 500 == 0) {
        //        entity.texture = leftWalk.get(index);
        //        if (index > leftWalk.size() - 1) {
        //            index = 0;
        //        } else {
        //            index++;
        //        }
        //    }
        //}
        //if (walkState.equals("R")) {
        //    if (delta % 500 == 0) {
        //        entity.texture = rightWalk.get(index);
        //        if (index > rightWalk.size() - 1) {
        //            index = 0;
        //        } else {
        //            index++;
        //        }
        //    }
        //}
    }
}
