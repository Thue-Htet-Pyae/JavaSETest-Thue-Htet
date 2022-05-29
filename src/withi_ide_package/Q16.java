package withi_ide_package;

public class Q16 {
    private static final Q16 instance = new Q16();
    private Q16(){};

    public static Q16 getInstance(){
        return instance;
    }
}

class SinglerChild{
    public static void main(String[] args) {
        System.out.println(Q16.getInstance());
        System.out.println(Q16.getInstance());
    }
}
