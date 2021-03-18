/**
 *
 */
package ch27_interpreterpattern.interpreterpatternmusic;

/**
 * @author oliver
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PlayContext context = new PlayContext();
        System.out.println("上海滩：");
        String string = "T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ";
        context.setText(string);
        Expression expression = null;
        try {
            while (context.getText().length() >= 1) {
                String string2 = context.getText().substring(0, 1);
                switch (string2) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "T":
                        expression = new Speed();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        expression = new Note();
                        break;
                }
                expression.interpret(context);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
