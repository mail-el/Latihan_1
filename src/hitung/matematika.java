
package hitung;


public class matematika {
    //membuat variabel
    private double bil1, bil2;
    
    //membuat construktor
    public matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //membuat method setPenjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    //membuat method setPenngurangan
    public double setPengurangan(){
        return bil1 - bil2;
    }
    
    //membuat method setPerkalian
    public double setPerkalian(){
        return bil1 * bil2;
    }
    
    //membuat method setPembagian
    public double setPembagian(){
        return bil1 / bil2;
    }
    
    
}
