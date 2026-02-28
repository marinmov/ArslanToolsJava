package daytimearslan;
/*Autor: Arslan Marinmov */
public class DayArslan{
    private String month;
    private int day, year, monthNumber;
    private int currentYear = 2026;
    //private static final int slashNumericFormat = 1;
    //private static final int textFormat = 2;

    public Day(int dd, int mm, int yyyy){
        this.day = dd;
        this.monthNumber = mm;
        this.year = yyyy;
        switch(monthNumber){
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
        }
    }
    public Day(){}

    public boolean isValidDay(int dd, int mm, int yyyy){
        if(yyyy >= 1960 && yyyy < this.currentYear){
            if(yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0){
            if(mm >= 1 && mm <= 12){
                if(mm == 2){
                    if(dd >= 1 && dd <= 29){
                        return true;
                    } else { return false;}
                } else if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){
                    if(dd >= 1 && dd <= 31){
                        return true;
                    } else { return false;}
                } else {
                    if(dd >= 1 && dd <= 30){
                        return true;
                    } else { return false;}
                }
            } else { return false;}
        } else {
            if(mm >= 1 && mm <= 12){
                if(mm == 2){
                    if(dd >= 1 && dd <= 28){
                        return true;
                    } else { return false;}
                } else if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){
                    if(dd >= 1 && dd <= 31){
                        return true;
                    } else { return false;}
                } else {
                    if(dd >= 1 && dd <= 30){
                        return true;
                    } else { return false;}
                }
            } else { return false;}
        }
        }
    }

    public String getStringDate(int typeOfFormat){
        String date, days, months, years;
        switch(typeOfFormat){
            case 1: 
                if(this.day < 10){
                    days = "0" + this.day; 
                } else{ days = this.day;}
                if(this.monthNumber < 10){
                    months = "0" + this.monthNumber;
                } else{ months = this.monthNumber;}
                years = this.year;
                date = days + "/" + months + "/"+ years; break;
            case 2:
                days = this.day; months = this.month; years = this.year;
                date = months + " " + days + ", " + years; break;
        }
    }

    public int slashNumericFormat(){return 1;}
    public int textFormat(){return 2;}
}