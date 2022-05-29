package withi_ide_package;

public class Q17 {
        void call(){
            System.out.println("Hello");
        }

}
class Q17Child1 extends Q17{

}
class Q17Child2 extends Q17Child1{
    public static void main(String[] args) {
        Q17 q17 = new Q17();
        q17.call();
    }
}
