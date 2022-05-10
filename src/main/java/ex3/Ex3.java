package ex3;

import java.util.Scanner;

public class Ex3 {
    public static void menu() {
        System.out.println("\nSELECIONE UMA OPCAO:");
        System.out.println("0 - INSCREVER PARTICIPANTE NAS PALESTRAS");
        System.out.println("1 - CONSULTAR VAGAS DISPONIVEIS NAS PALESTRAS");
        System.out.println("2 - CONSULTAR PALESTRAS QUE O PARTICIPANTE SE INSCREVEU");
        System.out.println("3 - EXIBIR DADOS DE UMA PALESTRA");
        System.out.println("4 - FECHAR SISTEMA");
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INSCREVER PALESTRAS:");
        System.out.print("Digite o titulo da nova palestra ou 'xxx' para fechar a inscricao: ");
        String texto = teclado.nextLine();
        while (!texto.equals("xxx")) {
            if (Evento.palestrasLivres()) {
                Palestra palestra = new Palestra(texto);
                System.out.print("Insira o nome do palestrante: ");
                palestra.setPalestrante(teclado.nextLine());
                System.out.print("Insira o local: ");
                palestra.setLocal(teclado.nextLine());
                System.out.print("Insira a data: ");
                palestra.setData(teclado.next());
                System.out.print("Insira o horario: ");
                palestra.setHorario(teclado.next());
                System.out.print("Insira a duracao: ");
                palestra.setDuracao(teclado.nextInt());
                Evento.addPalestra(palestra);
                teclado.nextLine();
                System.out.print("\nDigite o titulo da nova palestra ou 'xxx' para fechar a inscricao: ");
                texto = teclado.nextLine();
            } else {
                System.out.println("\nO EVENTO NAO ACEITA NOVAS PALESTRAS");
                texto = "xxx";
            }
        }
        System.out.println("\nINSCREVER PARTICIPANTES:");
        System.out.print("Digite o nome do novo participante ou 'xxx' para fechar a inscricao: ");
        texto = teclado.nextLine();
        while (!texto.equals("xxx")) {
            Participante participante = new Participante(texto);
            System.out.printf("Insira o email de %s: ", participante.getNome());
            participante.setEmail(teclado.next());
            System.out.printf("Insira a matricula de %s: ", participante.getNome());
            participante.setMatricula(teclado.nextInt());
            Inscricao.addParticipante(participante);
            System.out.print("\nDigite o nome do novo participante ou 'xxx' para fechar a inscricao: ");
            teclado.nextLine();
            texto = teclado.nextLine();
        }
        System.out.println("\nINSCRICOES REALIZADAS!");
        Evento.imprimirPalestras();
        Inscricao.imprimirParticipantes();
        int mat, op, pales;
        do {
            menu();
            op = teclado.nextInt();
            switch(op){
                case 0 -> {
                    System.out.print("\nDIGITE A MATRICULA DO PARTICIPANTE: ");
                    mat = teclado.nextInt();
                    System.out.print("DIGITE O NUMERO DA PALESTRA: ");
                    pales = teclado.nextInt();
                    Inscricao.inscreverParticipante(mat, pales);
                }
                case 1 -> Evento.imprimirVagas();
                case 2 -> {
                    System.out.print("DIGITE A MATRICULA DO PARTICIPANTE: ");
                    Evento.imprimirPalestrasParticipantes(teclado.nextInt());
                }
                case 3 -> {
                    System.out.print("DIGITE O NUMERO DA PALESTRA: ");
                    pales = teclado.nextInt();
                    Evento.imprimirPalestraEsp((pales-1), true);
                }
            }
        } while (op != 4);
    }
}
