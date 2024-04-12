import java.util.List;

public class GerenciadorMusica {
    private List<Musica> musicas;

    public GerenciadorMusica(List<Musica> musicas) {
        this.musicas = musicas;
    }
    public void addMusica(Musica musica){
         musicas.add(musica);   
    }
    public void removeMusica(String nome){
        if(buscar(nome))
            musicas.remove(nome);
    }
    public void salvarNoArquivo(String caminhoDoArquivo) {
        
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        
    }
}
