public class ProjectPlanner_3075 extends Employess_3075{
    public float Komisi_3075;
    public float TotalHslProyek_3075;
    public double Totalgaji_3075;
    
    public ProjectPlanner_3075(){
        
    }
            
    public double TotalGaji_3075(){
        Totalgaji_3075 = GajiPokok_3075 + (Komisi_3075 * TotalHslProyek_3075) - (GajiPokok_3075 *5/100);
        return Totalgaji_3075;
    }
    
    public void TampilData_3075(){
        System.out.println("Project Plannner");
        Tampil_3075();
        System.out.println("Total Gaji: " + Totalgaji_3075);
    }
}
