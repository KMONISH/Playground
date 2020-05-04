#include<iostream>
using namespace std;
int main()
{
int a,b;
  std::cin>>a>>b;
  if(a>b)
  {
    a=a+100;
    b=b+200;
  std::cout<<b-a<<endl;
  }
  else
  std::cout<<b-a;
  return 0;
}