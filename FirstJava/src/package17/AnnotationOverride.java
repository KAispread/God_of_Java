package package17;

import package10.Parent;

public class AnnotationOverride extends Parent{
	
	@Override
	public void printName() {
		System.out.println("AnnotationOverride");
	}
	
	@Deprecated
	public void noMoreUse() {
		// @Deprecated ������̼� ����, �޼ҵ�� �߾Ӽ��� �׾�����.
	}
}
