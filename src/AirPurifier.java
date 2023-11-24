import java.util.Scanner;
public class AirPurifier {
    String model;
    String serialNo;
    String color;
    boolean power,Atmospower,IONpower,Airpower;
    private Object turnOn;
    void turnOn(){ power = true;}
    void turnOff(){ power = true;}
    void turnOnATmos(){ Atmospower = true;}
    void turnOffATmos(){Atmospower = false;}
    void turnOnION(){ IONpower = true;}
    void turnOffION(){ IONpower= false;}
    void turnOnAirFresh() { Airpower = true;}
    void turnOffAirFresh() { Airpower= false;}
    void Showstatus(){
        if(Atmospower){
            System.out.println("----Anti mosquito working---- ");
        }else{
            System.out.println("----Anti mosquito stopping---- ");
        }
        if(IONpower){
            System.out.println("----Anti ION working---- ");
        }else{
            System.out.println("----Anti ION stopping---- ");
        }
        if(Airpower){
            System.out.println("----Anti Air freshener working---- ");
        }else{
            System.out.println("----Anti Air freshener stopping---- ");
        }
    }
    AirPurifier(String _model,String _serialNo,String _color){
        model=_model;serialNo=_serialNo;color= _color;
    }
    static int modelCount;
    public static void main (String[] args) {
        AirPurifier f = new AirPurifier("Pro","123","red");
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Number ( 0=OFF and 1=ON) : ");
        int order,order2,orderAM,orderION,roderAir;
        order = in.nextInt();
        if(order==1){
            f.turnOn();
            System.out.println("AirPurifier : Open");
            while (order !=0) {
                System.out.println(" Menu");
                System.out.println("Enter 1 for Menu Anti mosquito ");
                System.out.println("Enter 2 for Menu ION");
                System.out.println("Enter 3 for Menu Air freshener");
                System.out.println("Enter 4 for show status");
                System.out.println("Enter 0 for Turn off");
                System.out.print("Please Enter Number (0-4) : ");
                order2 = in.nextInt();
                if(order2 ==0 ){
                    order = 0;
                }
                else if(order2 ==1 ){
                    System.out.print("Please Enter Number ( 0=OFF and  1=ON) for Anti mosquito : ");
                    orderAM = in.nextInt();
                    if(orderAM==0){
                        f.turnOffATmos();
                        System.out.println("Anti mosquito stopping ");
                    }else {
                        f.turnOnATmos();
                        System.out.println("Anti mosquito working ");
                    }
                }
                else if(order2 ==2 ){
                    System.out.print("Please Enter Number ( 0=OFF and   1=ON) for ION : ");
                    orderION = in.nextInt();
                    if(orderION==0){
                        f.turnOffION();
                        System.out.println("Anti ION stopping ");
                    }else {
                        f.turnOnION();
                        System.out.println("Anti ION working ");
                    }
                }
                else if(order2 ==3 ){
                    System.out.print("Please Enter Number ( 0=OFF and     1=ON) for Air freshener : ");
                    roderAir = in.nextInt();
                    if(roderAir==0){
                        f.turnOffAirFresh();
                        System.out.println("Anti Air freshener stopping   ");
                    }else {
                        f.turnOnAirFresh();
                        System.out.println("Anti Air freshener working ");
                    }
                }
                else if(order2 ==4 ){
                    f.Showstatus();
                }
                else{
                    System.out.println("Error Please Enter Number (0-4) :   ");
                }
            }
            System.out.print("AirPurifier : OFF");
        }else{System.out.print("AirPurifier : OFF");}
    }
}
