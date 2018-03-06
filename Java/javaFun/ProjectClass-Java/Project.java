public class Project {
    private String name;
    private String description; 
    private Double intialCost;

    public Project(){
    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description1, Double cost) {
        this.name = name;
        this.description = description1;
        this.intialCost = cost;
    }

    public void elevatorPitch() {
        String pitch = this.name + ": " + this.description + " at cost $" + this.intialCost;
        System.out.println(pitch);
    }

    //setters
    public void setName(String newName){
        name = newName;
    }
    public void setDescription(String newDescription){
        description = newDescription;
    }
    public void setInfo(String newName, String newDescription){
        name = newName;
        description = newDescription;
    }

    
    //getters
    public String getName(){
        System.out.println(name);
        return name;
    }
    public String getDescription(){
        System.out.println(description);
        return description;
    }    
}


