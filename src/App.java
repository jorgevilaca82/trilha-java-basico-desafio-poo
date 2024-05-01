public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();
        // Reprodutor musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        // Aparelho telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();
        
        // Navegador na internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
