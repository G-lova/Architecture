package org.example.inMemoryModel;

public interface IModelCahangedObserver {
    public static void applyUpdateModel(){
        System.out.println("обновление модели");
    };
}
