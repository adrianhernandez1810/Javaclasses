public class Runner {
    public static void main(String[]args){
        Car adrian = new Car(2018,"BWM", "batmobile");
        System.out.println(adrian.toString());
        adrian.drive(200);
        Rectangle computer = new Rectangle(40,50);
        System.out.println(adrian.toString());

        System.out.println(computer.area());
        System.out.println(computer.diagonal());
        System.out.println(computer.isSquare());
    }
}
