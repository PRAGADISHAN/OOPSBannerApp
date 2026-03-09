public class UC4 {
    public static void main(String[] args) {

        String[] O = {
                "  **** ",
                " **  **",
                " **  **",
                " **  **",
                "  **** "
        };

        String[] P = {
                " ***** ",
                " **  **",
                " ***** ",
                " **    ",
                " **    "
        };

        String[] S = {
                " ***** ",
                " **    ",
                " ***** ",
                "    ** ",
                " ***** "
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}