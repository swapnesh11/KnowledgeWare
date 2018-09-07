package secondPass;

public class SecondPass {
    public static void main(String[] args) {
        SecondPass sp = new SecondPass();
      //  sp.forLoopFirst();
        sp.secondLoopFirst();
      //  sp.fibonacciPrint();

    }
    /*
    3 2 1
    3 2
    3
    *?
    /*public void forLoopFirst(){
        for(int i=1; i<=3; i++){
            for(int j=3; j>=i; j--){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }*/
    public void secondLoopFirst(){

       for(int i=3; i>0; i--){
            int k = i;
            for(int j=1; j<=i; j++){

                System.out.print(" "+ k--);
            }
            System.out.println();
        }

        }



    /*public void fibonacciPrint(){
        int i=0; int j=1;

        for(int k=1; k<10; k++){
            int l=i+j;

            System.out.println(l);
            i=j;
            j = l;

        }


    }*/
}
