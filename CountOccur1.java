class CountOccur1{

public static void main(String args[]){
String str="occurances";
int n=str.length()-1;
String s=CO(str,n);
System.out.println(s);
}

static String CO(String str,int m){

String s="";
for(int i=0;i<=m;i++){
int sum=0;
int sum1=0;

for(int j=i-1;j>=0;j--){
if(str.charAt(j)==str.charAt(i)){
sum=sum+1;
}
}

if(sum==0){
for(int k=i;k<=m;k++){
if(str.charAt(k)==str.charAt(i)){
sum1=sum1+1;
}
}
s=s+str.charAt(i);
s=s+sum1;
}

}
return s;
}


}