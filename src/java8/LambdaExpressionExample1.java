package java8;

interface Drawable{
    public void draw(int w);
}
public class LambdaExpressionExample1 {
    public static void main(String[] args) {
        Drawable d= w -> System.out.println("Drawing "+w);
        d.draw(5);

    }
}
