public class FastFoodAndSnack {
    //attributes
    private String name;
    private String foodType;
    private String URL;

    //default constructor
    public FastFoodAndSnack () {
        name = "";
        foodType = "";
        URL = "";
    }

    //non-default constuctor 
    public FastFoodAndSnack (String inputName, String inputFoodType, String inputURL) {
        setName(inputName);
        setFoodType(inputFoodType);
        setURL(inputURL);
    }

    //methods

    //get methods
    public String getName () {
        return name;
    }
    public String getFoodType () {
        return foodType;
    }
    public String getURL () {
        return URL;
    }

    //set methods
    public void setName (String inputName) {
        name = inputName;
    }
    public void setFoodType (String inputFoodType) {
        foodType = inputFoodType;
    }
    public void setURL (String inputURL) {
        URL = inputURL;
    }

    //display method
    public void display () {
        System.out.println("**********");
        System.out.println("Name: " + name);
        System.out.println("Food Type: " + foodType);
        System.out.println("URL: " + URL );
        System.out.println("**********");
    }
}
