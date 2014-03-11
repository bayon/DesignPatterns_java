package com.example.state;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*
		 * State - Allow an object to alter it’s behavior when it’s internal state changes. The object will appear to change it’s class.
		 */

		/*
		 * SeasonContext, a class that contains a "Season" class and has a constructor that accepts a "Season" as a parameter. It can "set" the season and
		 * describe the season.
		 * 
		 * Season, is an INTERFACE that accepts a context as a parameter.
		 * 
		 * All the various seasons implement the Season constructor, and using its context, sets the next season after declaring itself the season in text.
		 */

		SeasonContext seasonContext = new SeasonContext();
		seasonContext.whatIsTheSeason();
		seasonContext.whatIsTheSeason();
		seasonContext.whatIsTheSeason();
		seasonContext.whatIsTheSeason();
	}

}
