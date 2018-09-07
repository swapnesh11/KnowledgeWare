package secondPass;

public class SecondPass {
    public static void main(String[] args) {
        SecondPass sp = new SecondPass();
        //  sp.forLoopFirst();
        // sp.forLoopSecond();
        //  sp.fibonacciPrint();
        //sp.whileLoopFirst();
        sp.arrayTest();

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
    /*public void forLoopSecond(){

       for(int i=3; i>0; i--){
            int k = i;
            for(int j=1; j<=i; j++){

                System.out.print(" "+ k--);
            }
            System.out.println();
        }

        }*/
    /*public void fibonacciPrint(){
        int i=0; int j=1;

        for(int k=1; k<10; k++){
            int l=i+j;

            System.out.println(l);
            i=j;
            j = l;

        }


    }*/
    /*3 2 1
      2 1
      1
      */
    /*public void whileLoopFirst(){
        int i = 3;
        do{
            int k=i;
            for(int j=1;j<=i; j++) {
                System.out.print(" " + (k--));
            }
            i--;
            System.out.println();

        }while(i >= 1);

        }*/
    /*3 2 1
      3 2
      3
      */
   /* public void whileLoopFirst() {
        int i = 1;
        do {

            for (int j = 3; j >= i; j--) {
                System.out.print(" " + (j));
            }
            i++;
            System.out.println();

        } while (i <= 3);
    }*/
   /*
    Salary of month May is: 70000.0
    Salary of month May is: 90000.0
    */

   public void arrayTest(){
       //12 months of salary saved in 'salary' array
       double[] salary;
       salary = new double[12];
       double sal= 50000;
       for(int i=0; i<salary.length; i++){
           salary[i]=sal;
           sal+=5000;
       }
       System.out.println("Salary of month May is: "+ salary[4]);
       System.out.println("Salary of month May is: "+ salary[8]);


   }


}

