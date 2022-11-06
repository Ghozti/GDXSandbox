package ghozti.gdxsandbox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;
import ghozti.gdxsandbox.Enemy.Enemy;
import ghozti.gdxsandbox.player.Player;

public class GameLauncher implements Screen {

    Player player;
    Enemy enemy;
    Batch batch;

    @Override
    public void show() {
        batch = new SpriteBatch();
        player = new Player(32,32,32,32,300,100,new Texture(Gdx.files.internal("entityStand.png")), new Rectangle(32,32,32,32), new Circle(32,32,132), batch);
        enemy = new Enemy(32,32,32,32,300,100,new Texture(Gdx.files.internal("entityStand.png")), new Rectangle(32,32,32,32), new Circle(32,32,132), batch);
        enemy.setPath(player);
        Gdx.input.setInputProcessor(player);
    }

    public void update(){
        player.updateEntity();
        enemy.updateEntity();
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0,0, 1f);
        update();
        batch.begin();
        player.drawEntity();
        player.drawHitBox();
        player.drawCircle();
        enemy.drawEntity();
        enemy.drawHitBox();
        enemy.drawCircle();
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
