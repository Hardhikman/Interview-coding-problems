class SubString1{               //verifed all the substring from index 0 and final answer is the substring having greatest length  
public static void main(String args[]){
int n=0;
String str="14253";
int m=str.length()-1;
String a="";
for(int i=1;i<=m+1;i++){
int sum=1;
String s=str.substring(0,i);  //creating the subarray including index '0' and excluding the 'i'(means including i-1)
System.out.println("The substring are-"+s);
for(int j=0;j<s.length()-1;j++){
if(s.charAt(j)<s.charAt(s.length()-1)){
sum=sum+1;
System.out.println(sum);
}
}
if(sum>n){
n=sum;
a=s;
System.out.println(n+" "+a);
}

}

System.out.println(a+"-"+n);
}


}