package inheritance2;

//bu yanlış olan örnek
public class LogManager {
    public void log(int logType){
        if(logType ==1){
            System.out.println("Database loglandı");
        }
        else if(logType==2){
            System.out.println("Dosya loglandı");
        }
        else if(logType==3){
            System.out.println("Email loglandı");
        }
    }
}

//1-database
//2-file
//3-Email