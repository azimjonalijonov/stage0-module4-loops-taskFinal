package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String l ="";
        String l1 ="";
        for (int i = 1; i <=cathetusLength ; i++) {
            for (int j = 1; j <=cathetusLength-i ; j++) {
                l+=" ";

            }
            l="";
            for (int j1 = 1; j1 <=i ; j1++) {
               l1+="*";
            }
            System.out.println(l+l1);
            l1="";
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
