public class Arguments {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        int quantite = Integer.parseInt(args[2]);
        double prix = Double.parseDouble(args[1]);

        System.out.println(prix * quantite);

    }

}
