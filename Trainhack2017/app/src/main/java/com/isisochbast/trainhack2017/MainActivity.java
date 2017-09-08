package com.isisochbast.trainhack2017;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView mTextViewBomSOEdit;
    TextView mTextViewBomSPEdit;

    TextView mTextViewBomSOTitle;
    TextView mTextViewBomSPTitle;
    SingleBom Bom1;
    SingleBom Bom2;

    ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bom1 = new SingleBom("999");
        Bom2 = new SingleBom("222");

        mTextViewBomSOEdit = (TextView) findViewById(R.id.text_view_info_bomSO);
        mTextViewBomSPEdit = (TextView) findViewById(R.id.text_view_info_bomSP);


        mTextViewBomSOTitle = (TextView) findViewById(R.id.text_view_bom_SO);
        mTextViewBomSPTitle = (TextView) findViewById(R.id.text_view_bom_SP);


//mImageView = (ImageView) findViewById(R.id.image_view_bom);

        //Om bommen är uppe
        String textBom = "Nästa bom går ner om".concat(" hämta data från API ").concat("minuter");

        String bom1Id = Bom1.getId();
        //Om bommen är nere

        //String textBom = "Bommen går upp om".concat(" hämta data från API ").concat("minuter");

        mTextViewBomSPEdit.setText(textBom);
        mTextViewBomSOEdit.setText(textBom);

        mTextViewBomSOTitle.setText(bom1Id);


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
