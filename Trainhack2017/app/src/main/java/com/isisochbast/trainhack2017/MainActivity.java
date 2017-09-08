package com.isisochbast.trainhack2017;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;


public class MainActivity extends AppCompatActivity {

    TextView mTextViewBomSOEdit;
    TextView mTextViewBomSPEdit;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewBomSOEdit = (TextView) findViewById(R.id.text_view_info_bomSO);



        mTextViewBomSPEdit = (TextView) findViewById(R.id.text_view_info_bomSP);
//mImageView = (ImageView) findViewById(R.id.image_view_bom);
        //Om bommen är uppe
        String textBom = "Nästa bom går ner om".concat(" hämta data från API ").concat("minuter");

        //Om bommen är nere

        //String textBom = "Bommen går upp om".concat(" hämta data från API ").concat("minuter");

        mTextViewBomSPEdit.setText(textBom);
        mTextViewBomSOEdit.setText(textBom);


        AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.left_red), 1000);
        animation.addFrame(getResources().getDrawable(R.drawable.right_red), 1000);
        animation.setOneShot(false);

        ImageView imageAnim =  (ImageView) findViewById(R.id.image_view_bom);
        imageAnim.setBackgroundDrawable(animation);

        // start the animation!
        animation.start();






    }




}
