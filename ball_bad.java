import java.io.InputStream;

public class ball_bad {
    int fv = 90;
    int x = 90;
    int y = 90;
    boolean ir = false;
    boolean iu = false;
    public void m() {
        int c = VC.cd(fv);
        x += c ? ir: -c;
        y += c ? iu : -c;
    }
}