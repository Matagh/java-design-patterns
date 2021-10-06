package fr.diginamic.tp_strategy;


public class StrategyFactory {
    public enum SortType { Bubble, Insertion, Selection }
    public static Strategy getSortAlgorithm(SortType type){
         if(type == SortType.Bubble)
             return new BubbleSort();
         else if(type == SortType.Insertion)
             return new InsertionSort();
         else if(type == SortType.Selection)
             return new SelectionSort();

         return null;
    }

}
