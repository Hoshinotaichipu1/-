public class ForTest1 {
    public static void main(String[] args){
        label:for(int i = 1; i <= 9; i++){
        for(int j = 1; j <= 9; j++){
            if(j % 4 == 0)
            //break;
            //break label;
            //continue;
        
            continue label;
            System.out.print(j);
        }
        System.out.println();
        }
        }
    }

