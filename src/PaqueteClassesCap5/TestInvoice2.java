package PaqueteClassesCap5;

public class TestInvoice2 {
    public static void  ejecutar(){
        Invoice2 p1 = new Invoice2(10, 345.67, 31, 2, 1034);
        p1.display();
        Invoice2 p2 = new Invoice2(10000, 456.45, 30, 12, 1034);
        p2.display();
        Invoice2 p3 = new Invoice2(10000, 64.45, 30, 56, 1034);
        p3.display();
    }
}
