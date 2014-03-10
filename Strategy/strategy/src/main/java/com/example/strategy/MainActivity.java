package com.example.strategy;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String team1 = "Barcelona";
		String team2 = "Real Madrid";

		TacticContext context = new TacticContext();

		context.setStrategy(new AttackTactic());
		context.selectTactic(team1);

		context.setStrategy(new DefenceTactic());
		context.selectTactic(team2);

	}

}
