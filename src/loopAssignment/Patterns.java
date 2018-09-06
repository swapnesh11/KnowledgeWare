package loopAssignment;

public class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.firstPatternProgram();
    }
    public void firstPatternProgram(){
        for(int i=1; i<=3; i++){
            for(int j=1; j<=i; j++){
                System.out.println(j);
            }
            System.out.println();
        }
    }
}

