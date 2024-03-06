package parc;

public class BoardExam {
    public static void main(String[] args) {
        // 6개의 글을 생성하여 배열에 저장
    	Board[] b1 = new Board[6];
        
        b1[0] = new Board(1, 1, 1, "제목1", "작성자1", "내용1");
        b1[1] = new Board(2, 2, 2, "제목2", "작성자2", "내용2");
        b1[2] = new Board(3, 3, 3, "제목3", "작성자3", "내용3");
        b1[3] = new Board(4, 4, 4, "제목4", "작성자4", "내용4");
        b1[4] = new Board(5, 5, 5, "제목5", "작성자5", "내용5");
        b1[5] = new Board(6, 6, 6, "제목6", "작성자6", "내용6");

        // 모든 글을 순서대로 출력
        while(true) {
        	System.out.println(b1[0]);
        	System.out.println(b1[1]);
        	System.out.println(b1[2]);
            System.out.println(b1[3]);
            System.out.println(b1[4]);
            System.out.println(b1[5]);
            break;
        }

        }
    }
