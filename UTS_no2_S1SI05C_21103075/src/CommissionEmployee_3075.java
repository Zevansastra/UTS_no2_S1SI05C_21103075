public class CommissionEmployee_3075 extends Employess_3075{
    public float Komisi_3075;
    public float TotalPenjualan_3075;
    public float Totalgaji_3075;
    
    public CommissionEmployee_3075(){
        
    }
    
    public float TotalGaji_3075(){
        Totalgaji_3075 = GajiPokok_3075 + (Komisi_3075 * TotalPenjualan_3075);
        return Totalgaji_3075;
    }
    
    public void TampilData_3075(){
        System.out.println("Commission Employee");
        Tampil_3075();
        System.out.println("Total Gaji: " + Totalgaji_3075);
    }
}
