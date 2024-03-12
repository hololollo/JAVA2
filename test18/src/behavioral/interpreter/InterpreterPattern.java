package behavioral.interpreter;
// InterpreterPattern : 문법 규칙을 정의하고 해석하는 패턴
public class InterpreterPattern {
	public static void main(String[] args) {
		Expression isMale = getMaleExpression(); // 아래
		Expression isMarried = getMarriedExpression(); // 아래
		
		System.out.println("kim male ? " + isMale.interpreter("kim"));
		System.out.println("park male ? " + isMale.interpreter("park")); // 대응되는 값이 없으므로 false
		
		System.out.println("park married ? " + isMarried.interpreter("park"));
		System.out.println("lee married ? " + isMarried.interpreter("lee")); // 대응되는 값이 없으므로 false
	}
	public static Expression getMaleExpression() {
		Expression kim = new TerminalExpression("kim");
		Expression lee = new TerminalExpression("lee");
		return new OrExpression(kim, lee);
	}
	public static Expression getMarriedExpression() {
		Expression park = new TerminalExpression("park");
		Expression married = new TerminalExpression("married");
		return new AndExpression(park, married);
		
	}

}
