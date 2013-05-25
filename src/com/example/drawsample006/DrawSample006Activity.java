package com.example.drawsample006;

import com.gclue.DrawSample006.R;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class DrawSample006Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		MyView mView = new MyView( this );
		setContentView( mView );
	}
}

class MyView extends View {

	private Bitmap myBitmap;

	public MyView( Context context ) {
		super( context );
		setFocusable( true );
		Resources res = this.getContext().getResources();
		myBitmap = BitmapFactory.decodeResource( res, R.drawable.gclue_logo );
	}

	@Override
	protected void onDraw( Canvas canvas ) {
		super.onDraw( canvas );
		canvas.drawColor( Color.BLUE );
		Paint mPaint = new Paint();
		mPaint.setStyle( Paint.Style.FILL );
		mPaint.setARGB( 255, 255, 255, 100 );
		canvas.drawBitmap(myBitmap, 0, 0, mPaint);
	}
}
    