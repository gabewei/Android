package org.westada.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcAppBtn = (Button)findViewById(R.id.calcAppBtn);
        calcAppBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntentCalc = getPackageManager().getLaunchIntentForPackage("org.westada.gabewcalculator");
                if (startIntentCalc != null) {
                    startActivity(startIntentCalc);//null pointer check in case package name was not found
                }
                startActivity(startIntentCalc);
            }
        });

        Button slopeCalcAppBtn = (Button)findViewById(R.id.slopeCalcAppBtn);
        slopeCalcAppBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntentSlope = getPackageManager().getLaunchIntentForPackage("org.westada.slopecalculator");
                if (startIntentSlope != null) {
                    startActivity(startIntentSlope);//null pointer check in case package name was not found
                }
                startActivity(startIntentSlope);
            }
        });

        // Attempt to launch an activity outside our app
        Button portfolioBtn = (Button)findViewById(R.id.portfolioBtn);
        portfolioBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String portfolio = "https://www.westada.tech/a4/gabew/";
                Uri webaddress = Uri.parse(portfolio);

                Intent gotoPortfolio = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoPortfolio.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoPortfolio);
                }
            }
        });
    }
}
