//Time complexity : o(n)
//Space cpmlexity : o(1);
public class ReversalArr{
    public static void main(String args[]){
        int arr[]={1,3,5,8,10};
        int n=arr.length;

        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}