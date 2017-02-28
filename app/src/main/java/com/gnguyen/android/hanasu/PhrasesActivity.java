package com.gnguyen.android.hanasu;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases_activity);
        // Up button on ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Find the view pager that will allow user to swipe between fragments
        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);

        // create an adapter that shows which fragment should be displayed for each page
        FragmentPageViewer adapter = new FragmentPageViewer(getSupportFragmentManager(), this);
        //FragmentPageViewer adapter = new FragmentPageViewer(getSupportFragmentManager());
        // set the adapter onto the ViewPager
        viewPager.setAdapter(adapter);

/**
 * // Code for listView version of menu, using menu options that open associated activities
 *
        TextView greetings = (TextView)findViewById(R.id.greetings);
        greetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent greetingsIntent = new Intent(PhrasesActivity.this, GreetingsActivity.class);
                startActivity(greetingsIntent);
            }
        });

        TextView conversation = (TextView)findViewById(R.id.conversation);
        conversation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent conversationIntent = new Intent(PhrasesActivity.this, ConversationActivity.class);
                startActivity(conversationIntent);
            }
        });

        TextView politeness = (TextView)findViewById(R.id.politeness);
        politeness.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent politenessIntent = new Intent(PhrasesActivity.this, PolitenessActivity.class);
                startActivity(politenessIntent);
            }
        });

        TextView questions = (TextView)findViewById(R.id.questions);
        questions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent questionsIntent = new Intent(PhrasesActivity.this, QuestionsActivity.class);
                startActivity(questionsIntent);
            }
        });

        TextView compliments = (TextView)findViewById(R.id.compliments);
        compliments.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent complimentsIntent = new Intent(PhrasesActivity.this, ComplimentsActivity.class);
                startActivity(complimentsIntent);
            }
        });

        ImageView phrases_wallpaper = (ImageView)findViewById(R.id.phrases_wallpaper);
        phrases_wallpaper.setScaleType(ImageView.ScaleType.FIT_XY);
*/
    }
}
