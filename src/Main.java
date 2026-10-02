import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void menu(){
        System.out.println("Oficina mecânica");
        System.out.println("1- Abrir nova ordem de serviço");
        System.out.println("2- Adicionar item em um serviço");
        System.out.println("3- Iniciar atendimento de um serviço");
        System.out.println("4- Finalizar serviço e gerar valor final");
        System.out.println("5- Listar ordem de serviços");
        System.out.println("0- Sair");
        System.out.println("Selecione opção: ");
    }

    public static void AdicioanrServico(Scanner scanner, List<OrdemServico> ListaOrdem){
        System.out.println("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Id do cliente: ");
        int id = scanner.nextInt();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data prevista para termino do serviço: ");
        String data = scanner.nextLine();

        LocalDate previsao = LocalDate.parse(data, formato);

        OrdemServico Servico = new OrdemServico(nome, id, previsao);
        ListaOrdem.add(Servico);

        System.out.println("Serviço de " + id + " Confirmado");
    }

    public static OrdemServico BuscarId(int id, List<OrdemServico> ListaOrdem){
        for(OrdemServico Servico : ListaOrdem){
            if(Servico.getId() == id){
                return Servico;
            }
        }
        return null;
    }
    public static OrdemServico BuscarNome(String nome, List<OrdemServico> ListaOrdem){
        for(OrdemServico Servico : ListaOrdem){
            if(Servico.getCliente().equalsIgnoreCase(nome)){
                return Servico;
            }
        }
        return null;
    }
    public static void IniciarAtendimento(Scanner scanner, List<OrdemServico> ListaOrdem){
        System.out.println()
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<OrdemServico> ListaOrdem = new ArrayList<>();
        int opcao;

        while(true){
            menu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    AdicioanrServico(scanner, ListaOrdem);
                    break;
                case 2:


            }
        }
    }
}