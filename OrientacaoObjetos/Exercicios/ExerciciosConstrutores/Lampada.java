package OrientacaoObjetos.Exercicios.ExerciciosConstrutores;

// 2. Escreva um construtor para a classe
// Lampada de forma que instâncias desta 
// só possam ser criadas se um estado inicial 
// for passado para o construtor. Esse estado 
// pode ser o valor booleano que indica se a 
// lâmpada está acesa (true) ou apagada (false).
public class Lampada {
    private boolean acesa;

    public Lampada(boolean estadoInicial) {
        this.acesa = estadoInicial;
    }
}