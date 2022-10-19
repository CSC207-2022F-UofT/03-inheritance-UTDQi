/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {


    private String color;


    private int numberOfContents;


    private int capacity;
    private String contents[];





    public Bag(String color,int capacity){
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }




    public String getColor() {
        return color;
    }
    public int getNumberOfContents() {
        return numberOfContents;
    }
    public int getCapacity() {
        return capacity;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public boolean addItem(String item){
        if(numberOfContents<capacity){
            contents[numberOfContents] = item;
            numberOfContents++;
            return true;
        }else{
            return false;
        }
    }



    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return
     */

    public String popItem(){
        if(numberOfContents == 0){
            return null;
        }else{
            String item = contents[numberOfContents-1];
            contents[numberOfContents-1] = "";
            numberOfContents--;
            return item;
        }
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;
        String newContents[] = new String[capacity];
        for(int i=0;i<numberOfContents;i++){
            newContents[i] = contents[i];
        }
        this.contents = newContents;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}
