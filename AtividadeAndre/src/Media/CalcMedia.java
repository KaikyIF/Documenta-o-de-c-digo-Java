package Media;

/**
 * Classe para objetos Aluno, onde serao contidos valores e metodos para
 * calcular a media e verificar a aprovacao do mesmo.
 *
 * @author Kaiky
 * @since 11-12-2024 15:30
 */
import java.util.Scanner;

public class CalcMedia {

    /**
     * Metodo para calcular a média aritmética de quatro notas de um aluno.
     *
     * @param nota1 Primeira nota do aluno.
     * @param nota2 Segunda nota do aluno.
     * @param nota3 Terceira nota do aluno.
     * @param nota4 Quarta nota do aluno.
     * @return Double A média aritmética das quatro notas.
     * @throws IllegalArgumentException Se alguma nota estiver fora do intervalo de 0 a 10.
     */
    public double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        validarNota(nota1);
        validarNota(nota2);
        validarNota(nota3);
        validarNota(nota4);

        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    /**
     * Metodo para verificar se o aluno foi aprovado
     *
     * @param media Double A média do aluno.
     * @return boolean {@code true} se o aluno foi aprovado; {@code false} caso contrário.
     */
    public boolean verificarAprovacao(double media) {
        return media >= 6.0;
    }

    /**
     * Metodo para validar se uma nota está no intervalo permitido
     *
     * @param nota Double A nota a ser validada.
     * @throws IllegalArgumentException Se a nota estiver fora do intervalo permitido.
     */
    private void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
    }

    /**
     * Metodo principal onde o aluno coloca sua nota
     *
     * @param args Argumentos de linha de comando.
     */
    public static void main(String[] args) {
        CalcMedia aluno = new CalcMedia();
        Scanner scanner = new Scanner(System.in);

        // Solicitar as notas do aluno
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Cálculo da média e verificação de aprovação
        double media = aluno.calcularMedia(nota1, nota2, nota3, nota4);
        boolean aprovado = aluno.verificarAprovacao(media);

        System.out.println("Média: " + media);
        System.out.println(aprovado ? "Aluno aprovado." : "Aluno reprovado.");

        scanner.close();
    }
}
