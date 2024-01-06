package 第五章;

public class Return {
    public static void main(String[] args) {
        System.out.println
        ("------------------分界限------------");
        for (int i = 1; i <= 100; i++) {
            if(i == 40)  return;
            System.out.println("i=" +i);
        }
    }
    
}
