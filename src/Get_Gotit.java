public class Get_Gotit {
    public static void main(String args[]) {

        for (int j = 1;j <= 100;j++) {

            //System.out.println(j);
            if (j % 3 == 0) {
                System.out.println ("Get it");
            }
                //System.out.println(j);

             if (j % 5 == 0)
             {
                System.out.println("Got it");
            }
            if (j % 10 == 0) {
                System.out.println ("Good");}
            else if (j%3!=0 && j%5!=0 && j % 10 != 0){
             System.out.println(j);

        }
    }}}


