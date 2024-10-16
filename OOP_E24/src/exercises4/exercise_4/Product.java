package exercise_4;

import java.time.LocalDate;

public interface Product {
    String get_name();
    double get_price();
    int get_slot();
    int get_stock();
    void set_stock(int stock);
    void buy();
    LocalDate get_expDate();
}