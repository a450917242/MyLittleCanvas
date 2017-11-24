package com.github.florent37.mylittlecanvas;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Text {
    public static void drawTextCentered(String text, float centerX, float centerY, Paint paint, Canvas canvas) {
        float xLeft = centerX - paint.measureText(text) / 2f;
        float yTop = centerY - ((paint.descent() + paint.ascent()) / 2f);
        canvas.drawText(text, xLeft, yTop, paint);
    }
}