/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Victor
 */
public class Livro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private String genero;

    public Livro() {
        this.titulo = "";
        this.autor = new Autor();
        this.paginas = 0;
        this.genero = "";
    }

    public Livro(String titulo, Autor autor, int paginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    

    @Override
    public String toString() {
        return "Nome:"+this.titulo+"/"+"Genero:"+this.genero;
    }
    
    
    
    
}
