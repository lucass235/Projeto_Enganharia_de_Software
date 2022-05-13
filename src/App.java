import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        LinkedList<Aluno> listaAlunos = new LinkedList<Aluno>();
        LinkedList<Coordenador> listaCoordenador = new LinkedList<Coordenador>();
        LinkedList<Empresa> listaEmpresa = new LinkedList<Empresa>();
        String nome, email, descricao, area;
        int id;
        char opcao = ' ';
        do {
            try {

                menuCadastro();
                opcao = in.next().charAt(0);
                switch (opcao) {
                    case '1':
                        System.out.print("Digite o nome do aluno: ");
                        nome = in.nextLine();
                        System.out.print("Digite o email do aluno: ");
                        email = in.nextLine();
                        System.out.print("Digite o id do aluno: ");
                        id = in.nextInt();
                        listaAlunos.add(new Aluno(id, nome, email));
                        break;
                    case '2':
                        System.out.print("Digite o nome do coordenador: ");
                        nome = in.nextLine();
                        System.out.print("Digite o email do coordenador: ");
                        email = in.nextLine();
                        System.out.print("Digite o id do coordenador: ");
                        id = in.nextInt();
                        System.out.print("Digite a area do coordenador: ");
                        area = in.nextLine();
                        listaCoordenador.add(new Coordenador(id, nome, email, area));
                        break;
                    case '3':
                        System.out.print("Digite o nome da empresa: ");
                        nome = in.nextLine();
                        System.out.print("Digite a descricao da empresa: ");
                        descricao = in.nextLine();
                        System.out.print("Digite o id da empresa: ");
                        id = in.nextInt();
                        listaEmpresa.add(new Empresa(nome, descricao, id));
                        break;
                    case '0':
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());

            }
        } while (opcao != '0');
    }

    public static void menuCadastro() {
        System.out.print(
                "1 - Cadastrar aluno\n2 - Cadastrar Coordenador\n3 - Cadastrar Empresa\n0 - Encerrar\nDigite a opção: ");
    }
}
