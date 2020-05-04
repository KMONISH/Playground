#include<iostream>
using namespace std;
int main()
{
   int fa,fd,fs,sa,sd,ss,aa,ad,as,F,S,A,f,s,a;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  F=fa*fd/100;f=fa-F+fs;
  S=sa*sd/100;s=sa-S+ss;
  A=aa*ad/100;a=aa-A+as;
  std::cout<<"In Flipkart Rs."<<f<<endl;
  std::cout<<"In Snapdeal Rs."<<s<<endl;
  std::cout<<"In Amazon Rs."<<a<<endl;
  {
  if(s<f && s<a)
    std::cout<<"He will prefer Snapdeal";
  else if(f<=s && f<a)
    std::cout<<"He will prefer Flipkart";
  else 
    std::cout<<"He will prefer Amazon";
  }
  return 0;
}