package ca.bart.frgu.democustomview;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class GameObject
{

    protected float x;
    protected float y;
    protected float radius;
    protected float scale = 1;
    protected float rotation;
    protected float size;
    protected int color;
    protected Paint paint = new Paint();

    protected GameObject()
    {

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
    }

    //region Getter/Setter Color
    public int getColor()
    {
        return color;
    }

    public void setColor(int color)
    {
        this.color = color;
        paint.setColor(color);
    }
    //endregion

    //region Getter/Setter Outline
    public Paint getOutline() { return paint;}

    public void setPaint(Paint paint)
    {
        this.paint = paint;
    }
    //endregion

    //region Getter/Setter X
    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }
    //endregion

    //region Getter/Setter Y
    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }
    //endregion

    //region Getter/Setter Radius
    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    //endregion

    //region Getter/Setter Scale
    public float getScale()
    {
        return scale;
    }

    public void setScale(float scale)
    {
        this.scale = scale;
    }
    //endregion

    //region Getter/Setter Rotation
    public float getRotation()
    {
        return rotation;
    }

    public void setRotation(float rotation)
    {
        this.rotation = rotation;
    }
    //endregion

    //region Getter/Setter Size
    public float getSize()
    {
        return size;
    }

    public void setSize(float size)
    {
        this.size = size;
    }
    //endregion

    final public void draw(Canvas canvas)
    {
        canvas.save();

        canvas.translate(x, y);
        canvas.scale(scale, scale);
        canvas.rotate(rotation);

        drawInternal(canvas);

        canvas.restore();
    }
    abstract protected void drawInternal(Canvas canvas);
}
