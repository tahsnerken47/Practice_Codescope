package code_challenge.collection;

import java.util.ArrayList;

/*
 * Create a method will take an Integer ArrayList and remove any duplicates values.
 *  Return an ArrayList of unique elements.
 *  -> 1, 2, 3, 2, 2, 1, 4
 *  -> 1, 2, 3, 4
 *
 *  list: 1, 2, 3
 */
public class Duplicates {
    public static void main(String[] args) {

    }




        public static ArrayList<Integer> removeDup(ArrayList<Integer> nums) {

            ArrayList<Integer> uniqueValues = new ArrayList<>(); // store in collection interface

            for(Integer each : nums){
                if( !uniqueValues.contains(each)){
                    uniqueValues.add(each);
                }
            }
            return uniqueValues;





        }








    }


