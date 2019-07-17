#include <stdio.h>
int main() {
	//Type your code
  int a,b,i;
  scanf("%d",&a);
  i=a;
  while(i!=0)
  {
    b+=i%10;
    i=i/10;
  }
  printf("%d",b);
	return 0;
}