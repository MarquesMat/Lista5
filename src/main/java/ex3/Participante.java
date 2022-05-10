package ex3;

public class Participante {
    private String nome, email;
    private int matricula;
    
    public Participante (String nome, String email,int matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }
    
    public Participante(String nome) {
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
}
