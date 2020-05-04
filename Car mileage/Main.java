#include<iostream>
using namespace std;
int main()
{
  float x;
  int a,b,c,s;
  std::cin>>x>>a>>b;
  c=x;
  s=c*a;
  if(s<b)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";  
}