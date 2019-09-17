import java.util.Scanner;
class looping1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.printf("%d merupakan kelipatan dari",a);
        if(a>0){
            for(int i = 1; i <= a; i++)
            {
                if(a % i == 0){
                    System.out.printf("%d",i);
                    
                }else if(a < 0){
                    for(int i = 1;i<=(-1*a);i++){
                        if(a % i == 0){
                            System.out.printf("%d",i);
                        }
                    }
                }else{
                    System.out.println("null");
                }
            }
        }
        
        
        }
    }
