import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        Arg1 = validateInput();
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
	System.out.println("Ending Program");

    }

		public static int validateInput() {
		int input = 0;
		boolean valid;
		Scanner sc = new Scanner(System.in);

		do {
			valid = true;
			System.out.println("Please enter a positive integer to convert to hexadecimal: ");

			if (sc.hasNextInt()) {
				input = sc.nextInt();
				sc.nextLine();

				if (input <= 0) {
					System.out.println("Input not recognized. Try again.");
					valid = false;
				}

			} else {
				System.out.println("Input not recognized. Try again.");
				valid = false;
				sc.next();
			}
		} while (!valid);
		return input;
	}
}

