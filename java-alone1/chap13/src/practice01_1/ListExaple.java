package practice01_1;

import java.util.*;

public class ListExaple {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();   //메소드
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}

	}
}
