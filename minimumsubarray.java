public class minimumsubarray {
    public static void main(String[] args) {
        int arr[]={3, 1, 2, 4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int min=findmin(arr,i,j);sum+=min;
            }
        }
        System.out.println("the sum of minimum elemrnt in all subbarays are:"+sum);
    }
    public static int findmin(int arr[],int i,int j){
        int min=Integer.MAX_VALUE;
        for(i=i;i<=j;i++){
            min=Math.min(min,arr[i]);
        }return min;
    }
}