import processing.core.PApplet;

/**
 * Created by vitiok on 4/5/17.
 */
public class Sketch extends PApplet {

    public static final int Width = 800;
    public static final int Height = 600;

    public void settings() {
        size(Width, Height);
    }


    public void draw() {
        background(0);
        rect(10, 10, 200, 200);
    }

}
