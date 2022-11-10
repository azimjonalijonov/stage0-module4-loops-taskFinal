package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String s ="";
        int c =1;
        boolean k =true;
        for (int i = 1; i <=cathetusLength ; i++) {

            for (int j = 0; j <i; j++) {
               // System.out.println(k);
                 if(k){
                     s+=c;

                 }else {
                     s+=c;
                     s=c+s;

                 }
                k=false;
                c++;


            }

            for (int l = 0; l <=cathetusLength-c ; l++) {
                s=" "+s;

            }
            System.out.println(s);
             s ="";
             c =1;
             k =true;


        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
