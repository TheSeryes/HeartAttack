package ca.bart.frgu.democustomview;

import android.graphics.Canvas;
import android.graphics.Paint;


public class Circle extends GameObject
{


    @Override
    protected void drawInternal(Canvas canvas)
    {
        float cx = getSize();
        float cy = getSize();
        float radius = getRadius();

        canvas.save();

        canvas.translate(size, 0);

        canvas.drawCircle(cx,cy,radius,paint);

        canvas.restore();
    }
}