/**
 * Created by admin on 2017/12/09.
 */

class TestKotlin {
    /*
変数の宣言
変数に値が代入されるときは、型推論でvarの変数に変換される
もともとfinalの場合にvalになる
宣言時に代入がないケースはvarで仮の値が入っている
*/
    // int a = 123;
    var a = 123
    // final int c = 567;
    val c = 567
    // int b;
    // String s;
    var b: Int = 0
    var s: String? = null

    // nullableになるのを避けるために、lateinitにしたほうがいい
    lateinit internal var user: User
    lateinit var sa: String

}

/*

*/

/*
classのアクセス修飾子
public->public
private->private
になる
Javaでアクセス修飾子がついていない場合 internalになる
意図したものかは要確認
アクセス修飾子なしの時、JavaはPackage内で参照可能
KotlinのInternalは同じモジュール内で参照可能
https://dogwood008.github.io/kotlin-web-site-ja/docs/reference/visibility-modifiers.html
*/

//public class PublicClass {
//    private String a = "abc";
//}
class PublicClass {
    private val a = "abc"
}

// private class PrivateClass {private String a = "abc";}
private class PrivateClass {
    private val a = "abc"
}
// class MyClass{private String a = "abc";}
internal class MyClass {
    private val a = "abc"
}


/*
コンストラクタ一つが含まれるクラスを変換すると、クラス宣言にコンストラクタの定義が含まれるような
省略表現になる
https://kotlinlang.org/docs/reference/classes.html#constructors
*/

//class User {
//    private String name;
//    public User(String name) {
//        this.name = name;
//    }
//}

internal class User(private val name: String)

//class MyUser {
//    private String name;
//    private int age;
//    public MyUser(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}

internal class MyUser(private val name: String, private val age: Int)


//class User {
//
//    private String firstName;
//    private String lastName;
//    private String fullName;
//
//    public User(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.fullName = new StringBuilder()
//                .append(firstName)
//                .append(" ")
//                .append(lastName)
//                .toString();
//    }
//}

internal class User2(private val firstName: String, private val lastName: String) {
    private val fullName: String

    init {
        this.fullName = StringBuilder()
                .append(firstName)
                .append(" ")
                .append(lastName)
                .toString()
    }
}
