package com.wsw.billbook.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.TextView;

/**
 * Create By :wsw
 * 2016-04-21 11:41
 */
public class AnimTextView extends TextView {
    private Transformation a = new Transformation();
    private a b = new a();
    private Layout c;
    private boolean d = false;

    public AnimTextView(Context paramContext) {
        this(paramContext, null);
    }

    public AnimTextView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
    }

    public void a(boolean paramBoolean) {
        this.d = paramBoolean;
    }

    public void draw(Canvas paramCanvas) {
        if ((this.d) && (this.b != null) && (this.b.isInitialized()) && (paramCanvas != null)) {
            if (this.b.getTransformation(AnimationUtils.currentAnimationTimeMillis(), this.a)) {
                int i = (int) this.b.a();
                if (this.c != null) {
                    paramCanvas.save();
                    paramCanvas.translate(0.0F, i * -1);
                    this.c.draw(paramCanvas);
                    paramCanvas.translate(0.0F, this.c.getHeight());
                }
                Layout localLayout = getLayout();
                if (localLayout != null)
                    localLayout.draw(paramCanvas);
                invalidate();
                return;
            }
            super.draw(paramCanvas);
            return;
        }
        super.draw(paramCanvas);
    }

    public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType) {
        if ((this.d) && (this.b != null) && (!TextUtils.isEmpty(getText()))) {
            this.a.clear();
            this.c = getLayout();
            if (this.c != null) {
                this.b.reset();
                this.b.a(0.0D);
                this.b.b(this.c.getHeight());
                this.b.setDuration(200L);
                this.b.initialize(0, 0, 0, 0);
                this.b.startNow();
            }
        }
        super.setText(paramCharSequence, paramBufferType);
    }

    public class a extends Animation {
        private double b;
        private double c;
        private double d;

        public a() {
        }

        public double a() {
            return this.d;
        }

        public void a(double paramDouble) {
            reset();
            this.b = paramDouble;
        }

        protected void applyTransformation(float paramFloat, Transformation paramTransformation) {
            double d1 = this.b;
            if (this.b != this.c)
                d1 = this.b + (this.c - this.b) * paramFloat;
            this.d = d1;
        }

        public void b(double paramDouble) {
            reset();
            this.c = paramDouble;
        }
    }
}
