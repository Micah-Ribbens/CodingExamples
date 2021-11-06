public class ball_good {
    int forwards_velocity = 90;
    int x_coordinate = 90;
    int y_coordinate = 90;
    boolean is_moving_right = false;
    boolean is_moving_up = false;
    public void movement() {
        int change = VelocityCalculator.calc_distance(forwards_velocity);
        x_coordinate += change ? is_moving_right : -change;
        y_coordinate += change ? is_moving_up : -change;
    }
}