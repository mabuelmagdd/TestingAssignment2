public class MinMax {
    public int[] minmax(int array[]){
        int len = array.length;
        int []MinMaxArray = {array[0],array[0]};
        for (int i=1;i < len;i++){
            if (array[i]<= MinMaxArray[0])
                MinMaxArray[0]=array[i];
            if (array[i]>= MinMaxArray[1])
                MinMaxArray[1]=array[i];
        }
        return MinMaxArray;
    }
}
