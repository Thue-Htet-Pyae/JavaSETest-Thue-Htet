package withi_ide_package;

public class Q18 {
    Q18(){
        System.out.println("HelloWorld");
    }
}
class Q18Child1 extends Q18{
    void cal(){
        System.out.println("...");
    }
}
class Q18Child2 extends Q18{
    public static void main(String[] args) {
        Q18 q18 = new Q18();
    }
}
