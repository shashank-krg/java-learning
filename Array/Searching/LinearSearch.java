class LinearSearchInt{
    public static void main(String []args){
        int []arr = {5,2,1,9,33,0};
        int item = 11;
        int temp= 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("Element is found at " +i+ " position!!");
                temp = temp+1;
            }
        }
        if(temp==0){
               System.out.println("OOPS!! No data found!!");
        }
    }
}

class LinearSearchString{
    public static void main(String []args){
        String []arr = {"Shashank","Rahul","Lokesh","deepak","Kumar"};
        String item = "Rahul";
        int temp= 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i].equals(item)){
                System.out.println("Element is found at " +i+ " position!!");
                temp = temp+1;
            }
        }
        if(temp==0){
               System.out.println("OOPS!! No data found!!");
        }
    }
}