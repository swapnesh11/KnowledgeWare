package loopAssignment;

public class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();
    //    p.firstPatternProgram();
       // p.thirdPatternProgram();
     //   p. fourthPatternProgram();
      //  p.fifthPatternProgram();
  //      p.printTriagle(5);
            p.sixthPatternProgram();
    }
    /*
    1
   21
  321
 4321
54321
   *
   * *
  * * *
 * * * *
* * * * *
     */
    /*public void firstPatternProgram(){
        int limit = 5;
        for(int i=1; i <= limit; i++){
            int space = limit-i;
            for (int k = 1 ; k <= space ; k++){
                System.out.print(" ");
            }
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void secondPatternProgram(){
        int limit = 0;
        for(int i=1; i <= 5; i++){
            int space = limit * limit;
            limit+=2;
            for(int j=i; j>0; j--){

            for (int k = 0 ; k <= space ; k++){
                System.out.print(" ");


            }System.out.print(j);

            }
            System.out.println();
        }
    }*/
    /*
    * 1
22
333
4444
55555*/
    /*public void thirdPatternProgram(){
        for(int row=1; row<=5; row++){
            for(int col=1; col<=row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }*/
    /*
            1
            23
            456
            78910
            1112131415
*/
    /*public void fourthPatternProgram(){
        int num=1;
        for(int row=1; row<=5; row++){
            for(int col=1; col<=row; col++){
                System.out.print(num);
                num+=1;
            }
            System.out.println();
        }
    }*/
    /*
         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *
     */
   /* public void fifthPatternProgram (){
        int i, j, k ;
        int none=1;
        int si= 1;
        for (i = 4; i >= 1; i--) {


            for (k = 4; k >= si; k--){
                System.out.print(" ");

            }
            si++;


            for (j = 1; j <= none; j++) {
                System.out.print("*");
            }
            none+=2;
            System.out.println();
        }

        int num=9;
        int limit= 1;
        for (i = 5; i >= 1; i--) {


            for (k = 2; k <= limit; k++){
                System.out.print(" ");

            }
            limit++;


            for (j = 1; j <= num; j++) {
                System.out.print("*");
            }
            num-=2;
            System.out.println();
        }
    }
*/
   public void sixthPatternProgram(){
       int i, j, k,h ;
       int num=1;
       int no=1;


       for (i = 4; i >= 1; i--) {
           int space=i-1;
           for(k =1; k<=space; k++){
               System.out.print(" ");
           }
           for(j=1; j<=num; j++){
               System.out.print(j);
           }
           for(h=2; h<=no; h++){
               System.out.print(h);
           }
           num+=1;
           no+=1;

           System.out.println();
       }

   }

}

