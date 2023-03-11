package chap12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method: declaredMethods) {
			//printannotation 얻기
			PrintAnnotation printAnnotation =
					method.getAnnotation(PrintAnnotation.class);
			//PrintAnnotation이 있으면 해당 어노테이션을 얻고
			//없으면 null값을 얻는다

			//구분선 1개
			printLine(printAnnotation);
			
			//메소드 호출
			method.invoke(new Service());
			
			//구분선 2개
			printLine(printAnnotation);
			
		}
	}
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			
			for(int i = 0; i<number; i++) {
				//value값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
