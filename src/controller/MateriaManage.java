package controller;

import javafx.scene.paint.Material;
import model.Materia;
import model.CrispyFlour;
import model.Meat;

import java.time.LocalDate;
import java.util.Scanner;

public class MateriaManage {
    public static void addMaterials(Materia[] materias) {
        for (int i = 0; i < materias.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập thông tin cho vật liệu thứ " + (i + 1) + ":");
            System.out.print("Nhập ID: ");
            String id = scanner.nextLine();

            System.out.print("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();

            System.out.print("Nhập ngày sản xuất: ");
            LocalDate manufacturingDate = LocalDate.parse(scanner.nextLine());

            System.out.print("Nhập giá: ");
            int cost = scanner.nextInt();

            System.out.print("Sản phẩm là bột hay thịt? ");
            String meat_or_flour = scanner.nextLine();
            if (meat_or_flour == "meat") {
                System.out.print("Nhập cân nặng: ");
                double weight = scanner.nextDouble();
                materias[i] = new Meat(id, name, manufacturingDate, cost, weight);
            } else if (meat_or_flour == "flour") {
                System.out.print("Nhập số lượng: ");
                int quantity = scanner.nextInt();
                materias[i] = new CrispyFlour(id, name, manufacturingDate, cost, quantity);
            }
            System.out.println("Da them vat lieu" + materias[i].getName() + "vao gio hang!!");
            break;
        }
    }
    public static void editMaterials(Materia[] materias) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập index of sản phẩm cần sửa: ");
        int input_index = scanner.nextInt();
        for (int i = 0; i < materias.length; i++) {
            if (input_index == i) {
                System.out.print("Nhập tên mới: ");
                materias[i].setName(scanner.nextLine());

                System.out.print("Nhập ngày sản xuất mới: ");
                materias[i].setManufacturingDate(LocalDate.parse(scanner.nextLine()));
                System.out.print("Nhập giá mới: ");
                materias[i].setCost(scanner.nextInt());
            }
            System.out.println("Sửa sản phẩm thành công.");
        }

    }
    public static void displayMaterials(Materia[] materias) {
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Số thứ tự thứ " + i + " là món " + materias[i].getName());
        }
    }
    public static void sumMaterials(Materia[] materias) {
        double sum = 0;
        for (int i = 0; i < 10 ; i++) {
            sum += materias[i].getAmount();
        }
                System.out.printf("Tổng tiền 10 vật liệu đầu tiên khi chưa thêm vật liệu mới vào là %,.0f đồng %n", sum);

    }

    public static void sortMaterials(Materia[] materias){
        System.out.println("Sắp xếp vật liệu theo giá tăng dần.");
        for (int i = 0; i < materias.length - 1; i++) {
            for (int j = materias.length - 1; j > i; j--) {
                if (materias[i] instanceof CrispyFlour ||
                        materias[j] instanceof Meat) {
                    if (materias[j].getCost() < materias[j - 1].getCost()) {
                        Materia temp = materias[i];
                        materias[i] = materias[j];
                        materias[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] instanceof CrispyFlour ||
                    materias[i] instanceof Meat) {
                System.out.println(materias[i].getName() + " với giá tiền là " + materias[i].getCost() + " đồng." );
            }
        }
    }

    public static void deleteMaterials(Materia[] materias) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập index of sản phẩm cần delete: ");
        int input_index = scanner.nextInt();
        for (int i = 0; i < materias.length; i++) {
            if (input_index == i) {
                materias[i] = null;
                System.out.println("Sản phẩm đã được xóa.");
            }
        }
        for (int i = input_index; i < materias.length - 1; i++) {
            materias[i] = materias[i + 1];
        }
        materias[materias.length - 1] = null;
    }
}
