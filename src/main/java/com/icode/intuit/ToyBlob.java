package com.icode.intuit;

/**
 * Created by kerimc on 07.05.2017.
 */
public class ToyBlob <E extends Object> {

    private E[] leftArr;
    private E[] rightArr;
    private int nextLeftIndex;
    private int nextRightIndex;

    public ToyBlob() {
        this.leftArr = (E[])new Object[1];
        this.rightArr = (E[])new Object[1];
    }

    public int size() {
        return nextLeftIndex + nextRightIndex;
    }

    public void add(E newObj) {
        if (this.size() % 2 == 0) {
            this.addLeft(newObj);
        } else {
            this.addRight(newObj);
        }
    }

    private void addLeft(E newObj) {
        this.leftArr[this.nextLeftIndex] = newObj;
        this.nextLeftIndex++;

    }

    private void addRight(E newObj) {
        this.rightArr[this.nextRightIndex] = newObj;
        this.nextRightIndex++;

        if(this.nextRightIndex == this.rightArr.length){
            extendArrays();
        }
    }

    private void extendArrays(){
        //extend arrays
        E[] newLeftArr = (E[]) new Object[2 * this.leftArr.length];
        for (int i = 0; i < leftArr.length; i++) {
            newLeftArr[i] = this.leftArr[i];
        }

        E[] newRightArr = (E[]) new Object[2 * this.rightArr.length];
        for (int i = 0; i < rightArr.length; i++) {
            newRightArr[i] = this.rightArr[i];
        }
        this.leftArr = newLeftArr;
        this.rightArr = newRightArr;
    }

    public void remove() {
        if(this.nextRightIndex == 0) {
            if(this.nextLeftIndex == 0){
                //nothing to remove
                return;
            }else{
                this.nextLeftIndex--;
                this.leftArr[this.nextLeftIndex] = null;
            }
        }else{
            this.nextRightIndex--;
            this.rightArr[this.nextRightIndex] = null;

            E[] newRightArr = (E[]) new Object[this.rightArr.length];
            int shift = 0;
            if(this.nextLeftIndex - this.nextRightIndex > 1){
                this.nextLeftIndex--;
                newRightArr[0] = this.leftArr[this.nextLeftIndex];
                this.leftArr[this.nextLeftIndex] = null;
                shift = 1;
            }

            for (int i = 0; i < this.nextRightIndex; i++) {
                newRightArr[i + shift] = this.rightArr[i];
            }
            this.rightArr = newRightArr;
            this.nextRightIndex += shift;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        boolean addComma = false;
        for(int i = 0; i < this.leftArr.length; i++) {
            E element = this.leftArr[i];
            if(element != null){
                if(addComma){
                    sb.append(", ");
                }else{
                    addComma = true;
                }
                sb.append(element.toString());
            }else{
                break;
            }
        }
        for(int i = 0; i < this.rightArr.length; i++) {
            E element = this.rightArr[i];
            if(element != null){
                sb.append(", ");
                sb.append(element.toString());
            }else{
                break;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

