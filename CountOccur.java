class CountOccur{

public static void main(String args[]){
int arr[]={4,3,1,6,4,3,6,4};
int n=arr.length-1;
int a[]=CO(arr,n);
for(int i:a){
System.out.print(i+" ");
}
}

static int[] CO(int a[],int m){

int n=0;
int b[]=new int[m+1];
int sum1=0;
for(int i=0;i<=m;i++){
int sum=0;

for(int j=i-1;j>=0;j--){
if(a[j]==a[i]){
sum=sum+1;
}
}

if(sum==0){
for(int k=i;k<=m;k++){
if(a[k]==a[i]){
sum1=sum1+1;
}
}
while(sum1!=0){
b[n]=a[i];
n=n+1;
sum1=sum1-1;
System.out.println(a[i]);
}
}

}
return b;
}


}