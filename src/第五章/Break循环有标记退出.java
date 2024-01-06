

package 第五章;

public  class Break循环有标记退出 {
    public static void main(String[] args) {
        tracy:for (int i = 0; i < 10; i++) {
                System.out.println("x=" + i);
                for (int j = 0; j < 10; j++) {
                    if(j==4){
                        break tracy;
                    }
                    System.out.println("Y="+j);
                }        
        }
    }
    
}