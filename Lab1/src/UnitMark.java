

public class UnitMark {
    private int mk1 = 0;
    private int mk2 = 0;

    public UnitMark(int mk1, int mk2) {
        this.mk1 = mk1;
        this.mk2 = mk2;
    }

    public double avg() {
        return (this.mk1+this.mk2)/2.0;
    }




    public String calculateUnitClassification() {
        double mark = avg();
            if (mark <= 39) {
                return "Fail";
            } else if(40 <= mark && mark <= 50) {
                return "III";
            } else if (51 <= mark && mark <= 60) {
                return "II(II)";
                } else if (61 <= mark && mark <= 70){
                return "II(1)";
            } else {
                return "I";
            }
    }
}
