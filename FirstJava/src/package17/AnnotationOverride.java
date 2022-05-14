package package17;

import package10.Parent;

public class AnnotationOverride extends Parent{
	
	@Override
	public void printName() {
		System.out.println("AnnotationOverride");
	}
	
	@Deprecated
	public void noMoreUse() {
		// @Deprecated 어노테이션 사용시, 메소드명에 중앙선이 그어진다.
	}
}
