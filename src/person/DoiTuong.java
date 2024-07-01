
package person;

public class DoiTuong {
    protected String maDoiTuong;
    protected String name;
    protected boolean sex;
    protected String yob;

    public DoiTuong(String maDoiTuong, String name, boolean sex, String yob) {
        this.maDoiTuong = maDoiTuong;
        this.name = name;
        this.sex = sex;
        this.yob = yob;
    }

    public String getMaDoiTuong() {
        return maDoiTuong;
    }

    public void setMaDoiTuong(String maDoiTuong) {
        this.maDoiTuong = maDoiTuong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "Ma = " + maDoiTuong + ", Ten = " + name + ", Gioi tinh = " + sex + ", yob = " + yob ;
    }
    
    
}
