

import java.util.ArrayList;

public class Orders {
    private ArrayList<Positions>setList;
    private Menu m;


    public Orders(Menu p){
        this.m = p;
        setList = new ArrayList<Positions>();
    }

    public void add_Basket(Positions a, int quantity){

        if(a.quantity<quantity){
            System.out.println("nie moge dodac do koszyka nie ma tylu pozycji");
        }

        Positions new_position = new Positions();
        new_position.quantity = quantity;
        a.quantity -= quantity;

        new_position.set = a.set;

        setList.add(new_position);
        System.out.println("dodano do zamowienia");
    }

    public void add_set_position_to_Basket(int position_to_menu, int quantity){
        position_to_menu --;

        if(position_to_menu<1){
            System.out.println("nie ma pozycji o takim numerze");
            return;
        }
        if(m.set_list_size()<=position_to_menu){
            System.out.println("nie ma pozycji o takim numerze");
            return;
        }

        Positions menu_position = m.get_from_setList(position_to_menu);
        if(menu_position.quantity<quantity){
            System.out.println("nie moge dodac do zamowienia "+ quantity+ "w menu jest dostepne tylko" +menu_position.quantity);
            return;
        }

        Positions new_position = new Positions();
        new_position.quantity = quantity;
        new_position.set = menu_position.set;
        setList.add(new_position);
        menu_position.quantity -= quantity;
        System.out.println("dodano do zamowienia");
    }

}
