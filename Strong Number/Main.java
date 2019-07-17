#include <stdio.h>
int fact(int a)
{
  int c=1;
  for(int i=a;i>0;i--)
  {
    c*=i;
  }
  return c;
}
int main() {
  int a,b,c=0;
  scanf("%d",&a);
  b=a;
  while(a)
  {
    c+=fact(a%10);
    a/=10;
  }
  if(c==b)
    printf("Yes");
  else
    printf("No");
	return 0;
}