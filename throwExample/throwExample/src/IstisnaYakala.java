public class IstisnaYakala {
    public static void konumHesapla(int konumNo) throws ArithmeticException{
        if(konumNo == 0) {
            throw new ArithmeticException();
        }
        else{
            System.out.println("Konum hesaplanıyor");
        }
    }

}
