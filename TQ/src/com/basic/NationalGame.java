package com.basic;

import java.util.*;

public class NationalGame {
	static String India, China, Bangladesh, Italy, UnitedStates, Games;

	public void setdata(String ind, String chin, String Bangl, String Ita, String Usa) {
		India = ind;
		China = chin;
		Bangladesh = Bangl;
		Italy = Ita;
		UnitedStates = Usa;

	}

	public void DisplayNationalGames() {
		switch (Games) {
		case "India":
			System.out.println("National Game Of India is Hockey");
			break;
		case "China":
			System.out.println("National Games of China is Table Tennis");
			break;
		case "Bangladesh":
			System.out.println("National Games of Bangladesh is Kabaddi");
			break;
		case "Italy":
			System.out.println("National Games of Italy is Football");
			break;
		case "UnitedStates":
			System.out.println("National Games of UnitedStates is Baseball");
			break;
		default:
			System.out.println("Invalid Country");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Country Name");
		Games = sc.next();
		NationalGame obj = new NationalGame();
		obj.setdata("Ind", "Chin", "Bangl", "Ita", "Usa");
		obj.DisplayNationalGames();

	}

}
