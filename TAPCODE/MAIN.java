public class MAIN {
    public static void main(String[] args)
    {
        SACHGIAOKHOA cap1= new SACHGIAOKHOA("001",3,20000,"moi");
        SACHTHAMKHAO cap2= new SACHTHAMKHAO("002",4,30000,400);
        cap1.thanhtiengiaokhoa();
        cap2.thanhtienthamkhao();
                cap1.in();
                System.out.println("Thanh tien: "+cap1.thanhtiengiaokhoa());
                System.out.println("=============");
        cap2.in();
        System.out.println("thanh tien: "+cap2.thanhtienthamkhao());

    }
}
