public class Main {
    public static void main(String[] args) {

        int a = 7;
        while (a<37) {
            a = a + 3;
            System.out.print("1 example: ");
            System.out.println(a);
        }



        int b = 1000;
        while (b>900) {
            b = b - 2;
            System.out.print("2 example: ");
            System.out.println(b);
        }



        int c = -1;
        int count1 = 0;
        while (count1 < 20) {
            if (c == -1)
            {
                c = 1;
                System.out.print("3 example: ");
                System.out.println(c);
            }
            else {
                c = - 1;
                System.out.print("3 example: ");
                System.out.println(c);
            }
            count1 = count1 + 1;
        }



        int d = 9;
        int count2 = 0;
        while (count2 < 60) {
            if (d == 9)
            {
                d = 7;
                System.out.print("4 example: ");
                System.out.println(d);
                System.out.print("4 example: ");
                System.out.println(d);
            }
            else {
                d = 9;
                System.out.print("4 example: ");
                System.out.println(d);
            }
            count2 = count2 + 1;
        }
    }
}