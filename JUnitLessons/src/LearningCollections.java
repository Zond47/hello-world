import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private String email;
    private Integer age;

    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + "{" + this.getName() + "}";
    }
}

public class LearningCollections {
    public static void main(String[] args) {
        List<User> newList = new ArrayList<>();
        boolean isEmpty = newList.isEmpty();
        int listSize = newList.size();
        newList.add(new User("Yurii","shalenik.jurij@gmail.com",19));
        newList.add(new User("Yulia","shalenik.julia@gmail.com",18));
        newList.add(new User("Vladyslav","vladslv.chrnv@gmail.com",20));
        newList.add(new User("Vladyslava","profatilova2002@gmail.com",17));
        listSize = newList.size();
        for(int i =0;i<listSize;i++){
            System.out.println(newList.get(i));
        }
    }
}
