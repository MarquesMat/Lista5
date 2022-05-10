package ex1_2;

public class ConversaoDeUnidadesDeArea {
    static double metrosPes (double m) {
        return (m *= 10.76);
    }
    
    static double pesCent (double ft) {
        return (ft *= 929);
    }
    
    static double milhasAcres (double mi) {
        return (mi *= 640);
    }
    
    static double acresPes (double a) {
        return (a *= 43560);
    }
    
    static double metrosMilhas (double m) {
        return (m *= 0.0000003861022);
    }
}
