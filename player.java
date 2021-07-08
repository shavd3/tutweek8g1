public class player {
    String name;
    int age;
    String type;
    int numberOfWickets;
    int numberOfMatches;
    int totalRuns;
    int highestScore;
    int runsScoredAgainst;
    double battingAverage;
    double bowlingAverage;
    int bestFigures;



    public player(String name, int age, String type, int numberOfWickets, int numberOfMatches, int totalRuns,int highestScore) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.numberOfWickets = numberOfWickets;
        this.numberOfMatches = numberOfMatches;
        this.totalRuns = totalRuns;
        this.highestScore=highestScore;
    }

    // method1
    public double battingAverage(){
        battingAverage=totalRuns/numberOfMatches;
        System.out.println("Batting Average" +battingAverage);
        return battingAverage;


    }

    // method2
    public double bowlingAvg(){
        bowlingAverage=(runsScoredAgainst/numberOfWickets);
        System.out.println("Bowling average is  :"+bowlingAverage);
        return bowlingAverage;
    }

    public void playerDetails(){
        System.out.println("Name of the player :"+name);
        System.out.println("Player age         :"+age);
        System.out.println("Player type        :"+type);
    }

    public void bestPerformances(){

        System.out.println("Player Best Score:" +highestScore);
        System.out.println("Best Figures" + bestFigures);

    }


}
