package sg.edu.np.mad.madpractical4;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;
    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    public String getName() { return this.name; }
    public int getId() { return this.id; }
    public String getDescription() { return this.description; }
    public Boolean getFollowed() { return this.followed; }

    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setDescription(String description) { this.description = description; }
    public void setFollowed(Boolean followed) { this.followed = followed; }
    public void toggleFollow() {
        if (this.followed) {
            this.followed = false;
        } else {
            this.followed = true;
        }
    }
}
