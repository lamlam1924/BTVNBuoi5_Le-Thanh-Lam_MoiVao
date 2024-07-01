package view;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import person.DoiTuong;
import person.Student;
import person.Teacher;
import tailieu.Book;
import tailieu.Paper;
import tailieu.ThuVien;

public abstract class Main extends Menu {
    
    ArrayList<Student> listHS = new ArrayList<>();
    ArrayList<Teacher> listGV = new ArrayList<>();
    ArrayList<Book> listS = new ArrayList<>();
    ArrayList<Paper> listP = new ArrayList<>();
    static String[] mainArr = {"Them hoc sinh", "Them giao vien", "Them sach", "Them paper", "Hien thi tat ca cac doi tuong", "Hien thi ra tat ca cac sach hoac paper co trong thu vien", "Nhap lua chon khac de thoat"};
    Scanner sc = new Scanner(System.in);
    
    public Main() throws ParseException {
        super("Quan li truong hoc: ", mainArr);
        
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addNewHocsinh();
                break;
            case 2:
                addNewGiaoVien();
                break;
            
            case 3:
                addNewBook();
                break;
            
            case 4:
                addNewPaper();
                break;
            
            case 5:
                displayGiaoVien();
                displayHocSinh();
                System.out.println("");
                break;
            
            case 6:
                displayBook();
                displayPaper();
                System.out.println("");
                break;
        }
    }
    
    public static void main(String[] args) throws ParseException {
        
        Main test = new Main() {
        };
        test.run();
        
    }
    
    public void addNewHocsinh() {
        
        System.out.print("Nhap ma doi tuong: ");
        String code = sc.nextLine();
        System.out.print("Nhap ten doi tuong: ");
        String name = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        Boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhap dd/MM/yy: ");
        String yob = sc.nextLine();
        System.out.print("Nhap lop hoc: ");
        String lop = sc.nextLine();
        System.out.print("Nhap khoi ban: ");
        String ban = sc.nextLine();
        
        Student hs1 = new Student(code, name, gioiTinh, yob, lop, ban);
        listHS.add(hs1);
        System.out.println("Ban da them hoc sinh moi thanh cong.");
        System.out.println("");
    }
    
    public void addNewGiaoVien() {
        
        System.out.print("Nhap ma doi tuong: ");
        String code = sc.nextLine();
        System.out.print("Nhap ten doi tuong: ");
        String name = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        Boolean sex = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhap dd/MM/yy: ");
        String yob = sc.nextLine();
        System.out.print("Nhap mon day: ");
        String mon = sc.nextLine();
        System.out.print("Nhap trinh do: ");
        String td = sc.nextLine();
        
        Teacher newGV = new Teacher(code, name, sex, yob, mon, td);
        listGV.add(newGV);
        System.out.println("Ban da them giao vien moi thanh cong.");
        System.out.println("");
    }
    
    public void addNewBook() {
        System.out.print("Nhap ma tai lieu: ");
        String code = sc.nextLine();
        System.out.print("Nhap ten tai lieu: ");
        String name = sc.nextLine();
        System.out.print("Nhap ten NXB: ");
        String nxb = sc.nextLine();
        System.out.print("Nhap so trang: ");
        Integer soTrang = Integer.parseInt(sc.nextLine());
        
        Book newSach = new Book(code, name, nxb, soTrang);
        listS.add(newSach);
        System.out.println("Ban da them sach moi thanh cong.");
        System.out.println("");
    }
    
    public void addNewPaper() {
        System.out.print("Nhap ma tai lieu: ");
        String code = sc.nextLine();
        System.out.print("Nhap ten tai lieu: ");
        String name = sc.nextLine();
        System.out.print("Nhap ten NXB: ");
        String nxb = sc.nextLine();
        System.out.print("Nhap so so lan tai ban: ");
        Integer taiBan = Integer.parseInt(sc.nextLine());
        
        Paper newpp = new Paper(code, name, nxb, taiBan);
        listP.add(newpp);
        System.out.println("Ban da them paper moi thanh cong.");
        System.out.println("");
    }
    
    public void displayGiaoVien() {
        if (listGV.isEmpty()) {
            System.out.println("Khong co ai trong danh sach giao vien.");
        } else {
            for (Teacher danhSach : listGV) {
                System.out.println(danhSach);
            }
        }
    }
    
    public void displayHocSinh() {
        if (listHS.isEmpty()) {
            System.out.println("Khong co ai trong danh sach hoc sinh.");
        } else {
            for (Student danhSach : listHS) {
                System.out.println(danhSach);
            }
        }
    }
    
    public void displayBook() {
        if (listS.isEmpty()) {
            System.out.println("Khong co book nao trong thu vien.");
        } else {
            for (Book list : listS) {
                System.out.println(list);
            }
        }
    }
    
    public void displayPaper() {
        if (listP.isEmpty()) {
            System.out.println("Khong co paper nao trong thu vien");
        } else {
            for (Paper list : listP) {
                System.out.println(list);                
            }
        }
    }
}
    
    

