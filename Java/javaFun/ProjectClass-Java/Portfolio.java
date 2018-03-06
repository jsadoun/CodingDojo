import java.util.ArrayList;

public class Portfolio{
    private ArrayList<Project> newFolio = new ArrayList<>();
    
    public Portfolio(){  
    }

    public void addProject(Project project){
        newFolio.add(project);
    }

    public void showPortfolio(){
        for(int i = 0; i < newFolio.size(); i++){
            newFolio.get(i).elevatorPitch();
        }
    }
}
