package behavioral.interpreter;
// TerminalExpression : 문자열 검증
public class TerminalExpression implements Expression {
	
	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpreter(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}

}
