package OrientacaoObjetos.Exercicios.ExerciciosObjetos;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    Livro livro1 = new Livro("Mil beijos de garoto", "Tillie Collie", 2016);
}
