package com.example.strategy;

/**
 * Created by BForte on 3/10/14.
 */
public class TacticContext {

	private FootballStrategy strategy = null;

	public void selectTactic(String team) {
		strategy.adhereTactic(team);
	}

	public FootballStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(FootballStrategy strategy) {
		this.strategy = strategy;
	}

}