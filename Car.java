public static void main(String args[]){

  String car = null;
  
  try{
    //vendendo o carro 
    car = car.send();
  } catch(NullPointerException e){
    System.out.println("O carro não pode ser vendido pois voce mao possui um carro ainda");
    car = car.buy();
  }
}
