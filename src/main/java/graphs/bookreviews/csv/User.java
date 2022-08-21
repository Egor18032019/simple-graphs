package graphs.bookreviews.csv;

public class User {
    String userId;
    String location;
    Integer age;

    public User(String userId, String location, Integer age) {
        this.userId= userId;
        this.location= location;
        this.age= age;
    }

    public String getUserId() {
        return userId;
    }

    public String getLocation() {
        return location;
    }

    public Integer getAge() {
        return age;
    }
}
