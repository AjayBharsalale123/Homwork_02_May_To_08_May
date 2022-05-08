package HW_Geekster_May;


public class hw_06_May {
	
	public static void main(String[] args) {
		
		
		String S = "abc";
        int N = S.length();
 
      
        System.out.println(encryptString(S, N));
        
        
        String str1="amazon";
        String str2="azonam";
        
        
        System.out.println(isRotated(str1,str2));
		
	}
	
	public static String convertToHex(int num)
    {
 
        StringBuilder temp = new StringBuilder();
        while (num != 0) {
            int rem = num % 16;
            char c;
            if (rem < 10) {
                c = (char) (rem + 48);
            }
            else {
                c = (char) (rem + 87);
            }
            temp.append(c);
            num = num / 16;
        }
 
        return temp.toString();
    }
 
   
    public static String encryptString(String S, int N)
    {
 
        StringBuilder ans = new StringBuilder();
 
        for (int i = 0; i < N; i++) {
 
            char ch = S.charAt(i);
            int count = 0;
            String hex;
 
            while (i < N && S.charAt(i) == ch) {
 
                count++;
                i++;
            }
 
            i--;
 
            
            hex = convertToHex(count);
 
            ans.append(ch);
 
            
            ans.append(hex);
        }
 
        ans.reverse();
 
        return ans.toString();
    }
	
    
    public static boolean isRotated(String str1, String str2)
    {
        String temp=str1;
        temp = temp.substring(str1.length()-2,str1.length()) + str1.substring(0,str1.length()-2);
        str1 = str1.substring(2,str1.length()) + str1.substring(0,2);
        
        if(str1.equals(str2) || temp.equals(str2))
           
        	return true;
        
        return false;
    }

}
