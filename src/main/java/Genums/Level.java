package Genums;

public enum Level {
    LOW(1), MEDIUM(2), HIGH(3);


public int severity;

Level(int severity){
    this.severity = severity;
}

public int getSeverity(){
    return severity;
}

}



