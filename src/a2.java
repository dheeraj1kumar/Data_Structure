public class a2 {
  
 static void  reverseArray(int arr[],int start,int end){
        int temp;
        while(start<end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        }

        static void print(int arr[],int size){
 for(int i=0;i<size;i++){
     System.out.print(arr[i]);
     System.out.print(" ");

 }
        }

        public static void main(String[] args) {
            int arr[]={1,2,3,45,6};
            print(arr,5);

            reverseArray(arr,1,3);
            System.out.println("\nReverse the array:");
            print(arr,5);
       
}
