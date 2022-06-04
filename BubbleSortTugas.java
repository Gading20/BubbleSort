public class BubbleSortTugas {
    private String[] Nama;

    public BubbleSortTugas(){
    }
    public String[] getNama(){
        return Nama;
    }
    public void setNama(String[] Nama) {
        this.Nama = Nama;
    }

    public void SortData(){
        int lendata = this.Nama.length;
        for (int i = 0;i<lendata;i++) {
            for (int j = i + 1; j < lendata; j++) {
                if (this.Nama[j].equalsIgnoreCase(String.valueOf(this.Nama.length)));
                String oke = this.Nama[j];
                this.Nama[j] = this.Nama[j];
                this.Nama[j] = oke;
            }
        }
    }
    public void PrintData(){
        for (String dataNama:this.Nama){
            System.out.println(dataNama+" ");
        }
    }

    public static void main(String[] args) {
        String[] Konco = {"naufal","gading","baihaqi","halim"};
        BubbleSortTugas tata = new BubbleSortTugas();
        tata.setNama(Konco);
        tata.SortData();
        tata.PrintData();
    }
}