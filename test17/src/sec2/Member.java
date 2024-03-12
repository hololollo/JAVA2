package sec2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString // 밑에 띄우면 안된다!!
public class Member {
	private String id;
	private String pw;
	private int point;
}
