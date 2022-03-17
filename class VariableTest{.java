class VariableTest{
    public static void main(String[] args){
     double d1 = 12.0;
     double d2 = 19.0;
    if (d1 > 10.0 && d2 < 20) {
        System.out.println("d1 + d2 = " + (d1 + d2));

        
    } else {
        System.out.println("d1 * d2 =" + (d1 * d2));
        
    }

    String i1 = "合肥" ;
    String i2 = "上海" ;
    String temp = i1;
    i1 = i2;
    i2 = temp;
    System.out.println("i1=" + i1 + "\ti2="+ i2);
    

    
    }
}