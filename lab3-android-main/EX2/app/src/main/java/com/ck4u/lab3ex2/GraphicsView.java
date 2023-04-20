package com.ck4u.lab3ex2;

import android.annotation.SuppressLint;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;

public class GraphicsView extends View {

    int x = 0;
    int y= 0;
    int d = 100;
    int r = 50;
    public GraphicsView(Context context){
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        if (x!=0 && y!=0 ){
            int right = x + d;
            int bottom = y + r;
            Rect r = new Rect(x,y,right,bottom);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.RED);
            canvas.drawRect(r, paint);

        }

        invalidate();
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = (int) event.getX();
        y = (int) event.getY();
        return super.onTouchEvent(event);
    }

}
