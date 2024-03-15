package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;

public class ApartmentExam {

	public static void main(String[] args) {
		
		List<Apartment> ac = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			Apartment ap = new Apartment("남양주"+i, "자이", 1, 103, 1105, 113);
			
			ac.add(ap);

			}
		for(Apartment a : ac) {
			System.out.println(a.toString());
		}
		
	}

}
