public class MergeSort {
    public static void mergesort(int[] array) {
        int[] helper = new int[array.length];
        mergesort(array, helper, 0, array.length - 1);
    }

    public static void mergesort(int[] array, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(array, helper, low, middle); // Ordenar la mita de la izquierda
            mergesort(array, helper, middle+1, high); //  Ordenar la mita de la derecha
            merge(array, helper, low, middle, high); // Unirlos
        }
    }

    public static void merge(int[] array, int[] helper, int low, int middle, int high) {
		/* Copiar las dos mitades en un Array helper */
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

	/* Iterar sobre el array helper. Comparar el primer elemento de la derecha 
	con el de la izquierda, copiar el elemento más pequeño en el array original*/
        while(helperLeft<=middle && helperRight <= high) {
            if(helper[helperLeft]<=helper[helperRight])
            {
                array[current] = helper[helperLeft];
                helperLeft++;
            }
            else
            {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
	/* Copiar el resto del lado izquierdo del Arrat dentro del target array */
        /* Solo copiamos el lado izquierdo ya que el derecho no lo necesita, ya "está ahí"*/
        int remaining = middle - helperLeft;
        for(int i = 0 ;i<remaining;i++)
            array[current+i] = helper[helperLeft+i];
    }
 }
