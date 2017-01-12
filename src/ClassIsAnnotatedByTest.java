/**
 * Created by user on 12.01.2017.
 */
public class ClassIsAnnotatedByTest {
    @Test(a = 2, b = 5)
    public void annotatedVoid (int a, int b){
        System.out.println( "int a = " + a + "; int b = " + b);
    }
}
