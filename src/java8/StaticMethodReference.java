package java8;

interface Sayable{
    void say();
  //  void say2();
}
public class StaticMethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public void saySomething2(){
        System.out.println("saySomething 2");
    }
    public static void main(String[] args) {
        Sayable sayable = StaticMethodReference::saySomething;

        sayable.say();
    }
}
