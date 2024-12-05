public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"Synergy", "disrupt", "leverage", "paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        for(int i = 0 ; i < sentences.length ; i++){         // Checks every Keyword
            
            String sentence = sentences[i];
           //  System.out.println(i + "********"); for debugging

            for(int j = 0 ; j < keywords.length ; j++){ // Checks a specific keyword for every sentence
            //    System.out.println(j);            also for debugging
                String keyword = keywords[j];

            if(contains(sentence,keyword)){
                System.out.println(sentence);
            }
         }
    }     

    }


    public static boolean contains(String str1, String str2) { // from MyString code which i did  previously.
        // Convert strings to character arrays
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        // If str2 is longer than str1, it cannot be a substring
        if (str2Array.length > str1Array.length) {
            return false;
        }

        // Loop through str1Array to find str2Array
        for (int i = 0; i <= str1Array.length - str2Array.length; i++) {
            int j;
            for (j = 0; j < str2Array.length; j++) {
                if (str1Array[i + j] != str2Array[j]) {
                    break;
                }
            }
            // If we went through the entire str2Array, it means we found a match
            if (j == str2Array.length) {
                return true;
            }
        }

        // No match found
        return false;
    }

}