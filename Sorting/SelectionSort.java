// Implementación de la ordenación por selección
class SelectionSort 
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Los límites entre el array ordenado y desordenado se va desplazando a la derecha (el algoritmo ordenado va creciendo en cada iteración)
        for (int i = 0; i < n-1; i++) 
        { 
            // Encontrar el mínimo elemento del array que todavía no está ordenado
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Intercambiar el elemento con valor mínimo por la primera posición del array que todavia no está ordenado 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    // Pintar el Array
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
   
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {64,25,12,22,11}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
} 
