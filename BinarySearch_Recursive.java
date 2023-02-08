class BinarySearch_Recursive {
    int binarysearch(int arr[], int n, int k) {
        int l=0;
        return search(arr,l,n-1,k);
    
    }
    public int search(int [] arr,int l,int u,int k){
        if(u>=l){
            int mid=l+(u-l)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                return search(arr,l,mid-1,k);
            }else{
                return search(arr,mid+1,u,k);
            }
        }
        return -1;
    }
}