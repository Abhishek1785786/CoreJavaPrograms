package com.javaproject;

public class Movie {
	
	static String theatreName="Sri Ramulu";
	static String theatreLocation="Moosapet";
	
	String movieName;
	int movieBudget;
	String releaseDate;
	
	void display() {
		System.out.println("Theatre Name: "+theatreName);
		System.out.println("Theatre Location: "+theatreLocation);
		System.out.println("Movie Name: "+movieName);
		System.out.println("Movie Budget: "+movieBudget);
		System.out.println("Release Date: "+releaseDate);
		System.out.println();
	}
	public static void main(String[] args) {
		Movie tn=new Movie();
		Movie tl=new Movie();
		Movie mn=new Movie();
		Movie mb=new Movie();
		Movie rd=new Movie();
		
		tn.display();
		tl.display();
		mn.display();
		mb.display();
		rd.display();
		

	}

}
