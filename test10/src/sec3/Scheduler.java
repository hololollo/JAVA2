package sec3;
// 스케줄링 : 선점형 / 비 선점형
// 선점 : 해당 프로세스가 처리되다가 다른 프로세스에게 CPU를 양도될 수 있는. ex) RoungRobin
// 비선점 : 해당 프로세스가 모두 완료될 때 까지 다른 프로세스에게 cpu를 양도할 수 없는 . ex)LeastJob
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
