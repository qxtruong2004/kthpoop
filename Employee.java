package javaapplication23;
public class Employee extends Person{
    private String address;
    private String ngaysinh;

    public Employee() {
    }

    public Employee(String address, String ngaysinh, String name, int age, String gender) throws Exception {
        super(name, age, gender);
        this.address = address;
        this.ngaysinh = ngaysinh;
    }

    public String getAddress() {
        return address;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    @Override
    public void nhap() throws Exception{
        super.nhap();
        System.out.println("Nhap que quan");
        address = sn.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = sn.nextLine();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Que Quan: " + address);
        System.out.println("Ngay sinh: " + ngaysinh);
    }
    @Override
    public String toString() {
        return super.toString() + "\nEmployee{" + "address=" + address + ", ngaysinh=" + ngaysinh + '}';
    }   
}
