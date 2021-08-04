public class ProjectTest {
    public static void main(String[] args){
        System.out.println("Main Entry for Projects");
        Project project1 = new Project();

        Project project2 = new Project("Map Finder", "Find food forests and contribute help out with them.");

        Project project3 = new Project("Tree Honor", "Contribute stories about trees.");

        Project newProjectTitle = new Project("Opportunity Starter App");
        String name = newProjectTitle.getName();

        System.out.println(project1.elevatorPitch()); 
        System.out.println("The new project is titled: " + name);
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());      
    }
}