class SubArray{

public static void main(String args[]){
int a[]={1,2,3,4,5};
int n=a.length-1;

for(int i=0;i<=n;i++){
for(int j=i;j<=n;j++){
for(int k=i;k<=j;k++){
System.out.print(a[k]+"");
}
System.out.print(" ");
}
System.out.println("");
}
}

}