
package javaapplication23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
    Scanner sn = new Scanner (System.in);
    ArrayList <Employee> e = new ArrayList<>();
    ArrayList <parttimeemployee> p = new ArrayList<>();
    int result;
    do{
        int choice;
            System.out.println("******Danh sach quan ly****");
            System.out.println("1. Them employee");
            System.out.println("2. Them partimeemployee");
            System.out.println("3. Hien thi");
            System.out.println("4. Tim kiem nhaan vien theo ten");
            System.out.println("5. Xoa nhan vien theo gioi tinh");
            System.out.println("6. Sua thong tin theo ten");
            System.out.println("7. Sap xep employee theo tuoi tang dan");
            System.out.println("Moi nhap su lua chon cua  ban: ");
           
            choice = sn.nextInt();
            switch (choice){
                case 1:                 
                    System.out.println("ADD EMPLOYEE");
                    Employee e1 = new Employee();
                    try{
                    e1.nhap();
                    e.add(e1);                          
                    }
                    catch (Exception e8){
                        System.out.println(e8.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("ADD EMPLOYEEPARTTIME");
                    parttimeemployee p1 = new parttimeemployee();
                    p1.nhap();
                    p.add(p1);
                    break;
                case 3:
                    System.out.println("HIEN  THI");
                    System.out.println("Danh sach employee");
                    for( Employee e2 : e){
                        e2.display();
                        System.out.println("*******");
                    }
                    System.out.println("Danh sach partime");
                    for(parttimeemployee p2 : p){
                        p2.display();
                        System.out.println("********");
                    }
                    break;
                case 4:
                    System.out.println("Tim kiem nhan  vien theo ten");
                    String findname;
                    System.out.println("Nhap ten can tim kiem: ");
                    sn.nextLine();
                    findname = sn.nextLine();
                    int d = 0;
                    for(Employee e3: e){
                        if(findname.equals(e3.getName())){
                            e3.display();
                            d++;
                        }
                    }
                    for(parttimeemployee p3 : p){
                        if(findname.equals(p3.getName())){
                            p3.display();
                            d++;
                        }
                    }
                    if(d == 0) System.out.println("Khong co nhan vien nao co ten nhu vay");
                    break;
                case 5:
                    System.out.println("XOA BY GEnder");
                    String findgender;
                    System.out.println("Nhap gender can xoa");
                    sn.nextLine();
                    findgender =  sn.nextLine();
                    int d1 =  0;
                    ArrayList <Employee> e5 = new ArrayList<>();
                    ArrayList <parttimeemployee> p5 = new ArrayList<>();
                    for(Employee e3: e){
                        if(findgender.equals(e3.getGender())){
                            e5.add(e3);
                            d1++;
                        }
                    }
                    for(parttimeemployee p3 : p){
                        if(findgender.equals(p3.getGender())){
                            p5.add(p3);
                            d1++;
                        }
                    }
                    
                    if(d1 == 0) System.out.println("Khong co de ma xoa");
                    else{
                        System.out.println("Xoa thanh cong");
                        e.removeAll(e5);
                        p.removeAll(p5);
                    }
                    break;
                case 6:
                    System.out.println("Cap nhat thong tin");
                    System.out.println("Nhap ten cua nguoi can sua: ");
                    sn.nextLine();
                    String repairname = sn.nextLine();
                    int d2 = 0;
                    for(Employee e6 : e){
                        if(repairname.equals(e6.getName())){
                            d2++;
                            try{
                            e6.nhap();
                            } catch(Exception e8){
                                System.out.println(e8.getMessage());
                            }
                        }
                    }
                    if(d2 == 0) System.out.println("Khong co nguoi nao co ten nhu vay");
                    break;
                case 7:
                    System.out.println("SAP XEP THEO TUOI");
                    Comparator <Employee> sortagem = new Comparator<Employee>(){
                        @Override
                        public int compare(Employee o1, Employee o2){
                            return Integer.compare(o1.getAge(),  o2.getAge());
                        }    
                };
                    Collections.sort(e, sortagem);
                    break;
                default: System.out.println("NPOOOOOO");
            }
            System.out.println("Nhap 0 neu ban muon thoat ra: ");
            result = sn.nextInt();
    }
    while (result != 0);
}
}
