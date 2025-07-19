public class BinarySearch{

public static void main(String args[]){
int a[]={2,5,1,6,3};
int n=3;
boolean s=BS(a,n);
System.out.println(s);
}


static boolean BS(int a[],int x){
int start=0;
int end=a.length-1;
while(start<=end){
int mid=(start+end)/2 ;
if(a[mid]==x){
return true;
}

else if(x<a[mid]){
end=mid-1;
}

else if(x>a[mid]){
start=mid+1;
}

else{
return false ;
}


}
}
}