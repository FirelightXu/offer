
public class ArraysFind {
	public boolean Find(int target, int [][] array) {
		if(array.length==0){
            return false;
        }
        int heng = array.length-1;
        int j = array[0].length-1;
        int i =0;
        while(i<=heng&&j>=0){
//        	System.out.println(i);
//        	System.out.println(j);
            if(array[i][j] == target){
                return true;
            }
            if(array[i][j]>target){
                j--;
            }else if(array[i][j] < target){
                i++;
            }
        }
        return false;
    }
	public static void main(String[] args){
		int[] [] array = {};
		System.out.println(new ArraysFind().Find(7,array));
	}
}
