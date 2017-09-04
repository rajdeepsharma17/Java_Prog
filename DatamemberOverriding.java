class Bike{  
 int speedlimit=90;  
}  
class DatamemberOverriding extends Bike{  
 int speedlimit=150;  
  
 public static void main(String args[]){  
  Bike obj=new DatamemberOverriding();  
  System.out.println(obj.speedlimit);//90  
}
}

//Run time polymorfism can not be acheive using Datamember 