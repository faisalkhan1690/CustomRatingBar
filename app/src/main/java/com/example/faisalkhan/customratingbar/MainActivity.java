package com.example.faisalkhan.customratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * <h1><font color="orange">Rating Bar Custom Lib</font></h1>
 * Custom rating bar to avoid star blooding problem in native rating bar
 *
 * <p>set <u>android:indeterminateDrawable="@drawable/unselected_star"</u>
 * unselected_star is the drawable that you are using as drawable for unselected
 *
 * <p>set <u>android:progressDrawable="@drawable/rating_stars"</u>
 * rating_stars is the selector drawable
 *
 * <p>set in parent of your layout
 * <u>xmlns:rating_bar_custom="http://schemas.android.com/apk/res-auto"</u>
 *
 * set number of stars in <u>rating_bar_custom:customNumStars</u> instead of <u>android:numStars</u>
 *
 * @author Faisal khan
 */
public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBarNative;
    private RatingBar ratingBarCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBarNative=(RatingBar)findViewById(R.id.rating_bar_native);
        ratingBarCustom=(RatingBar)findViewById(R.id.rating_bar_custom);
    }


    public void showRating(View view){
        Toast.makeText(MainActivity.this, "Native = "+ratingBarNative.getRating()+"\nCustom = "+ratingBarCustom.getRating(), Toast.LENGTH_SHORT).show();
    }
}
