package OrientacaoObjetos.Exercicios.ExerciciosClasses;

//utilizarei este programa para chamar métodos e usar as classes.

public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.correntista = "Maria Fernanda";
        minhaConta.saldo = 1800.0;

        System.out.println("Saldo atual:" + minhaConta.saldo);
    }
}
