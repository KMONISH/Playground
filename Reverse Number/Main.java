#include <iostream>
int main() 
{
	long n,rem,sum;
  std::cin>>n;
  while(n>0)
  {
    rem=n%10;
    n=n/10;
    sum=(sum*10)+rem;
  }
  std::cout<<sum;
	return 0;
}