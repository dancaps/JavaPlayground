public class LoopingFun {
    public static void main(String[] args){
        int i = 0;
        int p = 25;

        while (i < 20){
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("This runs no matter what you input for i: " + p);
            p++;
        } while (p <= 50);


        for (int k = 1; k < 50; k++ ){
            System.out.println(k);
        }
    }
}
