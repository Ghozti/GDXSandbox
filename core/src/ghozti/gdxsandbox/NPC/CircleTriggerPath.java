package ghozti.gdxsandbox.NPC;

import com.badlogic.gdx.math.Circle;
import ghozti.gdxsandbox.entities.Entity;

public class CircleTriggerPath {

    Entity entityInUse, targetEntity;
    float xChange, yChange;

    public CircleTriggerPath( Entity entityInUse ,Entity targetEntity){
        this.entityInUse = entityInUse;
        this.targetEntity = targetEntity;
    }

    public void update(){
        if (triggerDetect()){
            moveEntity();
        }
    }

    private boolean triggerDetect(){
        return entityInUse.circle.overlaps(targetEntity.circle);
    }

    private void moveEntity(){

        if (targetEntity.xPos > entityInUse.xPos){
            xChange = entityInUse.speed/2;
        }
        if (targetEntity.xPos < entityInUse.xPos){
            xChange = -entityInUse.speed/2;
        }

        if (targetEntity.yPos > entityInUse.yPos){
            yChange = entityInUse.speed/2;
        }
        if (targetEntity.yPos < entityInUse.yPos){
            yChange = -entityInUse.speed/2;
        }

        entityInUse.moveEntity(xChange,yChange);
    }
}
