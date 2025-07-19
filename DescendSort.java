class DescendSort{

public static void main(String args[]){
int a[]={4,3,1,6,4,3,6,4};
int n=a.length-1;
int b[]=SS(a,n);
for(int m:b){
System.out.print(m+" ");
}
}

static int [] SS(int a[],int n){
for(int i=0;i<n-2;i++){
int imin=i;
for(int j=i+1;j<n;j++){
if(a[j]>=a[imin]){
imin=j;
}
}
int temp=a[i];
a[i]=a[imin];
a[imin]=temp;

}
return a;

}

}