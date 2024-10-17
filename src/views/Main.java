package views;

import model.CrispyFlour;
import model.Materia;
import model.Meat;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Materia[] materia = new Materia[10];
        materia[0] = new CrispyFlour("232",
                "Bột chiên gà giòn Miwon",
                LocalDate.of(2024, 11, 1),
                50000,
                20);
        materia[1] = new CrispyFlour("346",
                "Bột chiên gà giòn Ottogi.",
                LocalDate.of(2025, 3, 1),
                13,
                66000);
        materia[2] = new CrispyFlour("346",
                "Bột tẩm khô chiên giòn CJ CheilJedang Corporation..",
                LocalDate.of(2025, 2, 11),
                6,
                120000);
        materia[3] = new CrispyFlour("346",
                "Bột chiên giòn CJ Foods..",
                LocalDate.of(2025, 1, 24),
                6,
                25000);
        materia[4] = new CrispyFlour("346",
                "Bột chiên gà rán Hàn Quốc Beksul.",
                LocalDate.of(2025, 1, 23),
                12,
                68000);
        materia[5] = new Meat("32",
                "Mực",
                LocalDate.of(2025, 6, 24),
                321000,
                325
                );
        materia[6] = new Meat("623",
                "Lợn",
                LocalDate.of(2025, 1, 13),
                412000,
                152
        );
        materia[7] = new Meat("22",
                "Cừu",
                LocalDate.of(2025, 4, 23),
                124000,
                521
        );
        materia[8] = new Meat("63",
                "Bò",
                LocalDate.of(2025, 2, 15),
                152000,
                124
        );
        materia[9] = new Meat("45",
                "Cá",
                LocalDate.of(2025, 5, 12),
                212000,
                422
        );
        materia[10] = new Meat("545",
                "Tôm",
                LocalDate.of(2025, 4, 21),
                263000,
                421
        );

        manager.addMaterial(mat1);
        manager.addMaterial(mat2);

        // Hiển thị danh sách vật liệu
        manager.displayMaterials();

        // Cập nhật vật liệu
        manager.updateMaterial("1", "Cement (Updated)", 150.0);

        // Xóa vật liệu
        manager.removeMaterial("2");

        // Hiển thị danh sách vật liệu sau khi cập nhật và xóa
        manager.displayMaterials();
    }





    }



    }