
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Executando método 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Executando método 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Executando método 'atualizarPagina'");
    }

    @Override
    public void ligar() {
        System.out.println("Executando método 'ligar'");
    }

    @Override
    public void atender() {
        System.out.println("Executando método 'atender'");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Executando método 'iniciarCorrerioVoz'");
    }

    @Override
    public void tocar() {
        System.out.println("Executando método 'tocar'");
    }

    @Override
    public void pausar() {
        System.out.println("Executando método 'pausar'");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Executando método 'selecionarMusica'");
    }

}
