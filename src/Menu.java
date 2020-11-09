
import java.util.ArrayList;

public class Menu {

    private ArrayList<Positions>set_list;

    public Menu(){
        set_list = new ArrayList<>();
    }

    public int set_list_size(){
        return set_list_size();
    }

    public Positions get_from_setList(int index){
        if(index>=set_list_size()){
            System.out.println("nie ma tylu pozycji");
            return null;
        }
        return set_list.get(index);

    }

    public void add_Menu(Set a, int quantity ){
        Positions new_position = new Positions();
        new_position.set = a;
        new_position.quantity = quantity;

        set_list.add(new_position);

        System.out.println("dodano do Menu");
    }

    public Positions find_by_name(String name_to_find){
        for(Positions pos_to_find: set_list){
            if(pos_to_find.set.getName()==name_to_find){
                return pos_to_find;
            }
        }
        return null;
    }
}
