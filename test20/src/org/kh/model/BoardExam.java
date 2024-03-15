package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {

	public static void main(String[] args) {
		List<Board>BoList = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			Board b = new Board(i, "제목"+i, "내용"+i, "작성자"+i, "24.03.1"+ i, i);
			BoList.add(b);
			
		}
		for(Board w : BoList) {
			System.out.println(w.toString());
		}
		
	}

}
