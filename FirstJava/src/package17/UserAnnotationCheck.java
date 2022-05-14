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
			/*getAnnotation 메소드는 해당 메소드에 선언되어 있는 매개변수로 넘겨준 어노테이션이 있는지 확인한다.
			 * 있을 경우, Annotation 객체를 리턴한다*/
			
			if(annotation != null) {
				int number = annotation.number();
				String text = annotation.text();
				//annotation 객체에서 선언된 메소드를 저장한다.
				
				System.out.println(tempMethod.getName()+ "() : number=" +number+" text=" + text);
			} else {
				System.out.println(tempMethod.getName() + "() : annotation is null");
			}
		}
	}

}
