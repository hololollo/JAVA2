package sec1;
// 추상 클래스
public abstract class User { // 추상 클래스 : 단 하나의 메서드라도 추상화 메서드가 있음.
	protected String ip; // protected : 같은 패키지 내에서 사용, 상속을 받은 경우 사용, 연관된 경우
	protected int port;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	@Override
	public String toString() {
		return "User [ip=" + ip + ", port=" + port + "]";
	}
	public abstract void connect(); // abstract : 추상화(추상메서드) -> class에 abstract표기
	// 추상 메서드 : 메서드의 기능 구현 내용을 기술하지 않고, 선언
}
