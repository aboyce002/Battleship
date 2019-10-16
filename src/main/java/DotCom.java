import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    String checkYourself(String guess){
        int index = locationCells.indexOf(guess);
            if(index >= 0){
                locationCells.remove(index);
                if(locationCells.isEmpty())
                    return "Kill!";
                else
                    return "Hit!";
            }
        return "Miss.";
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
