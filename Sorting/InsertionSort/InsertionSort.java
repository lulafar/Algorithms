// Programa Java para implementar Ordenación de Inserción
class InsertionSort { 
    /*Función que implementa el algoritmo
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Mover los elementos que son mayores que el que estamos comparando a una posición más a la derecha de su actual posición */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    /* Función que pinta el array ordenado*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver método
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6 }; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
  
        printArray(arr); 
    } 
}
