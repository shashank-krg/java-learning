class BinarySearch{
    public static void main(String args[]){
        int arr [] = {1,2,3,4,5,6,7,8,9,11,22,32};
        int li = 0;
        int item = 111;
        int hi=arr.length -1;
        int mid = (li+hi)/2;

        while(li<=hi){
            if(arr[mid]==item){
                System.out.println("Element found at "+mid+ " position");
                break;
            }
            else if(arr[mid] < item){
                li = mid+1;
            }
            else{
                hi = mid-1;
            }
            mid = (li+hi)/2;
        }
        if(li>hi){
             System.out.println("OOPS!! Element not found in the list.");
        }
     }
}