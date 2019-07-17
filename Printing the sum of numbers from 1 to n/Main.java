#include <stdio.h>
int main() {
	//Type your code
  int n=0,a;
  scanf("%d",&a);
  while(a)
  {
    
    n+=a;
    a--;
  }
  printf("%d",n);
	return 0;
}