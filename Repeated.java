import java.util.Scanner;
public class Repeated {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the string : ");
	String s=in.nextLine();
	String s1=in.nextLine();
	int n=s.length();
	char ch[]=s.toCharArray();
	char ch1[]=s1.toCharArray();
	int count=0;
	for(int i=0;i<s.length();i++){
	    for(int j=0;j<s1.length();j++){
	    	if(ch[i]==ch1[j]){
	          System.out.println(ch[j]);
	          count++;
	   }
	   }
	   }
	   System.out.println(count);
	  }}
