package OrientacaoObjetos.Exercicios.ExerciciosConstrutores;

// 1. Escreva um construtor para a classe Data que 
// receba os valores correspondentes ao dia, mês e ano, e 
// inicialize os campos da classe, verificando antes se a data é válida.

    public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida!");
        }
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (ano < 0 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int ultimoDiaDoMes = 31; // Consideramos o máximo de 31 dias por padrão

        // Verifica o último dia do mês
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                ultimoDiaDoMes = 29; // Ano bissexto
            } else {
                ultimoDiaDoMes = 28;
            }
        }

        return dia <= ultimoDiaDoMes;
    }
}