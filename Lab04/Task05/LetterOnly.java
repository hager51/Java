class LetterOnly 
{
     public static void main(String[] args) 
     {
          String str = "fkskfopref";

          if ((str != null) && (str.chars().allMatch(Character::isLetter)))
              System.out.println("String contains only alphabets.");

          else
              System.out.println("String does not contain only alphabets.");
     }
}