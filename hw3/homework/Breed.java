package homework;

public enum Breed {
    DACHSHUND ("dachshund"),
    ZWERGPINSCHER ("zwergpinscher"),
    POODLE ("poodle");
    private String displayName;
    Breed(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName (){
        return displayName;
    }
}
