package sec2;

public class StudentEx1 {

	public static void main(String[] args) {
		
		Student s1 = new Student("강범준", 1, 100000);
		Student s2 = new Student("강민우", 2, 200000);
		Student s3 = new Student("이종우", 3, 300000);
		
		Bus bus102 = new Bus(101);
		s1.takeBus(bus102);
		s1.print();
		bus102.show();
		
		//강민우 학생이 101번 버스 두번 이용하고, 지하철 2호선을 세 번 이용하였을 경우
		//강민우 학생의 정보와 버스 101호의 정보와 지하철 2호선의 정보를 출력.

		Bus bus101 = new Bus(101);
		Subway sub2 = new Subway(2);
		s2.takeBus(bus101);
		s2.takeBus(bus101);

		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);

		s2.print();
		bus101.show();
		sub2.SubwayStatus();
		
		
		
		
	}

}
