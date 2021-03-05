public class Triangle2 {

    static final int INVALID = 0;
    static final int SCALENE = 1;
    static final int EQUALATERAL = 2;
    static final int ISOCELES = 3;

    public static int classifyTriangle(int a, int b, int c) {

        delay();

        // Sort the sides so that a <= b <= c
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        delay();

        if (a > c) {
            int tmp = a;
            a = c;
            c = tmp;
        }

        delay();

        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }

        delay();

        if (a + b <= c) {
            return INVALID;
        } else if (a == b && b == c) {
            return EQUALATERAL;
        } else if (a == b || b == c) {
            return ISOCELES;
        } else {
            return SCALENE;
        }

    }

    private static void delay() {
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {

        }
    }

}
