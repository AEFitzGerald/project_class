public class Project {
    //member variables
    private String name;
    private String description;

    
    //constructor
    public Project(String nameInput, String descriptionInput){
        this.name = nameInput;
        this.description = descriptionInput;
    }

    //setting name to value from name parameter
    public Project(String nameInput) {
        this.name = nameInput;
    }

    //getter
    public String getName(){
        return this.name;
    }

    //constructor alternative
    public Project() {
        this.name = "Reforestation App";
        this.description = "Game theory reward system for citizen science tree project.";
    }

    public String elevatorPitch(){
        return String.format("My project is titled: %s.\nBrief description: %s", name, description);
    }
}

     //getter all the information about the project
    // public String getProject(){
    //     String projectInfo = String.format("Title: %s. \n Description: %s", this.name,this.description);
    //     return projectInfo;
    // }

    //getter total count projects
//     public static int getTotalProjects() {
//         return totalProjects;
//     }

// }