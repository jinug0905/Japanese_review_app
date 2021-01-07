package org.pandora.japanese_review;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ImageView[] imageViews = new ImageView[46];
    int imgIdx = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViews[0] = findViewById(R.id.imageView1);
        imageViews[1] = findViewById(R.id.imageView2);
        imageViews[2] = findViewById(R.id.imageView3);
        imageViews[3] = findViewById(R.id.imageView4);
        imageViews[4] = findViewById(R.id.imageView5);
        imageViews[5] = findViewById(R.id.imageView6);
        imageViews[6] = findViewById(R.id.imageView7);
        imageViews[7] = findViewById(R.id.imageView8);
        imageViews[8] = findViewById(R.id.imageView9);
        imageViews[9] = findViewById(R.id.imageView10);
        imageViews[10] = findViewById(R.id.imageView11);
        imageViews[11] = findViewById(R.id.imageView12);
        imageViews[12] = findViewById(R.id.imageView13);
        imageViews[13] = findViewById(R.id.imageView14);
        imageViews[14] = findViewById(R.id.imageView15);
        imageViews[15] = findViewById(R.id.imageView16);
        imageViews[16] = findViewById(R.id.imageView17);
        imageViews[17] = findViewById(R.id.imageView18);
        imageViews[18] = findViewById(R.id.imageView19);
        imageViews[19] = findViewById(R.id.imageView20);
        imageViews[20] = findViewById(R.id.imageView21);
        imageViews[21] = findViewById(R.id.imageView22);
        imageViews[22] = findViewById(R.id.imageView23);
        imageViews[23] = findViewById(R.id.imageView24);
        imageViews[24] = findViewById(R.id.imageView25);
        imageViews[25] = findViewById(R.id.imageView26);
        imageViews[26] = findViewById(R.id.imageView27);
        imageViews[27] = findViewById(R.id.imageView28);
        imageViews[28] = findViewById(R.id.imageView29);
        imageViews[29] = findViewById(R.id.imageView30);
        imageViews[30] = findViewById(R.id.imageView31);
        imageViews[31] = findViewById(R.id.imageView32);
        imageViews[32] = findViewById(R.id.imageView33);
        imageViews[33] = findViewById(R.id.imageView34);
        imageViews[34] = findViewById(R.id.imageView35);
        imageViews[35] = findViewById(R.id.imageView36);
        imageViews[36] = findViewById(R.id.imageView37);
        imageViews[37] = findViewById(R.id.imageView38);
        imageViews[38] = findViewById(R.id.imageView39);
        imageViews[39] = findViewById(R.id.imageView40);
        imageViews[40] = findViewById(R.id.imageView41);
        imageViews[41] = findViewById(R.id.imageView42);
        imageViews[42] = findViewById(R.id.imageView43);
        imageViews[43] = findViewById(R.id.imageView44);
        imageViews[44] = findViewById(R.id.imageView45);
        imageViews[45] = findViewById(R.id.imageView46);
    }

    public void clickedBefore(View view){ changeImageBefore(); }

    public void clickedNext(View view){
        changeImageNext();
    }

    private void changeImageBefore(){
        imageViews[imgIdx].setVisibility(View.INVISIBLE);

        if(imgIdx == 0){
            imgIdx = 45;
            imageViews[imgIdx].setVisibility(View.VISIBLE);
        } else {
            imgIdx--;
            imageViews[imgIdx].setVisibility(View.VISIBLE);
        }
    }

    private void changeImageNext(){
        imageViews[imgIdx].setVisibility(View.INVISIBLE);

        if(imgIdx == 45){
            imgIdx = 0;
            imageViews[imgIdx].setVisibility(View.VISIBLE);
        } else {
            imgIdx++;
            imageViews[imgIdx].setVisibility(View.VISIBLE);
        }
    }
}