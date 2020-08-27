public class Equipment {
    String id;
    String description;
    public Equipment(String id, String desc){
        this.id = id;
        this.description = desc;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return description;
    }
}
