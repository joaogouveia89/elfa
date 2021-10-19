public static int alphabetIndex(char c){
    int charInt = c;
    if(charInt > 96 && charInt < 123){
        return charInt - 97;
    }else if(charInt > 64 && charInt < 91){
        return charInt - 65;
    }else{
        return -1;
    }
}