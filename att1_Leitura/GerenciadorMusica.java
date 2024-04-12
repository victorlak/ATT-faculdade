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
        SerializadorMusica serializa = new SerializadorMusica();
        String textoSeraSalvo = serializa.paraCSV()

        chama o filePersistence para salvar;
        filePersistence.saveToFile(textoSeraSalvo, "texto.csv");
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        
    }
}
