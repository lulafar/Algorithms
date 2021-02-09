public static int linearSearch(int[] arrayToSearch, int element) {
    int elementPos = -1;
    for (int i = 0 ; i < arrayToSearch.length ; i++) {
            if (arrayToSearch[i] == element) {
                return i;
            }
        }
 
        return elementPos;
    }
}
