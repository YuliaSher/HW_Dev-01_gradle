import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Yuliia", "Sheredeko");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(student);

        System.out.println(json);
    }
}
