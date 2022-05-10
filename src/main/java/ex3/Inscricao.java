package ex3;

import java.util.ArrayList;

public class Inscricao {
    private static ArrayList<Participante> participantes = new ArrayList<Participante>();
    private static ArrayList<Palestra> palestras = new ArrayList<Palestra>();
    
    public static void addParticipante(Participante participante) {
        participantes.add(participante);
    }
    
    public static void imprimirParticipantes() {
        System.out.println("\n--PARTICIPANTES--");
        for (Participante participante: participantes) {
            System.out.println("\nNOME: "+participante.getNome());
            System.out.println("EMAIL: "+participante.getEmail());
            System.out.println("MATRICULA: "+participante.getMatricula());
        }
    }
    
    public static void inscreverParticipante(int m, int p) {
        int i;
        for (i=0; participantes.get(i).getMatricula()!=m; i++) {
            //Localizar matricula do participante
        }
        if (Evento.vagasPalestra(p-1)) Evento.getPalestra(p-1).addParticipantePalestra(participantes.get(i)); //A linha é executada, mas nada muda
        else System.out.println("NAO HA MAIS VAGAS DISPONIVEIS NESSA PALESTRA!");
    }
}
