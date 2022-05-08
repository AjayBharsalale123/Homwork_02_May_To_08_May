package HW_Geekster_May;


import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class hw_02_May {

	    public static void main (String[] args)
	    {
	        String a[] = {"India","Aus","India","Japan"};
	        
	        


	        String max = "";
	for(int i =0;i<a.length;i++)
	{

	if(a[i].length() > max.length())
	{
	max = a[i];
	}

	}


	String b[] = new String[max.length()+1];



	for(int i =0;i<a.length;i++)
	{
	int num = a[i].length();

	b[num] = b[num]+1;

	}



	for(int i = 0;i<b.length;i++)
	{
	int num = b[i].length();

	if(num > 0)
	{

	System.out.println("Index ="+i+" Frequency "+num);
	}
	}
	
	
	//****************************************************
	
	
	Integer arr[]={1,2,5,6,3,2};  
	  
	System.out.println("Second Smallest: "+getSecondSmallest(arr,6));  
	

	}
	    
	    public static int getSecondSmallest(Integer[] a, int total){  
	    	List<Integer> list=Arrays.asList(a);  
	    	Collections.sort(list);  
	    	int element=list.get(1);  
	    	return element;  
	    	}  
	    
	    
	}



