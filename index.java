class Maths
{
    public String add(String a, String b){
        return a + b;
    }
}
public class index {

    public static void main(String[] args) {
        Maths addMaths = new Maths();
        String result = addMaths.add("Phemine", "Chayuga");
        System.out.println(result);
    }
}