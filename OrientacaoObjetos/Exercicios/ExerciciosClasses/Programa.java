package OrientacaoObjetos.Exercicios.ExerciciosClasses;

import OrientacaoObjetos.Exercicios.ExerciciosConstrutores.Lampada;
import OrientacaoObjetos.Exercicios.ExerciciosObjetos.Livro;

//utilizarei este programa para chamar métodos e usar as classes.

public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.correntista = "Maria Fernanda";
        minhaConta.saldo = 1800.0;

        System.out.println("Saldo atual:" + minhaConta.saldo);

        //utilizando o objeto livro:

        Livro livro1 = new Livro("Mil beijos de garoto", "Tillie Collie", 2016);
        
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());

        //chamando a lampada:
        Lampada lampadaAcesa = new Lampada(true);
        Lampada lampadaApagada = new Lampada(false);

    }
}



