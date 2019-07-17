#include <stdio.h>
int main() {
	//Type your code
  int a,b,i,j;
  scanf("%d",&a);
  b=a;
  while(a)
  {
    i=a%10;
    j+=i*i*i;
    a=a/10;
  }
  if(j==b)
    printf("Armstrong Number");
 	else
      printf("Not an Armstrong Number");
	return 0;
}