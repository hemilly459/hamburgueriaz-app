public class MainActivity {

    public static void main(String[] args) {

        String cliente = "Hemilly";
        int quantidade = 2;
        boolean queijoExtra = true;
        boolean bacon = false;

        double precoHamburguer = 25.00;
        double total = precoHamburguer * quantidade;

        if (queijoExtra) {
            total += 5.00;
        }

        if (bacon) {
            total += 6.00;
        }

        System.out.println("HamburgueriaZ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + total);
    }
}
