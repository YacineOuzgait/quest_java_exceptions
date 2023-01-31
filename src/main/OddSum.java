import java.util.ArrayList;

import exception.StringException;


public class OddSum {

    public static void main(String[] args) {
        run(args, false);
    }

    public static int run(String[] args, boolean test) {

        ArrayList<Integer> listInt = new ArrayList<>(); 
        int res;

        try{
            if (!test) {
                System.out.println("Elements' list :");
                for (String v : args)
                    System.out.print(" " + v);
                System.out.println();
            }
            for (int i = 0; i < args.length; i++) {
                listInt.add(Integer.parseInt(args[i]));
            }
    
        } catch(StringException s){
            System.err.println("Pas de chaine de caractère svp !");
        }
        finally {
            res = sum(listInt);
            if (test) {
                return res;
            }
    
            System.out.println("Sum of odd elements : " + res);
            System.out.println("END!");
         }

            return 0;
    }

    public static int sum(ArrayList<Integer> listInt) {

        int result = 0;
        for (int value : listInt) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        return result;
    }
}
