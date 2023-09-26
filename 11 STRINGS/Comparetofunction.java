public class Comparetofunction {

    // compareto is used get largest and smallest string
    // LEXICOGRAPHIC used for comparison a<b<c<d<........z
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i =1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){       // > kar dene se smallest print ho jayenga 
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
