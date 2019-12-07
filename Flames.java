import java.util.Scanner;
public class Flames
{
	public static String[] flames = {"Friends","Lover","Affection","Marriage","Enemies","Siblings"};
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		char[] name1,name2;
/*		name1 = args[0].toCharArray();
		name2 = args[1].toCharArray();
*/
		name1 = scan.nextLine().toCharArray();
		name2 = scan.nextLine().toCharArray();
		int count=0;
		int total = name1.length + name2.length;

		for(int i=0;i<name1.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<name2.length;j++)
			{
				if(name1[i]==name2[j]) {count++;flag=true;}
			}
			if(flag)count++;
		}
		int rem = total-count;
		System.out.println("Your Relationship will end with "+flames[rem%6]);

	}

}
