package abc.sport;

public class TextGrade {
    public static void main(String[] args) {
        int x = 55;
        String result = textGrade(x);
        System.out.println(result);
    }
    static String textGrade(int grade) {
        String text;
        if (grade == 0) {
            text = "не оценено";
        } else {
            if (grade > 0 && grade < 21) {
                text = "очень плохо";
            } else {
                if (grade > 20 && grade < 41) {
                    text = "плохо";
                } else {
                    if (grade > 40 && grade < 61) {
                        text = "удовлетворительно";
                    } else {
                        if (grade > 60 && grade < 81) {
                            text = "хорошо";
                        } else {
                            if (grade > 80 && grade < 101) {
                                text = "отлично";
                            } else {
                                text = "не определено";
                            }
                        }
                    }
                }
            }
        }
        return text;
    }

}