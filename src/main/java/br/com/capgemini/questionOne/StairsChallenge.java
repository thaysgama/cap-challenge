package br.com.capgemini.questionOne;

public class StairsChallenge {

    public String stairsBuilder(final int size){
        StringBuilder stairs = new StringBuilder();
        String space = " ";
        String star= "*";
        int tempCounter = size;
        for (int i = 1; i < size; i++) {
            tempCounter--;
            stairs.append(space.repeat(tempCounter)).append(star.repeat(i)).append("\n");
        }
        return stairs+star.repeat(size);
    }

}
