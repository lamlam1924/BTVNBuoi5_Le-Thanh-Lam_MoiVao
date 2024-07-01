
package tailieu;

public class Book extends ThuVien {
    private int soTrang;

    public Book( String maTaiLieu, String tenTL, String NXB, int soTrang) {
        super(maTaiLieu, tenTL, NXB);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Book{" +super.toString()+ ", So trang = " + soTrang + '}';
    }
     
}
