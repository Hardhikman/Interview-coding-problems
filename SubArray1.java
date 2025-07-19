class SubArray1{           // given sum subarray

public static void main(String args[]){
int a[]={1,2,3,4,5};
int n=a.length-1;
int c[]=new int[a.length];
//int p=0;
int p=0;
for(int i=0;i<=n;i++){
for(int j=i;j<=n;j++){
int b[]=new int[a.length];
int m=0;
int sum=0;
for(int k=i;k<=j;k++){
b[m]=a[k];
m=m+1;
sum=sum+a[k];
}
if(sum==5){
p=sum;
c=b;
break;
}
}
if(p==5){
break;
}
}
int i=0;
while(c[i]!=0){
System.out.print(c[i]+" ");
i=i+1;
}

}
}