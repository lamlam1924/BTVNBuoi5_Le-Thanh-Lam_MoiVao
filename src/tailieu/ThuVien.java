
package tailieu;

public class ThuVien {
    protected String maTaiLieu, tenTL, NXB;

    public ThuVien(String maTaiLieu, String tenTL, String NXB) {
        this.maTaiLieu = maTaiLieu;
        this.tenTL = tenTL;
        this.NXB = NXB;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    @Override
    public String toString() {
        return "Ma = " + maTaiLieu + ", Ten = " + tenTL + ", NXB = " + NXB ;
    }
    
    
}
