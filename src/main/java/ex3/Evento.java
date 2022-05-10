package ex3;

import java.util.ArrayList;

public class Evento {
    private String dataIni, dataFim, horaIni, horaFim;
    private static int palestrasInscritas = 0;
    private static final int MAXPALESTRAS = 20;
    private static ArrayList<Palestra> palestrasLista = new ArrayList<Palestra>();
    
    public Evento (String dataIni, String dataFim, String horaIni, String horaFim) {
        this.dataIni = dataIni;
        this.dataFim = dataFim;
        this.horaIni = horaIni;
        this.horaFim = horaFim;
    }
    
    public Evento() {
        //evento vazio
    }
        
    public static void addPalestra(Palestra palestra) {
        palestrasLista.add(palestra);
        palestrasInscritas++;
    }
    
    public static boolean palestrasLivres() {
        return (palestrasInscritas < MAXPALESTRAS);
    }
    
    public static int getPalestrasInscritas() {
        return palestrasInscritas;
    }
    
    public static boolean vagasPalestra(int i) {
        return (palestrasLista.get(i).getInscritos() < Palestra.getMAX());
    }
    
    public static Palestra getPalestra(int i) {
        return palestrasLista.get(i);
    }
    
    public static int getMatricula(int i, int j) {
        return getPalestra(i).getParticipante(j).getMatricula();
    }
    
    public static void imprimirPalestras() {
        System.out.println("\n--PALESTRAS--");
        for (int i=0; i<palestrasLista.size(); i++) {
            System.out.printf("\nPALESTRA "+(i+1));
            System.out.printf("\nTITULO: %s\n",palestrasLista.get(i).getTitulo());
            System.out.printf("PALESTRANTE: %s\n",palestrasLista.get(i).getPalestrante());
            System.out.printf("LOCAL: %s\n",palestrasLista.get(i).getLocal());
            System.out.printf("HORARIO: %s\n",palestrasLista.get(i).getHorario());
            System.out.printf("DURACAO: %s minutos\n",palestrasLista.get(i).getDuracao());
            System.out.printf("VAGAS DISPONIVEIS: %s\n",(Palestra.getMAX()-palestrasLista.get(i).getInscritos()));
        }
    }
    
    public static void imprimirVagas() {
        System.out.println("\n--VAGAS DISPONIVEIS--");
        for (int i=0; i<palestrasLista.size(); i++) {
            System.out.println("\nPALESTRA "+(i+1));
            System.out.printf("VAGAS DISPONIVEIS: %d\n",(Palestra.getMAX() - palestrasLista.get(i).getInscritos()));
        }
    }
    
    public static void imprimirPalestraEsp(int i, boolean ch) {
        System.out.printf("\nTITULO: %s\n",palestrasLista.get(i).getTitulo());
        System.out.printf("PALESTRANTE: %s\n",palestrasLista.get(i).getPalestrante());
        System.out.printf("LOCAL: %s\n",palestrasLista.get(i).getLocal());
        System.out.printf("HORARIO: %s\n",palestrasLista.get(i).getHorario());
        System.out.printf("DURACAO: %s minutos\n",palestrasLista.get(i).getDuracao());
        System.out.printf("VAGAS DISPONIVEIS: %s\n",(Palestra.getMAX()-palestrasLista.get(i).getInscritos()));
        if (ch) { //Será true quando escolherem a opção 3
            System.out.print("INSCRITOS: ");
            for (int j=0; j<palestrasLista.get(i).getInscritos(); j++) {
                System.out.printf("%s / ", palestrasLista.get(i).getParticipante(j).getNome());
            }
            System.out.println("");
        }
    }
    
    public static void imprimirPalestrasParticipantes(int mat) {
        System.out.printf("--INSCRICOES DE %d--", mat);
        int i, j;
        for (i=0; i<palestrasLista.size(); i++) {
            for (j=0; j<getPalestra(i).getInscritos(); j++) {
                if (getMatricula(i, j) == mat) imprimirPalestraEsp(i, false);
            }
        }
    }
}