#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  if(a>0&&a<5)
  {
    switch (a)
    {
    case 1:printf("One");
    		break;
    case 2:printf("Two");
    		break;
    case 3:printf("Three");
    		break;
    case 4:printf("Four");
    		break;
    case 5:printf("Five");
    		break;
  }
  }
  else
    printf("Invalid");
  return 0;
}