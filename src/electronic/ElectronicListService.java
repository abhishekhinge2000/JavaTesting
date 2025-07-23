package electronic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        if(electronicsItems != null && !electronicsItems.isEmpty()){
            String[] items = electronicsItems.split(",");
            Set<String> uniqueItems = new LinkedHashSet<>(); //Maintain insertion order, remove duplicate
            for(String item : items){
                uniqueItems.add(item.trim()); //trim to avoid leading/training space
            }
            itemList.addAll(uniqueItems);
        }
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
       if(itemList != null && searchItem != null){
           return itemList.indexOf(searchItem);
       }
        return -1;
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;
        if(itemList != null && removeItem != null){
            Iterator<String> iterator = itemList.iterator();
            while(iterator.hasNext()){
                String currentItem = iterator.next();
                if(currentItem.equals(removeItem)){
                    iterator.remove();
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }


}

