public class Paddle {
    // Attributes
    public int length;
    public int height;
    public int x_coordinate;
    public int y_coordinate;
    // Methods
    public void movement() {
        boolean is_moving_up = true;
        if (is_moving_up) {
            int movement_speed = 99;
            y_coordinate += movement_speed;
        }
    }
    public void draw() { 
    }
}
