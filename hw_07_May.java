package HW_Geekster_May;

public class hw_07_May {

	public static void main(String[] args) {
		
		int [] a = {3,4,5,6,7,2};
		int n = a.length-1;
		
		System.out.println(peakElement(a,n));
		
		prodArray(a,n);
		

	}

	
	public static int peakElement(int arr[], int n){
		for(int i=0;i<n;i++){
	           if(n==1){
	               return i;
	           }
	           else if(i==0){
	               if(arr[i]>arr[i+1])
	                return i;
	           }
	           else if(i==(n-1)){
	               if(arr[i]>arr[i-1])
	                return i;
	           }
	           else{
	               if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
	                return i;
	           }
	       }
		return n;
		}
	
	
	public static void prodArray(int a[], int n){
        int p[] = new int[n];
        int prod=1;
        
        for(int i=0; i<n; i++){
            prod = prod * a[i];
        }
      
        for(int i=0; i<n; i++){
            p[i] = prod / a[i];
        }
        
        for(int i=0; i<n; i++){
            System.out.print(p[i] + " ");
        }
    }
}
