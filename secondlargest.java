public class secondlargest {
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34,35,38,38,1};
        int first=0;
        int second=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            } else if(arr[i]>second&&arr[i]<first){
                second=arr[i];
            }
        }
        System.out.println("the second largest element is:"+second);
    }
}
