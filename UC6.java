public class UC6 {

    // Static methods for each letter
    static String[] getO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    static String[] getP() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    static String[] getS() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {
        // Array of letters in order
        String[][] letters = {getO(), getO(), getP(), getS()};

        // Loop through each row
        for (int i = 0; i < 5; i++) {
            for (String[] letter : letters) {
                System.out.print(letter[i] + "  "); // Space between letters
            }
            System.out.println();
        }
    }
}