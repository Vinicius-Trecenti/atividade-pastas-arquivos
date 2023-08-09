import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        String nomesPastas[] = {"100", "1000", "10000", "50000", "100000"};

        Arquivos arq = new Arquivos();

        GeradorPastas geradorPastas = new GeradorPastas();

        File caminhoAtual = new File("");

        for(String nomes : nomesPastas){
            String caminhoCriacaoPasta = geradorPastas.gerarpastas(caminhoAtual.getAbsolutePath(), nomes);

            int valorPasta = Integer.parseInt(nomes);
            int MenorValor = 0;
            int MaiorValor = valorPasta;

            for(int i=1; i<=10; i++){

                arq.write(caminhoCriacaoPasta + "\\arq" + i + ".txt", MaiorValor, MenorValor);

                MaiorValor += valorPasta;
                MenorValor += valorPasta;   
            }


        }


    }
}
