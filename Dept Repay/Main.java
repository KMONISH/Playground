#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  float c,a,d,b;
  std::cin>>p>>t>>r;
  a=(p*t*r)/100;
  cout<<a<<endl;
  b=a+p;
  cout<<b<<endl;
  c=(a*2)/100;
  cout<<c<<endl;
  d=b-c;
  cout<<d<<endl; 
}