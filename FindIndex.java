class FindIndex{
	public static void checkIndex(int[] arr, int tgtElmt){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == tgtElmt){
				System.out.println(tgtElmt+" found in index "+i);
			}
		}
	}
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 4};
		int targetElement = 4;
		checkIndex(arr, targetElement);
	}
  }
