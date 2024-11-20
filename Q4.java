public class Q4 {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid number as parameter.");
            }
        } else {
            System.out.println("Please provide the number of rows as a parameter.");
        }
    }
}
