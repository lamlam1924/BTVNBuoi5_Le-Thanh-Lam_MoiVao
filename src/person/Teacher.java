
package person;

public class Teacher extends DoiTuong {
    private String monDay, trinhDo;

    public Teacher( String maDoiTuong, String name, boolean sex, String yob, String monDay, String trinhDo) {
        super(maDoiTuong, name, sex, yob);
        this.monDay = monDay;
        this.trinhDo = trinhDo;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+", Mon day = " + monDay + ", Trinh do = " + trinhDo + '}';
    }
    
    
    
}
