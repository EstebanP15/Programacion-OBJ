import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("resultado SumaDosNumeros: " + (sumarDosNumeros(2, 5)));
        System.out.println("resultado MayorDeTresNumeros : " + (mayorDeTresNumeros(3, 5, 7)));
        System.out.println("resultado TablaDeMultiplicar: " + Arrays.toString(tablaMultiplicar(3, 5)));
        System.out.println("resultado Factorial: " + (factorial(5)));
        System.out.println("resultado NumeroPrimo: " + (esPrimo(3)));
        System.out.println("resultado TablaDeMultiplicar: " + Arrays.toString(tablaMultiplicar(3, 5)));
        System.out.println("resultado SerieDeFibonacci: " + Arrays.toString(serieFibonacci(9)));
        System.out.println("resultado SumaDeElementos: " + (sumaElementos(new int[]{2, 4, 6, 8})));
        System.out.println("resultado PromedioDeElementos: " + (promedioElementos(new double[]{2, 4, 6.8, 8.5})));
        System.out.println("resultado MayorDeElementos: " + (encontrarElementoMayor(new int[]{2, 4, 9, 14})));
        System.out.println("resultado MenorDeElementos: " + (encontrarElementoMenor(new int[]{22, 7, 12, 8})));
        System.out.println("resultado Elemento: " + (buscarElemento(new int[]{22, 7, 12, 8}, 9)));
        System.out.println("resultado InvertirArreglo: " + Arrays.toString(invertirArreglo(new int[]{1, 2, 3, 4})));
        System.out.println("resultado OrdenarArreglo: " + Arrays.toString(ordenarArreglo(new int[]{4, 3, 2, 1})));
        System.out.println("resultado EliminarDuplicados: " + Arrays.toString(eliminarDuplicados(new int[]{4, 3, 4, 1, 2, 1, 5})));
        System.out.println("resultado RotarArreglos: " + Arrays.toString(rotarArreglo(new int[]{4, 3, 4, 1, 2},3)));
        System.out.println("resultado ContarCadena: " + (contarCaracteres("Hello")));
        System.out.println("resultado InvertirCadena: " + (invertirCadena("Hello")));
        System.out.println("resultado Palindromo: " + (esPalindromo("anilina")));
        System.out.println("resultado ContarPalabras: " + (contarPalabras("Este es un test")));
        System.out.println("resultado ConvertirAMayusculas: " + (convertirAMayusculas("hello")));
        System.out.println("resultado ConvertirAMinusculas: " + (convertirAMinusculas("HELLO")));
        System.out.println("resultado BuscarSubcadena: " + (buscarSubcadena("Hello world","world")));




    }

    public static int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.

        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a + b;
    }

    public static int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.

        int numeroMayor = a;

        if (b > numeroMayor) {
            numeroMayor = b;
        }

        if (c > numeroMayor) {
            numeroMayor = c;
        }

        return numeroMayor;
    }

    public static int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].

        int[] tabla = new int[limite];

        for (int i = 1; i <= limite; i++) {
            tabla[i - 1] = numero * i;
        }

        return tabla;
    }

    public static int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.

        int factorial = 1;

        if (n < 0) {
            throw new IllegalArgumentException("must be positive values.");
        }

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
        if (n < 0) {
            throw new IllegalArgumentException("must be positive values.");
        }
        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci[i] = 0;
            } else if (i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }

    public static int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    public static double promedioElementos(double[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        double promedio = 0;

        for (int i = 0; i < arreglo.length; i++) {
            promedio += arreglo[i];
        }
        return promedio;
    }

    public static int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    public static int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    public static boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public static int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        while (izquierda < derecha) {
            int mayor = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = mayor;
            izquierda++;
            derecha--;
        }
        return arreglo;
    }

    public static int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        int derecha = 0;
        int izquierda = arreglo.length - 1;
        while (derecha < izquierda) {
            int mayor = arreglo[derecha];
            arreglo[derecha] = arreglo[izquierda];
            arreglo[izquierda] = mayor;
            izquierda--;
            derecha++;
        }
        return arreglo;
    }

    public static int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        int[]temp = new int[arreglo.length];
        int num = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < num; j++) {
                if (arreglo[i] == temp[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado){
                temp[num++] = arreglo[i];
        }
        }
        int[] resultado = new int[num];
        System.arraycopy(temp, 0, resultado, 0, num);
        return resultado;
    }
    public static int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        int [] combinados = new int[arreglo1.length + arreglo2.length];
        for (int i = 0; i < arreglo1.length; i++) {
            combinados[i] = arreglo1[i];
        }
        for (int i = 0; i < arreglo2.length; i++) {
            combinados[arreglo1.length + i] = arreglo2[i];
        }
        return eliminarDuplicados(combinados);
    }
    public static int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        int n = arreglo.length;
        int[]resultado = new int[n];
        posiciones = posiciones % n;
        for (int i = 0; i < n; i++) {
            int nuevoIndice = (i + n - posiciones) % n;
            resultado[nuevoIndice] = arreglo[i];
        }
        return resultado;
    }
    public static int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        if(cadena == null){
            return 0;
        }
        return cadena.length();
    }
    public static String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        if (cadena == null) {
        return null;
        }
        char[] arreglo = cadena.toCharArray();
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while(izquierda < derecha) {
            char temp = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = temp;
            izquierda++;
            derecha--;
        }
        return new String(arreglo);
    }
    public static boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        cadena = cadena.replaceAll("\\s+","").toLowerCase();

        int izquierda = 0;
        int derecha = cadena.length() - 1;

        while(izquierda < derecha) {
          if(cadena.charAt(izquierda) != cadena.charAt(derecha)) {
            return false;
          }
            izquierda++;
            derecha--;
        }
        return true;
    }
    public static int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }
    public static String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        if (cadena == null) {
            return "";
        }
        return cadena.toUpperCase();
    }
    public static String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        if (cadena == null) {
            return "";
        }
        return cadena.toLowerCase();
    }
    public static int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        if (cadena == null || subcadena == null) {
            return -1;
        }
        return cadena.indexOf(subcadena);
    }
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        if (correo == null) {
            return false;
        }
        Stri
    }
    



}











