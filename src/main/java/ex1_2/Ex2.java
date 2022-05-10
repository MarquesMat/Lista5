package ex1_2;

public class Ex2 {
    public static void main(String[] args) {
        double m = 8250.0, ft = ConversaoDeUnidadesDeArea.metrosPes(m), mi = ConversaoDeUnidadesDeArea.metrosMilhas(m);
        System.out.println ("AREA DO CAMPO DE FUTEBOL:");
        System.out.printf ("m^2 = %.0f\n", m);
        System.out.printf ("ft^2 = %.2f\n", ft);
        System.out.printf ("acre = %.6f\n", ConversaoDeUnidadesDeArea.milhasAcres(mi));
        System.out.printf ("cm^2 = %.0f\n", m*10000);
    }
}
