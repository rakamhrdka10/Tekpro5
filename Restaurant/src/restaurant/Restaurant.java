
package restaurant;
class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    // getter
    public String[] getNamaMakanan() {
        return nama_makanan;
    }
    
    public String getNamaMakanan(int id){
        return nama_makanan[id];
    }

    public double[] getHarga_makanan() {
        return harga_makanan;
    }
    
    public double getHarga_makanan(int id){
        return harga_makanan[id];
    }

    public int[] getStok() {
        return stok;
    }
    
    public int getStok(int id){
        return stok[id];
    }

    public static byte getId() {
        return id;
    }

    // setter
    public void setNama_makanan(String[] nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public void setNama_makanan(String nama_makanan, int id){
        this.nama_makanan[id] = nama_makanan;
    }
    
    public void setHarga_makanan(double[] harga_makanan) {
        this.harga_makanan = harga_makanan;
    }
    
    public void setHarga_makanan(double harga_makanan, int id){
        this.harga_makanan[id] = harga_makanan;
    }
    
    public void setStok(int[] stok) {
        this.stok = stok;
    }
    
    public void setStok(int stok, int id){
        this.stok[id] = stok;
    }

    public static void setId(byte id) {
        Restaurant.id = id;
    }
    
    
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
  
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        setNama_makanan(nama, id);
        setHarga_makanan(harga, id);
        setStok(stok, id);
    }

    
    public void takeOrder(String nama_makanan, int jumlah){
        for(int i=0; i<=id; i++){
            if(nama_makanan == getNamaMakanan(i)){
                if(!isOutOfStock(i)){
                    this.setStok(getStok(i) - jumlah, i);
                }
            }
        }
    }
    
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(getNamaMakanan(i) + " ["+getStok(i)+ "] " + "\tRp. "+getHarga_makanan(i));
            }else{
                System.out.println(getNamaMakanan(i) + " ["+getStok(i)+ "] " + "\tRp. "+getHarga_makanan(i));
            }
        }
    }
     public void tampilMenuMakanan2(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(getNamaMakanan(i) + " ["+getStok(i)+ "] " + "\tRp. "+getHarga_makanan(i));
            }else{
                System.out.println(getNamaMakanan(i)+" \t\tMakanan tidak tersedia");
            }
        }
    }
    

    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
}
