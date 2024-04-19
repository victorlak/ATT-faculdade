import java.util.ArrayList;
import java.util.List;

public class SerializadorMusica {
    public List<Musica> deCSV(String texto){
        String linhas[] = texto.split("\n");
        List<Musica> musicas = new ArrayList<>();
        for (int i = 1; i < linhas.length; i++ ){
            String partes[] = linhas[i].split(";");
            String titulo = partes[0];
            String nome = partes[1];
            int duracao =Integer.parseInt(partes[2]);
            double preco = Double.parseDouble(partes[3]);
            Musica m = new Musica(titulo,nome,duracao,preco);

            musicas.add(m);
        }
        return musicas;
    }
    public String paraCSV(List<Musica> musicas){
        String linha = "titulo;artista;duracao;preco \n";
        for(Musica m : musicas){
            linha+= m.getTitulo()+";";
            linha+= m.getArtista()+";";
            linha+= m.getDuracao()+";";
            linha+= m.getPreco()+"\n";
        }
        return linha;
    }
}
