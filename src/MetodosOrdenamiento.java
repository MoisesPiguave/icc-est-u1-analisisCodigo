import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:el metodo retorna un arreglo de enteros vacio
    // Solucion: Cambiar el return para que regrese la variable "arreglo"
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: la condicion del arreglo, arregla de manera descendente
    // Solucion: cambiar signo en la compracion linea 35

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Esta es la version mejorada del metodo de burbuja
    //Solucion: Cambiar la condicion en el primer for , en el if y el intercambio del elemento y en el segundo
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n ; i++) {
            for (int j =i+ 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j ];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: El metodo esta diseñado para devolver un return , el metodo no devuelve ,ademas que ordena de manera descendente 
    // SOlucion: Agregar el return y lo que nos devuelve , ademas de el signo en la comparacion 
    public int[] seleccionPrimero(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMax = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMax]) {
                    indiceMax = j;
                }
            }
            int smallerNumber = arreglo[indiceMax];
            arreglo[indiceMax] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;

    }

    // Método de selección con errores
    // Error encontrado:el avanze del j no es -- 
    //Solucion:Cambiar por ++
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length-1; i++) {
            int indiceMax = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMax]) {
                    indiceMax = j;
                }
            }

            int smallerNumber = arreglo[indiceMax];
            arreglo[indiceMax] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:El en el cambio de posicion y en el signo del if
    // solucion: cambiar i , por el indiceMax
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMax = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMax]) {
                    indiceMax = j;
                }
            }

            int smallerNumber = arreglo[indiceMax];
            arreglo[indiceMax] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: en el while en el i y la comparacion con el key
    //Solucion: cambiar por i por mayor igual
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: en el segundo for cusamos la posicion en j
    // cambiar todo el segundo for de las j por i 
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            for (; i >= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: no iguala a cero , key y el i ++ y retorno
    //Solucion: agregar el mayor igual a cero, cambio en el signo del key, el -- y retornar el arreglo
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >=0  && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
