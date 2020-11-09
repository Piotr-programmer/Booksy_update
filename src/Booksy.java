public class Booksy {

    public static void main(String[]args){

        Menu menu = new Menu();
        Set set1 = new Set("Zestaw Nuggets", 15);
        Set set2 = new Set("Zestaw Wings", 17);
        Set set3 = new Set("Zestaw Nachos", 10);

        menu.add_Menu(set1, 1000);
        menu.add_Menu(set2, 1000);
        menu.add_Menu(set3, 1000);


        Orders order1 = new Orders(menu);

        Positions position_to_add_to_order = menu.find_by_name("Zestaw Wings");
        if(null != position_to_add_to_order){
            System.out.println(position_to_add_to_order.set.getName());
            order1.add_Basket(position_to_add_to_order, 2);
            order1.add_Basket(position_to_add_to_order, 25);
            order1.add_Basket(position_to_add_to_order, 25);

        }else {
            System.out.println("nie znaleziono takiego zestawu");
        }



    }
}
