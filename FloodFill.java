import java.util.Scanner;

public class FloodFill {


    public static void main(String[] args){
        Scanner inputRead = new Scanner(System.in);
        Integer entryCount = inputRead.nextInt();
        //Integer[] inputArray = new Integer[entryCount];

        for (int k=0;k<entryCount;k++){
            Integer rowCount = inputRead.nextInt();
            Integer colCount = inputRead.nextInt();
            Integer[][] floodArray = new Integer[rowCount][colCount];

            for (int i=0;i<rowCount;i++)
                for (int j=0;j<colCount;j++)
                    floodArray[i][j] = inputRead.nextInt();

            Integer rowElement = inputRead.nextInt();
            Integer colElement = inputRead.nextInt();
            Integer newElement = inputRead.nextInt();
            Integer oldElement = floodArray[rowElement][colElement];


            floodFill(floodArray, rowElement, colElement, oldElement, newElement, rowCount, colCount);
            for (int i=0;i<rowCount;i++)
                for (int j=0;j<colCount;j++)
                    System.out.print(floodArray[i][j]+" ");
            System.out.println();
        }
    }

    public static void floodFill (Integer[][] floodArr, Integer rowIndex, Integer colIndex, Integer oldVal, Integer newVal, Integer rowMax, Integer colMax){
        if (floodArr[rowIndex][colIndex]==oldVal){
            floodArr[rowIndex][colIndex]=newVal;
            if(colIndex-1>=0) floodFill(floodArr,rowIndex,colIndex-1,oldVal,newVal,rowMax,colMax);
            if(colIndex+1<colMax) floodFill(floodArr,rowIndex,colIndex+1,oldVal,newVal,rowMax,colMax);
            if(rowIndex-1>=0) floodFill(floodArr,rowIndex-1,colIndex,oldVal,newVal,rowMax,colMax);
            if(rowIndex+1<rowMax) floodFill(floodArr,rowIndex+1,colIndex,oldVal,newVal,rowMax,colMax);
        }
        return;
    }
}
