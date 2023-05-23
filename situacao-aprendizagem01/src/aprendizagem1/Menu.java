package aprendizagem1;

import java.util.Scanner;

public class Menu {
	

    private DadosPessoais objDadosPessoais;
    private DadosContato objDadosContato;
    private DadosEndereco objDadosEndereco;

    public void ExibirMenu() {
    Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("ESCOLHA UMA OPÇÃO PELO NÚMERO");
            System.out.println("1 - DADOS PESSOAIS");
            System.out.println("2 - DADOS DE CONTATO");
            System.out.println("3 - DADOS DE ENDEREÇO");
            System.out.println("4 - EXIBIR DADOS CADASTRADOS");
            System.out.println("5 - SAIR DO SISTEMA");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    objDadosPessoais = new DadosPessoais();
                    System.out.println("DIGITE O NOME DO CLIENTE: ");
                    objDadosPessoais.setNome(scanner.next());
                    
                    System.out.println("DIGITE O SOBRENOME DO CLIENTE: ");
                    objDadosPessoais.setsobreNome(scanner.next());
                    
                    System.out.println("DIGITE A DATA DE NASCIMENTO DO CLIENTE: ");
                    objDadosPessoais.setdataNascimento(scanner.next());
                    
                    System.out.println("DIGITE O GÊNERO DO CLIENTE: ");
                    objDadosPessoais.setgenero(scanner.next());
                    break;

                case 2:
                    objDadosContato = new DadosContato();
                    System.out.println("DIGITE O E-MAIL DO CLIENTE: ");
                    objDadosContato.setemail(scanner.next());
                    
                    System.out.println("DIGITE O TELEFONE DO CLIENTE: ");
                    objDadosContato.setTelefone(scanner.next());
                    break;

                case 3:
                    objDadosEndereco = new DadosEndereco();
                    System.out.println("DIGITE O CEP DO CLIENTE: ");
                    objDadosEndereco.setcep(scanner.next());
                    System.out.println("DIGITE O LOGRADOURO DO CLIENTE: ");
                    objDadosEndereco.setlogradouro(scanner.next());
                    break;
                    
                case 4:
                    System.out.println("EXIBIR DADOS: ");
                    
                    //DADOS PESSOAIS
                    System.out.println("NOME:" + objDadosPessoais.getNome());
                    System.out.println("SOBRENOME:" + objDadosPessoais.getsobreNome());
                    System.out.println("DATA DE NASCIMENTO:" + objDadosPessoais.getdataNascimento());
                    System.out.println("GÊNERO:" + objDadosPessoais.getgenero());
                    
                    //DADOS DE CONTATO
                    System.out.println("TELEFONE:" + objDadosContato.getTelefone());
                    System.out.println("EMAIL:" + objDadosContato.getEmail());
                    
                    //DADOS DE ENDEREÇO
                    System.out.println("CEP:" + objDadosEndereco.getcep());
                    System.out.println("LOGRADOURO:" + objDadosEndereco.getlogradouro());
                    System.out.println("NÚMERO:" + objDadosEndereco.getnumero());
                    System.out.println("BAIRRO:" + objDadosEndereco.getbairro());
                    System.out.println("CIDADE:" + objDadosEndereco.getcidade());
                    System.out.println("ESTADO:" + objDadosEndereco.getEstado());
                    break;

			
		default:
			System.out.println("OPÇÃO INVÁLIDA!");
			break;
		} //FIM DO SWITCH
		
		} //FIM DO WHILE
		
	} //FIM DO MÉTODO EXIBIR MENU
	
} //FIM DA CLASS MENU
