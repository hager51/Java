import java.util.*;
  
public class SimpleWordDictionary 
{
        public static void printAll(Map<String, List<String>> m) 
        {
                m.entrySet().forEach(entry -> 
                {
                                    System.out.println(entry.getKey() + " = " + entry.getValue());
                });
        }

        public static void printOne(Map<String, List<String>> m, String c) 
        {
                System.out.println("\n" + c + " = " + m.get(c));
        }

        public static void main(String args[])
        {
                String WordsArray[] = {"Apple", "Data", "Branch", "Ai", "Chine", "Admin", "Every", 
                                                        "Bee", "Car", "Bus", "Cook", "Dream", "Zoo", "Yellow", "File",
                                                        "Red", "Green", "Great", "Push", "Open", "Close", "Prepare",
                                                        "Hall", "Ball", "World", "Large", "Wide", "Web", "Internet", 
                                                        "Next", "Quiet", "Quality", "Rise", "Remove", "Small", "Sun", 
                                                        "Word", "Fun", "Leave", "Moon", "Mother", "Marine", "Nice",
                                                        "Hello", "Pizza", "Egg", "Fish", "Energy", "End", "Start", "Xray",
                                                        "View", "Finish", "Very", "Xylophone", "Xo", "Yield", "Zero",
                                                        "Gas", "Happy", "Sad", "Summer", "In", "Out", "Illigal", "Issue",
                                                        "Journey", "Look", "Jacket", "Jump", "Key", "Lion", "Know", 
                                                        "Kind", "Keep", "Now", "Observe", "Prepare", "Queen", "Table",
                                                        "Target", "Time", "Test", "Input", "Output", "Untill", "Unit", 
                                                        "Us", "Value", "Yard", "Zoom"};

                Arrays.sort(WordsArray);

                List<String> WordsList = new ArrayList<String>(Arrays.asList(WordsArray));
        
                Map<String, List<String>> map = new HashMap<String, List<String>>();
                for(String word: WordsList)
                {
                        String firstChar = String.valueOf(word.charAt(0));
                        if (map.get(firstChar) == null)
                        {
                                map.put(firstChar, new ArrayList<String>(Arrays.asList(word)));
                        }
                        else
                        {
                                map.get(firstChar).add(word);
                        }
                }
                printAll(map);
                printOne(map, "A");
        }
}