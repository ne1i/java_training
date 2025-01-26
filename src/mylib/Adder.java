package mylib;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Adder extends Operator {
    public static int idCounter = 0;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private ArrayList<Integer> nombres;

    public Adder() {
        id = idCounter++;
        nombres = new ArrayList<Integer>();
    }

    public void ajouterNombre(int n) {
        this.nombres.add(n);
    }

    public void viderNombres() {
        this.nombres.clear();
    }

    public int afficherTotal() {
        return this.nombres.stream().reduce((a, b) -> {
            return a + b;
        }).orElse(0);
    }

    public String renvoieNombres() {
        return this.nombres
                .stream()
                .map((i) -> i.toString())
                .collect(Collectors.joining(", "));
    }

    public static int getMagic() {
        return 6739;
    }

    @Override
    public String operatorName() {
        return this.getClass().getName();
    }

}
