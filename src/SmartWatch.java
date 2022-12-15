import java.util.Scanner;

public class SmartWatch {

    public static class ProjectSmartWatch {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            lineOfEquals();
            System.out.println("Welcome to SmartWatch program!");

            lineOfEquals();
            checkWhoCalled();
            lineOfEquals();
            text("Hello");
            lineOfEquals();
            callChild();


        }

        public static void checkWhoCalled(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the ph# to see if it's in the contact list");
            long number = sc.nextLong();
            long numbersFromContacts[] = {7738072154L, 3128852345L, 2247895678L};

            if(number == numbersFromContacts[0] || number == numbersFromContacts[1] || number == numbersFromContacts[2]){
                System.out.println("This number is in your child's contact book");
            }else{
                System.err.println("Attention! This number is NOT in your child's contact book");
            }
        }
        public static void lineOfEquals(){
            System.out.println("=================================================================");
        }
        public static void text(String message){
            Scanner s = new Scanner(System.in);
            System.out.println("What would you like to send?");
            System.out.println("Text\nEmoji\nVoice message");

            String typeOfMessage = s.nextLine();
            String message1 = "";

            if(typeOfMessage.equalsIgnoreCase("text")){
                System.out.print("Type message: ");
                message = s.nextLine();
                text(message);
            }else if(typeOfMessage.equalsIgnoreCase("emoji")){
                System.out.println("Choose emoji:\nHappy\nSmiley\nSad\nWink");
                message = s.nextLine();
                Emoji(message);
            }else if(typeOfMessage.equalsIgnoreCase("voice message")){
                System.out.println("Recording...");
                message = s.nextLine();
                VoiceMessage(message);
            }
            System.out.println("Message: " + message);
            System.out.println("Sent!");
        }

        public static void Emoji(String emoji){
            String face = "";

            if(emoji.equalsIgnoreCase("Smiley")){
                face = ":)";
            }else if(emoji.equalsIgnoreCase("happy")){
                face = ":D";
            }else if(emoji.equalsIgnoreCase("sad")){
                face = ":(";
            }else if(emoji.equalsIgnoreCase("wink")){
                face = ";)";
            }

            System.out.println("Emoji: " + face);
            System.out.println("Sent!");
        }

        public static void VoiceMessage(String message){
            System.out.println("Voice message: " + message);
            System.out.println("Sent!");
        }

        public static void callChild(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to call your child?");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("yes")){
                System.out.println("Calling....");
            }else{
                System.out.println("Do you want to check his location?");
                String input2 = sc.nextLine();
                if(input2.equalsIgnoreCase("yes")){
                    System.out.println("Your child is at school");
                }else{
                    System.out.println("Thank you for using SmartWatch");
                }
            }


        }


    }

}
