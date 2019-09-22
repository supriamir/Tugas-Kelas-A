public class LoopingTiga{
    public static void main(String[] args){

        double y;

        System.out.println("x" + " -- " + "y    <----- untuk persamman 1");
        for (double a=0 ; a<=50 ; a+=5){
            y = (4*a) + 1;
            System.out.printf("%.0f -- %.0f \n",a,y);
        }
        System.out.println("-------------------------- ");
        System.out.println("x" + "   -- " + "y  <----- untuk persamaan 2");
        for (int b=1 ; b<=10 ; b++){
            y = Math.sqrt(b) - 1;
            System.out.printf("%d -- %.2f \n",b,y);
           
        }
        System.out.println("-------------------------- ");
        System.out.println("x" + "   -- " + "y  <----- untuk persamaan 3");
        for (double c=1 ; c<=5 ; c+= 0.5){
            y = (5*(c*c)) + (3*c) - 2;
            System.out.printf("%.1f -- %.2f \n",c,y);
        
        }
    }
}
