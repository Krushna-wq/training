#include <iostream>

using namespace  std;


bool CheckPerfect(int number){
  if(number <= 1){
    return false;
  }
  int sum = 1;

  for(int i = 2; i * i <= number; i++){
    if(number % i == 0){
        if(i * i != sum){
          sum += i + (number) / i;
        }else{
          sum = sum + i;
        }
    }
  }
   return sum == number;
}

int main(){
  int num;

  cout<< "Enter a Number";
  cin>> num;

  if(CheckPerfect(num)){
    cout << num << "is a perfect number" << endl;
  }else{
    cout << num << " is not a perfect number." << endl;
  }
 return 0;
  
}