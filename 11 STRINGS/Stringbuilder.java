public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char  ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
    }
} 


//sb.append(i) = values ko loop ke operation k hisab se value allocate kar raha hai
