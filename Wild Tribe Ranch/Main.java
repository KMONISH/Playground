 #include<iostream>
int main()
{
  int n,w;
  std::cin>>n>>w;
  if(n>w)
    std::cout<<"Yes, you can enter.";
  else if(n==w)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}
    