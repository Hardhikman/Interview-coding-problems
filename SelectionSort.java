public class SelectionSort{

public static void main(String args[]){
int a[]={2,5,1,6,3};
int n=a.length;
int b[]=SS(a,n);
for(int i:b){
System.out.print(i+" ");
}
}

static int[] SS(int b[],int m){
for(int i=0;i<m;i++){
int imin=i;
for(int j=i+1;j<m;j++){
if(b[j]<b[imin]){
 imin=j;
}
}

int temp=b[imin];
b[imin]=b[i];
b[i]=temp;

}
return b;
}


}