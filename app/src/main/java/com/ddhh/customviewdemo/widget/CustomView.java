package com.ddhh.customviewdemo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
/**
 * Created by ddhh on 16-10-25.
 *
 * 自定义View学习开始
 *
 */

public class CustomView extends View{

    //构造函数
    public CustomView(Context context) {
        super(context);
    }
    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //测量函数
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);

        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
    }

    //这个函数在view大小改变时调用
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    //布局函数,一般在自定义ViewGroup中用到
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    //绘制函数
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10f);

        canvas.drawPoint(200f,200f,paint);//画点
//        canvas.drawLine();//划线
//        canvas.drawArc();//画矩形
//        canvas.drawOval();//画圆
//        canvas.drawOval();//画椭圆

//        canvas.drawColor(Color.GREEN);画颜色

    }

    //自定义完View之后，一般会对外暴露一些接口，用于控制View的状态等，或者监听View的变化.

}
