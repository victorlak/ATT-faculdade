import java.io.*;
import java.util.Scanner;

public class File {
    
    public void salvarArquivo(String texto, String path) throws IOException {
        FileWriter arq = new FileWriter(path);
        PrintWriter gravado = new PrintWriter(arq);

        gravado.print(texto);
        arq.close();
    }
    public String carregarArquivo(String path) throws FileNotFoundException {
        FileReader f = new FileReader(path);
        Scanner leitor = new Scanner(f);
        leitor.useDelimiter("\\Z");
        String texto = leitor.next();
        while(leitor.hasNext()){
            texto += leitor.next();
        }
        return texto;
    }
}
