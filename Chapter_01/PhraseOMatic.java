public class PhraseOMatic {
    public static void main(String[] args) {
        
        // make three sets of words to choose from
        String[] wordlistOne = {
            "agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive",  "agent based", "functional", "AI enabled", "strongly typed"  
        };

        String[] wordlistTwo = {
            "loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT",  "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"  
        };

        String[] wordlistThree = {
            "framework", "library", "DSL", "REST API", "repository", "pipeline",  "service mesh", "architecture", "perspective", "design", "orientation"  
        };

        // fins out how many words are in each list
        int oneLength = wordlistOne.length;
        int twoLength = wordlistTwo.length;
        int threeLength = wordlistThree.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // now build a phrase
        String phrase = wordlistOne[rand1] + " " + wordlistTwo[rand2] + " " + wordlistThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}