package com.example.sam_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    DBHandler handler;
    Random ran = new Random();
    private int initialYear = 2000;
    private int initialPoints = 25;
    int currYear;
    ImageView mundo;
    ProgressBar socialPoints;
    ProgressBar economyPoints;
    ProgressBar ambientalPoints;
    TextView year;
    ImageButton cardButton1;
    ImageButton cardButton2;
    ImageButton cardButton3;
    ImageButton cardButton4;
    Card card1 = new Card();
    Card card2 = new Card();
    Card card3 = new Card();
    Card card4 = new Card();
    Card newCardHolder = new Card(0,0,0,0," ");
    boolean game;
    TextView ecoT;
    TextView socT;
    TextView ambT;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new DBHandler(this, null, null, 1);
        mundo = (ImageView) findViewById(R.id.mundo);
        socialPoints = (ProgressBar) findViewById(R.id.socialBar);
        economyPoints = (ProgressBar) findViewById(R.id.economyBar);
        ambientalPoints = (ProgressBar) findViewById(R.id.ambientalBar);
        year = (TextView) findViewById(R.id.year);
        cardButton1 = (ImageButton) findViewById(R.id.card1);
        cardButton2 = (ImageButton) findViewById(R.id.card2);
        cardButton3 = (ImageButton) findViewById(R.id.card3);
        cardButton4 = (ImageButton) findViewById(R.id.card4);


        card1 = handler.getNewCard(ran.nextInt(51) + 1);
        card2 = handler.getNewCard(ran.nextInt(51) + 1);
        card3 = handler.getNewCard(ran.nextInt(51) + 1);
        card4 = handler.getNewCard(ran.nextInt(51) + 1);
        cardButton1.setBackgroundResource(this.getResources().getIdentifier(card1.imageV, "drawable", this.getPackageName()));
        cardButton2.setBackgroundResource(this.getResources().getIdentifier(card2.imageV, "drawable", this.getPackageName()));
        cardButton3.setBackgroundResource(this.getResources().getIdentifier(card3.imageV, "drawable", this.getPackageName()));
        cardButton4.setBackgroundResource(this.getResources().getIdentifier(card4.imageV, "drawable", this.getPackageName()));



        ecoT = (TextView) findViewById(R.id.ecotext);
        socT = (TextView) findViewById(R.id.soctext);
        ambT = (TextView) findViewById(R.id.ambtext);


        socialPoints.setProgress(initialPoints);
        economyPoints.setProgress(initialPoints);
        ambientalPoints.setProgress(initialPoints);
        ecoT.setText(": " + economyPoints.getProgress());
        socT.setText(": " + socialPoints.getProgress());
        ambT.setText(": " + ambientalPoints.getProgress());
        year.setText("Año: " + initialYear);
        currYear = initialYear;

        game = true;



    }


    public void playCard1(View v){
        int currEP = economyPoints.getProgress();
        int currSP = socialPoints.getProgress();
        int currAP = ambientalPoints.getProgress();
        int newImageId;
        String newImageName;

        if(game) {
            economyPoints.setProgress(currEP + card1.economicV);
            socialPoints.setProgress(currSP + card1.socialV);
            ambientalPoints.setProgress(currAP + card1.ambientalV);
            ecoT.setText(": " + economyPoints.getProgress());
            socT.setText(": " + socialPoints.getProgress());
            ambT.setText(": " + ambientalPoints.getProgress());

            card1 = handler.getNewCard(ran.nextInt(51) + 1);
            newImageName = card1.imageV;
            newImageId = this.getResources().getIdentifier(newImageName, "drawable", this.getPackageName());
            cardButton1.setBackgroundResource(newImageId);
        }


        if (economyPoints.getProgress() > 0 && socialPoints.getProgress() > 0 && ambientalPoints.getProgress() > 0 ){
            currYear += 10;
            year.setText("Año: " + currYear);



        }else{
            game=false;
            year.setText("YOU LOST");
        }




    }

    public void playCard2(View v){
        int currEP = economyPoints.getProgress();
        int currSP = socialPoints.getProgress();
        int currAP = ambientalPoints.getProgress();

        if(game) {
            economyPoints.setProgress(currEP + card2.economicV);
            socialPoints.setProgress(currSP + card2.socialV);
            ambientalPoints.setProgress(currAP + card2.ambientalV);
            ecoT.setText(": " + economyPoints.getProgress());
            socT.setText(": " + socialPoints.getProgress());
            ambT.setText(": " + ambientalPoints.getProgress());
            int newImageId;
            String newImageName;

            card2 = handler.getNewCard(ran.nextInt(51) + 1);
            newImageName = card2.imageV;
            newImageId = this.getResources().getIdentifier(newImageName, "drawable", this.getPackageName());
            cardButton2.setBackgroundResource(newImageId);
        }


        if (economyPoints.getProgress() > 0 && socialPoints.getProgress() > 0 && ambientalPoints.getProgress() > 0 ){
            currYear += 10;
            year.setText("Año: " + currYear);



        }else{
            game=false;
            year.setText("YOU LOST");
        }



    }

    public void playCard3(View v){
        int currEP = economyPoints.getProgress();
        int currSP = socialPoints.getProgress();
        int currAP = ambientalPoints.getProgress();

        if(game) {
            economyPoints.setProgress(currEP + card3.economicV);
            socialPoints.setProgress(currSP + card3.socialV);
            ambientalPoints.setProgress(currAP + card3.ambientalV);
            ecoT.setText(": " + economyPoints.getProgress());
            socT.setText(": " + socialPoints.getProgress());
            ambT.setText(": " + ambientalPoints.getProgress());
            int newImageId;
            String newImageName;

            card3 = handler.getNewCard(ran.nextInt(51) + 1);
            newImageName = card3.imageV;
            newImageId = this.getResources().getIdentifier(newImageName, "drawable", this.getPackageName());
            cardButton3.setBackgroundResource(newImageId);
        }

        if (economyPoints.getProgress() > 0 && socialPoints.getProgress() > 0 && ambientalPoints.getProgress() > 0 ){
            currYear += 10;
            year.setText("Año: " + currYear);



        }else{
            game=false;
            year.setText("YOU LOST");
        }

    }

    public void playCard4(View v){
        int currEP = economyPoints.getProgress();
        int currSP = socialPoints.getProgress();
        int currAP = ambientalPoints.getProgress();

        if(game) {
            economyPoints.setProgress(currEP + card4.economicV);
            socialPoints.setProgress(currSP + card4.socialV);
            ambientalPoints.setProgress(currAP + card4.ambientalV);
            ecoT.setText(": " + economyPoints.getProgress());
            socT.setText(": " + socialPoints.getProgress());
            ambT.setText(": " + ambientalPoints.getProgress());
            int newImageId;
            String newImageName;

            card4 = handler.getNewCard(ran.nextInt(51) + 1);
            newImageName = card4.imageV;
            newImageId = this.getResources().getIdentifier(newImageName, "drawable", this.getPackageName());
            cardButton4.setBackgroundResource(newImageId);
        }

        if (economyPoints.getProgress() > 0 && socialPoints.getProgress() > 0 && ambientalPoints.getProgress() > 0 ){
            currYear += 10;
            year.setText("Año: " + currYear);



        }else{
            game=false;
            year.setText("YOU LOST");
        }

    }


}