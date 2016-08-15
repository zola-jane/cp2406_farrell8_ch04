/*
 * Created by Zola on 15/08/2016.
 */
public class FormLetterWriter
{
    public static void main(String[] args)
    {
        displaySalutation("Jones");
        displayEndSentence();
        displaySalutation("Rick", "Sanchez");
        displayEndSentence();
    }

    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
    }

    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }

    public static void displayEndSentence()
    {
        System.out.println("Thank you for your recent order.");
    }
}
