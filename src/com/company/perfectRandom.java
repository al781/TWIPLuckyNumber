package com.company;

public class perfectRandom
    {
        public String name;
        public int luckyNumber;
        public perfectRandom(String n)
            {
                name = n;
                int randNumber = (int)(Math.random()*30);
                luckyNumber = randNumber * randNumber;
            }
        public int getLuckyNumber()
            {
                return luckyNumber;
            }
        public String getName()
            {
                return name;
            }
    }
