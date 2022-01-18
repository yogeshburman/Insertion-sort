class InsertionSort {
  public static void main (String []args){
    
    System.out.println("Insertion sort");
    
    int arr[]={7,8,3,1,2,55,0};
    
    for(int i=0;i<arr.length;i++){
      int key=arr[i];
      int left=i-1;
      
      
      while(left>=0 && key<arr[left]){
        
           arr[left+1]=arr[left];
        left--;
          
        }
        
      
      arr[left+1]=key;
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}