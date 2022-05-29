package withi_ide_package;

public interface Q21 {
    default int Addition(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
}

interface Q21Child1{

}

class Q21Chlild2 implements Q21,Q21Child1{
    public static void main(String[] args) {
        Q21 q21 = new Q21() {
            @Override
            public int Addition(int a, int b) {
                Q21.super.Addition(a, b);
                return a;
            }
        };
        q21.Addition(4,5);
    }
}
