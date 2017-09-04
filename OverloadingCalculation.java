class OverloadingCalculation{
  void sum(int a,int b){System.out.println("int arg method invoked");}
  void sum(float a,float b){System.out.println("long arg method invoked");}

  public static void main(String args[]){
  OverloadingCalculation obj=new OverloadingCalculation();
  obj.sum(20.f,20.f);//now int arg sum() method gets invoked
  }
}
