package withi_ide_package;

public interface Q20 {
    default String Call(){
        return "Heyy";
    }
}
interface Q20Child1 extends Q20{
    public static void main(String[] args) {
        Q20 q20 = new Q20() {
            @Override
            public String Call() {
                return Q20.super.Call();
            }
        };
        System.out.println(q20.Call());
    }
}
