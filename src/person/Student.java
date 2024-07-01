
package person;

public class Student extends DoiTuong {
    private String lop;
    private String ban;

    public Student( String maDoiTuong, String name, boolean sex, String yob, String lop, String ban) {
        super(maDoiTuong, name, sex, yob);
        this.lop = lop;
        this.ban = ban;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+", Lop = " + lop + ", Ban = " + ban + '}';
    }
    
    
}
