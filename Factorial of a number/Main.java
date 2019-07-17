#include <stdio.h>
int main() {
	//Type your code
  int a,i=1;
  scanf("%d",&a);
  while(a)
  {
    i*=a;
    a--;
  }
  printf("%d",i);
	return 0;
}