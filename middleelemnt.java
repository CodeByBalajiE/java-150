public class middleelemnt {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int mid=arr.length/2;
        if(arr.length%2==0){
            System.out.println(arr[mid]+","+arr[mid+1]);
        }
        else{
            System.out.println(arr[mid]);
        }
    }
}
