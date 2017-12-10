/**
 * Created by admin on 2017/12/09.
 */

public class TestJava {
    private int methodA(int a, int b) {
        boolean bool = true;
        String s;
        if(b) {
            s = "a";
        } else {
            s = "b";
        }
    }


}



public class PublicClass {
    private String a = "abc";
}
protected class ProtectedClass {}
private class PrivateClass {private String a = "abc";}
class MyClass{private String a = "abc";}



class MyUser {
    private String name;
    private int age;
    public MyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



