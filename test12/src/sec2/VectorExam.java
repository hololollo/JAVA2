package sec2;
// ArrayList와의 차이점 특징 : ArrayList 는 내용이 없는 인스턴스의 메모리가 있으면 메모리를 그대로 차지 하고 있으나 (null)
// Vector는 내용이 없으면, 메모리에서 자동 제거(remove) 됨. (메모리를 효율적으로 사용 가능.)
import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		// 글쓰기
		nVector.add(new Notice("공지사항", "내용", "관리자"));
		nVector.add(new Notice("제목1", "내용1", "작성자1"));
		nVector.add(new Notice("제목2", "내용2", "작성자2"));
		nVector.add(new Notice("제목3", "내용3", "작성자3"));
		nVector.add(new Notice("제목4", "내용4", "작성자4"));
		nVector.add(new Notice("제목5", "내용5", "작성자"));
		
		// 글목록
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		
		nVector.remove(2); // 인덱스 2 제거
		Notice no = new Notice("제목", "내용", "유정환");
		nVector.set(4, no); // 인스턴스를 인덱스가 4인 곳에 삽입
		System.out.println("\n 편집 후 \n");
		System.out.println("제목\t내용\t작성자");
		for(int i = 0; i <nVector.size(); i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor()); //한 칸 당겨져서(remove)  
		}
	}

}
