
package tailieu;

public class Paper extends ThuVien {
    private int taiBan;

    public Paper( String maTaiLieu, String tenTL, String NXB, int taiBan) {
        super(maTaiLieu, tenTL, NXB);
        this.taiBan = taiBan;
    }

    public int getTaiBan() {
        return taiBan;
    }

    public void setTaiBan(int taiBan) {
        this.taiBan = taiBan;
    }

    @Override
    public String toString() {
        return "Paper{" +super.toString()+", Tai ban = " + taiBan + '}';
    }
    
    
}
