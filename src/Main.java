public class Main {
    public static void main(String[] args) {
        // Array de primitivos (int) - NO permite null
        int[] numbersPrimitive = new int[3];
        numbersPrimitive[0] = 10;
        numbersPrimitive[1] = 20;
        //  numbersPrimitive[2] = null; // ❌ Error: No se puede asignar null a un tipo primitivo

        // Array de Wrapper Integer - Permite null
        Integer[] numbersWrapper = new Integer[3];
        numbersWrapper[0] = 10;
        numbersWrapper[1] = 20;
        numbersWrapper[2] = null; // ✅ Se permite null porque Integer es un objeto

        // Mostramos los valores de ambos arrays
        System.out.println("Tipo int:");
        for (int num : numbersPrimitive) {
            System.out.println(num);
        }

        System.out.println("Tipo Integer:");
        for (Integer num : numbersWrapper) {
            System.out.println(num);
        }
    }
}