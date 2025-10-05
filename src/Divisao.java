public class Divisao {
    public static int dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Não pode dividir por zero");
        return a / b;
    }
}
