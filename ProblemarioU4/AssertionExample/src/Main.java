public class Main {
    public static void main(String[] args) {
        int valor = 12;

        assert (valor >= 20 && valor <= 60) : "El valor debe estar entre 20 y 60 ";
        System.out.println("Valor válido: " + valor);

    }
}
