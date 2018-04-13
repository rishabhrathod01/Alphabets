package alphamagic;

/* Name of the class has to be "Main" only if the class is public. */
public class Main{
	  static char s[]=new char[26];//Char array to store Set of alphabets
	
	public static void main(String args[]){
		  long size=1;
	    char ch='a';
	  
	    for(int i=0;i<26;i++)		//Loop to add alphabets to Char array s[]
	    	{
	    	s[i]=(char)(ch+i);
	    }

           while(true)			//infinite loop which increases size of the string.
           { recursion(size,"");
            System.out.println("");
            size++;
            }
	}
	
public static void recursion(long size,String prefix)//Recursive method
	{	
	// Base case: size is 0, print prefix
	if(size==0)
	{	System.out.println(prefix);
		return;
	}
	 // One by one add all characters from set and recursively 
    // call for size equals to size-1
	for(int i=0;i<26;i++)
	{
		 // Next character of input added
    	String newPrefix = prefix + s[i];
    	 // Size is decreased, because we have added a new character
    	recursion(size-1,newPrefix);
	}
	
}
}
