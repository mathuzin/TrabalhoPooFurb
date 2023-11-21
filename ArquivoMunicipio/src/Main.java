//Matheus Ohrt Perazzo Leite Galvão e Victor Augusto Fidelis
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public Main() throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\moplgalvao\\Municipio\\municipios2.csv");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader brx = new BufferedReader(reader);
        ArrayList<Municipios> m = new ArrayList<>();


        String linha = brx.readLine();
        String menorCity = null;
        String maiorCity = null;
        int contador = 0;
        int maior = 0;
        int menor = Integer.MAX_VALUE;
        while(linha != null){
            if(contador != 0) {
                String[] textoSeparado = linha.split(";");
                Municipios municipios = new Municipios(textoSeparado[3], textoSeparado[1]);
                m.add(municipios);
                for (Municipios municipios1 : m){
                    if(municipios1.getPopulacao() > maior){
                        maiorCity = municipios1.getCidade();
                        maior = municipios1.getPopulacao();
                    } else if (municipios1.getPopulacao() < menor){
                        menorCity = municipios1.getCidade();
                        menor = municipios1.getPopulacao();
                    }
                }
            }
            contador++;
            linha = brx.readLine();
        }
        System.out.println("Cidade com mais habitantes: ");
        System.out.println("Cidade: " + maiorCity + "\nPopulação: " + maior);
        System.out.println("Cidade com menos habitantes: ");
        System.out.println("Cidade: " + menorCity +  "\nPopilação: " + menor);
}

}