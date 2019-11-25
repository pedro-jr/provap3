
public class BubbleSort {
	int[] array;
	
	public void convert(String num) {
		String[] temp = num.split(",");
		int[] temp2 = new int[temp.length];
		for(int i = 0; i < temp.length; i++) {
			temp2[i] = Integer.parseInt(temp[i]);
		}
		array = temp2;
	}
	
	public void bubbleSort(int[] array) {
		
		for(int i = 0; i< array.length-1; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] < array[j + 1]) {
					int aux = j;
					array[j]= array[j+1];
					array[j+1]= array[aux];
				}
			}
		}
	}
}
