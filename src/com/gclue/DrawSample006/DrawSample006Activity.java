package com.gclue.DrawSample006;

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
		// �N���X�̃C���X�^���X�𐶐�
		MyView mView = new MyView( this );

		// View�ɐݒ�
		setContentView( mView );
	}
}

/**
 * �`��p�̃N���X�B
 */
class MyView extends View {

	/** �摜���i�[����ϐ��B */
	private Bitmap myBitmap;

	/**
	 * �R���X�g���N�^�B
	 * @param context �R���e�L�X�g
	 */
	public MyView( Context context ) {
		super( context );
		setFocusable( true );

		// Resource�C���X�^���X�̐���
		Resources res = this.getContext().getResources();
		// �摜�̓ǂݍ���(res/drawable/gclue_logo.gif)
		myBitmap = BitmapFactory.decodeResource( res, R.drawable.gclue_logo );
	}

	/**
	 * �`�揈�����s���B
	 */
	@Override
	protected void onDraw( Canvas canvas ) {
		super.onDraw( canvas );

		// �w�i�F��ݒ�
		canvas.drawColor( Color.BLUE );

		// �`�悷�邽�߂̐��̐F��ݒ�
		Paint mPaint = new Paint();
		mPaint.setStyle( Paint.Style.FILL );
		mPaint.setARGB( 255, 255, 255, 100 );

		// Bitmap�C���[�W�̕`��
		canvas.drawBitmap(myBitmap, 0, 0, mPaint);
	}
}
    