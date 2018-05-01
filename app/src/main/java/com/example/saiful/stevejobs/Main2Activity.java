package com.example.saiful.stevejobs;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView= (TextView) findViewById(R.id.textView);
//        toolbar= (Toolbar) findViewById(R.id.tol_bar);
//        setSupportActionBar(toolbar);
    }

    public void one(View view) {
        if (view.getId() == R.id.button) {
            String s="My favorite things in life don’t cost any money. It’s really clear that the most precious resource we all have is time.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button2) {
            String s="I’m as proud of many of the things we haven’t done as the things we have done. Innovation is saying no to a thousand things.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button3) {
            String s="Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven’t found it yet, keep looking. Don’t settle. As with all matters of the heart, you’ll know when you find it.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button4) {
            String s="Have the courage to follow your heart and intuition. They somehow know what you truly want to become.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button5) {
            String s="I think if you do something and it turns out pretty good, then you should go do something else wonderful, not dwell on it for too long. Just figure out what’s next.";

            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button6) {
            String s="Sometimes when you innovate, you make mistakes. It is best to admit them quickly, and get on with improving your other innovations.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button7) {
            String s="When you’re a carpenter making a beautiful chest of drawers, you’re not going to use a piece of plywood on the back, even though it faces the wall and nobody will see it. You’ll know it’s there, so you’re going to use a beautiful piece of wood on the back. For you to sleep well at night, the aesthetic, the quality, has to be carried all the way through.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button8) {
            String s="That’s been one of my mantras—focus and simplicity. Simple can be harder than complex; you have to work hard to get your thinking clean to make it simple.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button9) {
            String s="Quality is more important than quantity. One home run is much better than two doubles.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
        if (view.getId() == R.id.button10) {
            String s="Being the richest man in the cemetery doesn’t matter to me. Going to bed at night saying we’ve done something wonderful...that’s what matters to me.";
            int i=s.length();
            AlertDialog builder = new AlertDialog.Builder(this).setMessage(s).show();
            textView.setText(String.valueOf(i));

        }
    }
}
