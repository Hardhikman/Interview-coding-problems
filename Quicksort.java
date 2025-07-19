class QuickSort{         //Right answer verified

static void QS(int a[],int start,int end){

if(start<end){
int pivotindex=Partition(a,start,end);
QS(a,start,pivotindex-1);
QS(a,pivotindex+1,end);
}

}


static int Partition(int a[],int start,int end){
int pivot=a[end];
int pindex=start;

for(int i=start;i<end;i++){
if(a[i]<=pivot){
int temp =a[i];
a[i]=a[pindex];
a[pindex]=temp;
pindex=pindex+1;
}
}

int temp=a[end];
a[end]=a[pindex];
a[pindex]=temp;

return pindex;
}


public static void main(String args[]){
int a[]={2,3,1,5,9,6};
QS(a,0,5);
for(int i:a){
System.out.print(i+" ");
}
}


}