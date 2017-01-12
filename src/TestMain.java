import java.lang.reflect.Method;

/**
 * Created by user on 12.01.2017.
 */
public class TestMain {
    public static void main(String[] args) {
        ClassIsAnnotatedByTest annotatedClass = new ClassIsAnnotatedByTest();
        Class<?> gettingClass = annotatedClass.getClass();
        Method[] methods = gettingClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                annotatedClass.annotatedVoid(test.a(), test.b());
            }
        }
    }
}
