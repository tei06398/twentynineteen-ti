package ftc.team6460.javadeck.ftc.vision;

import android.graphics.Canvas;
import org.opencv.core.Mat;

/**
 * Created by hexafraction on 9/29/15.
 */
public interface MatCallback {

    public void handleMat(Mat mat);

    public void draw(Canvas canvas);
}