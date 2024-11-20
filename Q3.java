public class Q3 {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("entrez un nombre valide");
            }
        } else {
            System.out.println("entrez un nombre valide");
        }
    }
}
