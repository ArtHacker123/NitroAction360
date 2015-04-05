package com.nitro888.nitroaction360;

import android.os.Bundle;

import com.nitro888.nitroaction360.cardboard.CardboardOverlayView;
import com.nitro888.nitroaction360.cardboard.NACardboardView;
import com.google.vrtoolkit.cardboard.CardboardActivity;

/**
 * Created by nitro888 on 15. 4. 5..
 */
public class MainActivity extends CardboardActivity {

    private CardboardOverlayView    mOverlayView;
    private NACardboardView         mNACardboardView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_ui);

        mOverlayView    = (CardboardOverlayView) findViewById(R.id.overlay);
        mOverlayView.show3DToast("NitroAction 360 Start");

        mNACardboardView = (NACardboardView) findViewById(R.id.cardboard_view);
        mNACardboardView.initRenderer(this, R.raw.plane, R.mipmap.test, R.raw.big_buck_bunny);
        setCardboardView(mNACardboardView);
    }
}