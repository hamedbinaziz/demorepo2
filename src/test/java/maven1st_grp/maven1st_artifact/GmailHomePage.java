package maven1st_grp.maven1st_artifact;

import java.util.Scanner;

import org.openqa.selenium.support.FindBy;

public class GmailHomePage  {
	public static void main(String[] args) {
		//String s="hello world";
		System.out.println("Enter string");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine(); 
		//op:olleh dlrow
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			char a1=s.charAt(i);
			s1=s1+a1;
		}
		//System.out.println(s1);
		String []s2=s1.split(" ");
		String s3="";
		for (int j=s2.length-1;j>=0;j--) {
			s3=s3+s2[j]+" ";
				
		}
		
		System.out.println(s3);
	}
}
