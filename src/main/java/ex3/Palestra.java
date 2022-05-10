package ex3;

import java.util.ArrayList;

public class Palestra {
    private String titulo, palestrante, local, data, horario;
    private ArrayList<Participante> participantes;
    private int duracao, inscritos;
    private static final int MAXPARTICIPANTES = 40;
    
    public Palestra (String titulo, String palestrante, String local, String data, String horario, int duracao) {
        this.titulo = titulo;
        this.palestrante = palestrante;
        this.local = local;
        this.data = data;
        this.horario = horario;
        this.duracao = duracao;
        this.inscritos = 0;
        this.participantes = new ArrayList<Participante>();
    }
    
    public Palestra (String titulo){
        this.titulo = titulo;
        this.inscritos = 0;
        this.participantes = new ArrayList<Participante>();
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public void setPalestrante (String palestrante) {
        this.palestrante = palestrante;
    }
    
    public void setLocal (String local) {
        this.local = local;
    }
    
    public void setData (String data) {
        this.data = data;
    }
    
    public void setHorario (String hora) {
        this.horario = hora;
    }
    
    public void setDuracao (int duracao) {
        this.duracao = duracao;
    }
    
    public boolean setInscritos() {
        this.inscritos++;
        return (this.inscritos < MAXPARTICIPANTES);
    }
    
    public void addParticipantePalestra(Participante participante) {
        this.inscritos++;
        this.participantes.add(participante);
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getPalestrante() {
        return this.palestrante;
    }
    
    public String getLocal() {
        return this.local;
    }
    
    public String getData() {
        return this.data;
    }
    
    public String getHorario () {
        return this.horario;
    }
    
    public int getDuracao() {
        return this.duracao;
    }
    
    public int getInscritos() {
        return this.inscritos;
    }
    
    public static int getMAX() {
        return MAXPARTICIPANTES;
    }
    
    public Participante getParticipante (int i) {
        return this.participantes.get(i);
    }
}
