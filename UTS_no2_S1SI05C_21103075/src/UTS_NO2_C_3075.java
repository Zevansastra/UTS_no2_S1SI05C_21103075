import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO2_C_3075 {

    public static void main(String[] args) {
        SalariedEmployee_3075 se_3075 = new SalariedEmployee_3075();
        CommissionEmployee_3075 ce_3075 = new CommissionEmployee_3075();
        ProjectPlanner_3075 pp_3075 = new ProjectPlanner_3075();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se_3075.Nama_3075 = br.readLine();
            System.out.print("NIP: ");
            se_3075.NIP_3075 = br.readLine();
            System.out.print("Gaji Pokok: ");
            se_3075.GajiPokok_3075 = Float.parseFloat(br.readLine());
            se_3075.TampilData_3075();
            
            System.out.print("Nama: ");
            ce_3075.Nama_3075 = br.readLine();
            System.out.print("NIP: ");
            ce_3075.NIP_3075 = br.readLine();
            System.out.print("GajiPokok: ");
            ce_3075.GajiPokok_3075 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce_3075.Komisi_3075 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce_3075.TotalPenjualan_3075 = Float.parseFloat(br.readLine());
            ce_3075.TotalGaji_3075();
            ce_3075.TampilData_3075();
            
            System.out.print("Nama: ");
            pp_3075.Nama_3075 = br.readLine();
            System.out.print("NIP: ");
            pp_3075.NIP_3075 = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp_3075.GajiPokok_3075 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp_3075.Komisi_3075 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp_3075.TotalHslProyek_3075 = Float.parseFloat(br.readLine());
            pp_3075.TotalGaji_3075();
            pp_3075.TampilData_3075();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
