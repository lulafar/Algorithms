// Bubble sort en Java

import java.util.Arrays;

class BubbleSort {
  void bubbleSort(int array[]) {
    int size = array.length;
    
    // ejecutar el bucle dos veces, uno para recorrer el array y otro para hacer la comparación
    for (int i = 0; i < size - 1; i++)
      for (int j = 0; j < size - i - 1; j++)

        // Orden ascencente. Para descendente en esta línea cambiar > a <
        if (array[j] > array[j + 1]) {

          // intercambiar posicione
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  // Código de llamada e imprimir en pantalla
  public static void main(String args[]) {
    int[] data = { -2, 45, 0, 11, -9 };
    BubbleSort bs = new BubbleSort();
    bs.bubbleSort(data);
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
