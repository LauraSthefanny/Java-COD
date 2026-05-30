import java.util.Scanner;

public class EmpresaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa p = new Empresa();

        System.out.println("Digite o nome da empresa: ");
        p.Nome = sc.nextLine();
        
        System.out.println("Digite a localização da empresa: ");
        p.Localizacao = sc.nextLine();

        System.out.println("Digite o CNPJ da sua empresa: ");
        p.CNPJ = sc.nextLine();

        System.out.println("Digite o horário de funcionamento da sua empresa: ");
        p.horario = sc.nextLine();

        p.imprimirEmpresa(); 
    }
}
