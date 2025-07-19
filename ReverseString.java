class Reverse{
public static void main(String args[]){
String a="1 2 3 4 5";
int m=a.length();
String s="";

for(int i=m-1;i>=0;i--){
s=s+a.charAt(i);
}

System.out.println("reversed string is "+s);


}
}