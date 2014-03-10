package com.example.strategy;

/**
 * Created by BForte on 3/10/14.
 */
public class AttackTactic implements FootballStrategy {

	@Override
	public void adhereTactic(String team) {
		System.out.println("Strategy: " + team + " will play in attacking football!");
	}

}