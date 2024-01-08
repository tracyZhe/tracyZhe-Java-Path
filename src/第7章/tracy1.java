package 第7章;

 class tracy {

    //在java 中，一个子类可以访问父类的构造方法  用法：super(参数)，注意和访问常量和普通方法的区别，其用法为super/this.
    
        public static void prt(String s) {
            System.out.println(s);
        }

        tracy(){  //无参数构造方法
            prt("无参数构造器");
        }

        tracy(String name ){ //有参数构造器
            prt("有参数构造器" + name);
        }      
    }
    
    //子类
    @SuppressWarnings("unused")
    public class tracy1 extends tracy{
         tracy1(){
            super();
            prt("调用父类的prt");
         } //无参数构造器   

         tracy1(String name ){ //有参数构造器
            super(name);
            prt("调用父类的有参数构造器" + name);
         }
         tracy1(String name , int age){ //定义具有2个形参的构造器，这种构造器可以调用父类只有一个相同行参的构造器
            this(name);
            prt("2个 行参的" + age);
         }

         //主函数
        public static void main(String[] args) {
                tracy cn = new tracy();
                cn = new tracy1("tracyzhe");
                cn = new tracy1("tracyzhe", 28);

            }



        }


    
        
    

