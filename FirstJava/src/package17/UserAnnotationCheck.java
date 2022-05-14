package package17;

import java.lang.reflect.Method;

public class UserAnnotationCheck {

	public static void main(String[] args) {
		UserAnnotationCheck sample = new UserAnnotationCheck();
		sample.checkAnnotations(UserAnnotationSample.class);
	}
	
	public void checkAnnotations(@SuppressWarnings("rawtypes") Class useClass) {
		Method[] methods = useClass.getDeclaredMethods();
		for(Method tempMethod:methods) {
			UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class);
			/*getAnnotation �޼ҵ�� �ش� �޼ҵ忡 ����Ǿ� �ִ� �Ű������� �Ѱ��� ������̼��� �ִ��� Ȯ���Ѵ�.
			 * ���� ���, Annotation ��ü�� �����Ѵ�*/
			
			if(annotation != null) {
				int number = annotation.number();
				String text = annotation.text();
				//annotation ��ü���� ����� �޼ҵ带 �����Ѵ�.
				
				System.out.println(tempMethod.getName()+ "() : number=" +number+" text=" + text);
			} else {
				System.out.println(tempMethod.getName() + "() : annotation is null");
			}
		}
	}

}
