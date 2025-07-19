public class BubbleSort{

public static void main(String args[]){
int a[]={2,5,1,6,3};
int n=a.length;
int b[]=BS(a,n);
for(int i:b){
System.out.print(i+" ");
}
}

static int[] BS(int b[],int m){
for(int k=1;k<m-1;k++){
for(int i=0;i<m-1;i++){
if(b[i]>=b[i+1]){
 int temp=b[i];
b[i]=b[i+1];
b[i+1]=temp;
}
}
}
return b;
}


}