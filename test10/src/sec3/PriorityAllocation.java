package sec3;
// (우선순위 할당)
public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("그 다음 우선순위가 높은분이 상담받습니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("선착순, 나이순, 급한 순서로 우선순위를 배분합니다.");
		
	}
	

}
