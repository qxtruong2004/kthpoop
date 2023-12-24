package javaapplication23;
public class parttimeemployee extends Person {
    private int giolam;

    public parttimeemployee() {
    }

    public parttimeemployee(int giolam, String name, int age, String gender) throws Exception {
        super(name, age, gender);
        if(giolam < 0) throw new Exception("Thoi gian khong duoc am!");
        else
        this.giolam = giolam;
    }

    public int getGiolam() {
        return giolam;
    }

    public void setGiolam(int giolam) {
        this.giolam = giolam;
    }

    @Override
    public String toString() {
        return super.toString() + "\nparttimeemployee{" + "giolam=" + giolam + '}';
    }
    @Override
    public void nhap(){
        try{
        super.nhap();
        System.out.println("Nhap so gio lam: ");
        giolam  = sn.nextInt();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void display(){
        super.display();
        System.out.println("So gio lam: " + giolam);
    }
}
