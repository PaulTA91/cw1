class Dec2Hex {

    public static int Arg1;

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.print("No input detected. Try Again.\n");
                return;
            }
        } catch (NumberFormatException e) {
        }

        if (validateInput(args[0]) == true) {
            convertInput(args[0]);
        }


    }

    public static boolean validateInput(String args) {
        boolean valid;
        try {
            Arg1 = Integer.parseInt(args);
            valid = true;
            if (Arg1 <= 0) {
                System.out.println("Value must be a positive Int");
            }
        } catch (NumberFormatException e) {
            valid = false;
        }
        return valid;
    }


    public static void convertInput(String arg) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
        System.out.println("Ending Program");
    }

}
