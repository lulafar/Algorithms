public static int binarySearch(int[] arrayToSearch, int element) {
   //Primero extremos del grupo
    int lowIndex = 0;
    int highIndex = arrayToSearch.length-1;

    // Se setea un elemento inicial negativo para ser devuelto en caso de no encontrar          el elemento buscadoarray
    int elementPos = -1;

    // Si lowIndex es menor que highIndex, quiere decir que aún hay elementos en el Array
    while (lowIndex <= highIndex) {
        int midIndex = (lowIndex + highIndex) / 2;
        if (element == arrayToSearch[midIndex]) {
            elementPos = midIndex;
            return elementPos;
        } else if (element < arrayToSearch[midIndex]) {
            highIndex = midIndex-1;
        } else {
            lowIndex = midIndex+1;
        }
    }
    return elementPos;
}


