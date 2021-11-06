public class shatter_pong {
    public void shatter_pongs(ball, paddle){
        if (!CollisionsFinder.is_collision(ball, paddle)) {
            return
        }
        boolean ball_has_hit_top = ball.y_coordinate <= paddle.y_midpoint;
        if (ball_has_hit_top) {
            shatter_top();
        }
        else {
            shatter_bottom();
        }
    }

    public void shatter_top(ball, paddle){
        int height_change = ball.bottom - paddle.y_coordinate;
        paddle.height -= height_change;
        paddle.y_coordinate += height_change;
    }

    public void shatter_bottom(ball, paddle){
        paddle.height -= (ball.y_coordinate - paddle.y_midpoint);
    }
}
