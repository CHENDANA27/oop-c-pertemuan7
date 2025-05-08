package pertemuan701;

/**
 *
 * @author Chendana
 * TGL 8 mei 2025
 * contoh class overlaoding
 */
public class salam {
    String tx = "Menggunakan method tulisSalam tanpa Parameter";
    
    public void tulisSalam(){
        System.out.println(tx);
    }   
    public void tulisSalam(String txt){
        System.out.println (txt);
    }
    public void tulisSalam(int jumblah){
        System.out.println("salam si ulang sebanyak");
    }
    
}
