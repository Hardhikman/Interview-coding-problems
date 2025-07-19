class Palindrome{
public static void main(String args[]){

string a="1221";
int m=a.length();
int n=a.length()-1;

for(int i=0;i<m/2;i++){
if(a.charAt(i)==a.charAt(n)){
sum=sum+1;
n=n-1;
}
}

if(sum==m/2){
System.out.println("PALINDROME");
}


}
}