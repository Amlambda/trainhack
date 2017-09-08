package com.isisochbast.trainhack2017;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView mTextViewBomSOEdit;
    TextView mTextViewBomSPEdit;
    TextView mTextViewBomSOTitle;
    TextView mTextViewBomSPTitle;
    SingleBom Bom1;
    SingleBom Bom2;

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

        //Om bommen är uppe
        String textBom = "Nästa bom går ner om".concat(" hämta data från API ").concat("minuter");

        String bom1Id = Bom1.getId();
        //Om bommen är nere

        //String textBom = "Bommen går upp om".concat(" hämta data från API ").concat("minuter");

        mTextViewBomSPEdit.setText(textBom);
        mTextViewBomSOEdit.setText(textBom);

        mTextViewBomSOTitle.setText(bom1Id);


    }




}
