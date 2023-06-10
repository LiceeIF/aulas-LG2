package OrientacaoObjetos.Exercicios.ExerciciosMetodos;

public class Conta {
    public static double sacar(double saldo, double valor, double saque){
        if(valor>saldo){
           throw new IllegalArgumentException("valor indisponivel para saque");
        }
        saque = saldo - valor;
        return saque;
    }
}
