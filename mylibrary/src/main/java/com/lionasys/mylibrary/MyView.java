package com.lionasys.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by urvi on 14/11/17.
 */

public class MyView extends AppCompatActivity {

    public static AdView mAdViewBottom;
    RelativeLayout relativeLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_view);

        MobileAds.initialize(getApplicationContext(),
                "ca-app-pub-3940256099942544~3347511713");

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

       /* mAdViewTop = findViewById(R.id.adViewTop);
        AdRequest adRequestTop = new AdRequest.Builder().build();
        mAdViewTop.loadAd(adRequestTop);*/

        mAdViewBottom = findViewById(R.id.adView);
        AdRequest adRequestButtom = new AdRequest.Builder().build();
        mAdViewBottom.loadAd(adRequestButtom);




    /*public MyView(Context context) {
        super(context);
        initialize(context);

        AdView adView = new AdView(context);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);

    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }*/

    }

    public void setAdTop(View view){

        RelativeLayout.LayoutParams adViewParams = new RelativeLayout.LayoutParams(
                AdView.LayoutParams.WRAP_CONTENT,
                AdView.LayoutParams.WRAP_CONTENT);
        // align top
        adViewParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        // align center
        adViewParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);


        relativeLayout.addView(mAdViewBottom, adViewParams);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdViewBottom.loadAd(adRequest);
    }

    public void setAdBottom(View view){

        RelativeLayout.LayoutParams adViewParams = new RelativeLayout.LayoutParams(
                AdView.LayoutParams.WRAP_CONTENT,
                AdView.LayoutParams.WRAP_CONTENT);
        // align top
        adViewParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        // align center
        adViewParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);


        relativeLayout.addView(mAdViewBottom, adViewParams);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdViewBottom.loadAd(adRequest);
    }

}
