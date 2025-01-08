class DotCom
{
    private short [] locations = {2, 3, 4};
    private short numOfHits = 0;

    public String checkHit(String guess)
    {
        int userGuess = Integer.parseInt(guess);
        String result = "miss";

        for (int cell : locations)
            if (userGuess == cell) {
                result = "hit";
                ++numOfHits;
                break;
            }

        if (numOfHits == locations.length)
            result = "kill";

        return result;
    }
}

