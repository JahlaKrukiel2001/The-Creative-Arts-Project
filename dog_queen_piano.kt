//Main class to define the Creative Arts project

class CreativeArtsProject {
    private var title: String = ""
    private var description: String = ""
    private var artist: String = ""
    
    //Function to set the title of the project
    fun setTitle(title: String) {
        this.title = title
    }
    
    //Function to get the title of the project
    fun getTitle(): String {
        return title
    }
    
    //Function to set the description of the project
    fun setDescription(description: String) {
        this.description = description
    }
    
    //Function to get the description of the project
    fun getDescription(): String {
        return description
    }
    
    //Function to set the artist of the project
    fun setArtist(artist: String) {
        this.artist = artist
    }
    
    //Function to get the artist of the project
    fun getArtist(): String {
        return artist
    }
    
    //Function to print the project details
    fun printProjectDetails(){
        println("Title: $title")
        println("Description: $description")
        println("Artist: $artist")
        println("")
    }
}

//Main program to test the CreativeArtsProject class
fun main() {
    val projectOne = CreativeArtsProject()
    projectOne.setTitle("My First Creative Arts Project")
    projectOne.setDescription("This is a project I am creating to explore my creative side")
    projectOne.setArtist("James Smith")
    projectOne.printProjectDetails()
    
    val projectTwo = CreativeArtsProject()
    projectTwo.setTitle("My Second Creative Arts Project")
    projectTwo.setDescription("This is a project I am creating to further my creative skills")
    projectTwo.setArtist("Jane Doe")
    projectTwo.printProjectDetails()
}