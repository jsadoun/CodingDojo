public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Project2");
        Project project3 = new Project("Project3", "This is project three.", 99.99);
        project3.elevatorPitch();
        project2.setDescription("this is project 2.");
        project1.setInfo("Project1", "This is project 1.");
        project1.elevatorPitch();
        project2.elevatorPitch();
        project1.getName();
        project2.getDescription();

        Portfolio portfolio = new Portfolio(); //creates the "portfolio" object

        portfolio.addProject(project1);
        portfolio.addProject(project2);
        portfolio.addProject(project3);

        portfolio.showPortfolio();
    }
}


