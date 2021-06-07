package chapter5_2;

class Birthday {

    //private 같은 클래스 내에서만 사용 가능하다.
    //public이면 외부 클래스에서 다 갖다 쓸 수 있다.
    //default는 같은 패키지 내에서 사용 가능하다.
    //public, default를 쓰게 되면 birthday.day = 2;로 데이터를 삽입할 수 있다.
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        if (month == 2){
            if (day < 1 || day > 28){
                System.out.println("날짜 오류입니다.");
            }
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {

        this.month = month;
    }

    public int getYear() {
        return year;
    }

    //이 부분이 없다면 read only가 된다.
    /*public void setYear(int year) {
        this.year = year;
    }*/
}

public class BirthDayTest{

    public static void main(String[] args){

        Birthday birthday = new Birthday();
        birthday.setMonth(2);
        //birthday.setYear(2018);
        birthday.setDay(30);
    }

}
