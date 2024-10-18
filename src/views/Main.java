package views;

import javafx.scene.paint.Material;
import model.CrispyFlour;
import model.Materia;
import model.Meat;
import controller.MateriaManage;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Materia[] materias = new Materia[10];
        materias[0] = new CrispyFlour("232",
                "Bột chiên gà giòn Miwon",
                LocalDate.of(2024, 11, 1),
                50000,
                20);
        materias[1] = new CrispyFlour("346",
                "Bột chiên gà giòn Ottogi",
                LocalDate.of(2025, 3, 1),
                135000,
                12);
        materias[2] = new CrispyFlour("346",
                "Bột tẩm khô chiên giòn CJ CheilJedang Corporation",
                LocalDate.of(2025, 2, 11),
                134000,
                4);
        materias[3] = new CrispyFlour("346",
                "Bột chiên giòn CJ Foods",
                LocalDate.of(2025, 1, 24),
                25000,
                6);
        materias[4] = new CrispyFlour("346",
                "Bột chiên gà rán Hàn Quốc Beksul",
                LocalDate.of(2025, 1, 23),
                68000,
                12
                );
        materias[5] = new Meat("32",
                "Thịt Mực",
                LocalDate.of(2025, 6, 24),
                321000,
                325
        );
        materias[6] = new Meat("623",
                "Thịt Lợn",
                LocalDate.of(2025, 1, 13),
                412000,
                152
        );
        materias[7] = new Meat("22",
                "Thịt Cừu",
                LocalDate.of(2025, 4, 23),
                124000,
                521
        );
        materias[8] = new Meat("63",
                "Thịt Bò",
                LocalDate.of(2025, 2, 15),
                152000,
                124
        );
        materias[9] = new Meat("45",
                "Thịt Cá",
                LocalDate.of(2025, 5, 12),
                212000,
                422
        );

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tong tien cua 10 vat lieu dau tien");
            System.out.println("6. Sắp xếp vật liệu theo giá tăng dần.");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    MateriaManage.addMaterials(materias);
                    break;
                case 2:
                    MateriaManage.editMaterials(materias);
                    break;
                case 3:
                    MateriaManage.deleteMaterials(materias);
                    break;
                case 4:
                    MateriaManage.displayMaterials(materias);
                    break;
                case 5:
                    MateriaManage.sumMaterials(materias);
                    break;
                case 6:
                    MateriaManage.sortMaterials(materias);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        } while (choice != 0);
        scanner.close();
    }

}


