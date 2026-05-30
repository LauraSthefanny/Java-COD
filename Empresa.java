public class Empresa {
    public String Nome;
    public String Localizacao;
    public String CNPJ;
    public String horario;

    public void imprimirEmpresa() {
        System.out.println("Nome da empresa: " + Nome);
        System.out.println("Localização da empresa: " + Localizacao);
        System.out.println("CNPJ da empresa: " + CNPJ);
        System.out.println("Horário de funcionamento: " + horario);
    }
}
