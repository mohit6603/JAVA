public class Stringarraykey{

    public static int mennu(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[]={"dosa","idli","wada","imli"};
        String key ="idli";

        int index = mennu(menu,key);
        if (index == -1) {
            System.out.println("index not found");
            
        } else {
            System.out.println("menu in at index : "+ index);
        }


    }
    
}
