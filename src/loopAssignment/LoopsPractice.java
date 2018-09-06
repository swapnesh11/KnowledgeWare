package loopAssignment;

public class LoopsPractice {
    public static void main(String[] args) {
        LoopsPractice lp = new LoopsPractice();
//        lp.dowhile();
        //lp.whileLoop();
        System.out.println(a);
//        lp.dowhile();
        lp.whileLoop();
        System.out.println(a);
//        dowhile();
//        lp.a = 10;
//        a = 10;
    }
    static int a = 1;
    static final double  pi = 3.14;
    public static void dowhile(){
        System.out.println("In do while loop");
        do{
            a++;
            System.out.println(a);
        } while (a<10);
    }
    public void whileLoop(){
        System.out.println("In while loop");
        while(a <= 40){
            System.out.println(a);
//            System.out.println(a*2);
            a= a+4;
        }
//        System.out.println(a);
    }


}


