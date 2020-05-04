#include<iostream>
using namespace std;
int main()
{
 int x,a,b,c,A,B;
  std::cin>>x>>a>>b;
  A=a*75;
  B=b*30;
   c=A+B;
  if(x>c)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
    
}