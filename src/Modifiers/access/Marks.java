package Modifiers.access;

//class modifier --> public
public class Marks {
    /* private attribute access modifier */
    private int tamil;
    private int english;
    private int maths;
    private int science;
    private int socialScience;

    /* public constructor access modifier */
    public Marks(int tamil, int english, int maths, int science, int socialScience) {
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.socialScience = socialScience;
    }

    /* protected method access modifier */
    protected Integer getTotalMarks() {
        return tamil + english + maths + science + socialScience;
    }

    /* default method access modifier */
    Integer getMarksBySubject(String subject) {
        int mark = 0;
        switch (subject){
            case "tamil":
                mark = tamil;
                break;
            case "english":
                mark = english;
                break;
            case "maths":
                mark = maths;
                break;
            case "science":
                mark = science;
                break;
                case "socialScience":
                mark = socialScience;
                break;
            default:
                return mark;
        }
        return mark;
    }

}
