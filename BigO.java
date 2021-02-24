	//O(n)
	public void sum(int[] array) {
		int sum=0;
		int product=0;
		for(int i =0; i<array.length; i++ ) {
			sum += array[i];
		}		
		for(int i =0; i<array.length; i++ ) {
			product *=array[i];
		}
	}
	//O(1)
	public void print(int[] array) {
			System.out.println(array[0]);
	}

	//O(n^2)
	public void printDoble(int arrayA[]) {
		for(int i =0; i<arrayA.length; i++ ) {
			for(int j =i+1; j<arrayA.length; j++ ) {
				System.out.println(arrayA[i]+ ","+ arrayA[j]);
			}
		}
	}
		System.out.println(array[0]);
}
