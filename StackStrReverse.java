class StackRev{
static char c[]=new char[100];
static int top=-1;
static int max=c.length-1;
static char n;

static void Push(char m){
if(top==max){
System.out.println("STACK OVERFLOW");
}

else{
c[++top]=m;
}

}

static char Pop(){
if(top<0){
System.out.println("STACK UNDERFLOW");
}

else{
 n=c[top--];
}
return n;
}

public static void main(String args[]){
StringBuffer s= new StringBuffer("Hardhik"); 
int p=s.length();

for(int i=0;i<p;i++){
Push(s.charAt(i));
}

for(int i=0;i<p;i++){
s.setCharAt(i,Pop());
}

System.out.println(s);

}

}

