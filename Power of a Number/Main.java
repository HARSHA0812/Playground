#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here
  int b,e;
  long int a;
  scanf("%d%d",&b,&e);
  if(e<0)
    printf("Wrong input");
  else
  {
    a=pow(b,e);
  	printf("%ld",a);
  }
  return 0;
}