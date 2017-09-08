package com.isisochbast.trainhack2017;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    TextView mTextViewBomSOEdit;
    TextView mTextViewBomSPEdit;

    TextView mTextViewBomSOTitle;
    TextView mTextViewBomSPTitle;
    SingleBom Bom1;
    SingleBom Bom2;
    String TAG ="test";

    ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bom1 = new SingleBom("S:t Olofsgatan");
        Bom2 = new SingleBom("S:t Persgatan");

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


     //  try {

        /*
        HttpURLConnection urlConnection = null; // Create HTTP Client
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  } catch (java.io.IOException e) {
        //    e.printStackTrace();
       // }


        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) // Read line by line
                sb.append(line + "\n");

            String resString = sb.toString(); // Result is here

          //  is.close(); // Close the stream

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }*/

        /*HttpGet httpget = new HttpGet("http://yoururl.com"); // Set the action you want to do
        HttpResponse response = httpclient.execute(httpget); // Executeit
        HttpEntity entity = response.getEntity();
        InputStream is = entity.getContent(); // Create an InputStream with the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) // Read line by line
            sb.append(line + "\n");

        String resString = sb.toString(); // Result is here

        is.close(); // Close the stream
*/

    }




}
