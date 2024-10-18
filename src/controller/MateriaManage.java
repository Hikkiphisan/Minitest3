package controller;

import javafx.scene.paint.Material;
import model.Materia;
import model.CrispyFlour;
import model.Meat;

public class MateriaManage {
    public static void displayMaterials(Materia[] materias) {
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < 11; i++) {
            System.out.println(materias[i]);
        }
    }
}
