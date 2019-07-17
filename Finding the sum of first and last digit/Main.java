#include <stdio.h>
int main() {
	//Type your code
  int a,b,c;
  scanf("%d",&a);
  b=a%10;
  while(a>=10)
  {
    a=a/10;
  }
  printf("%d",b+a);
	return 0;
}