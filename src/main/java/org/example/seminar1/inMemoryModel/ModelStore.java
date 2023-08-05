package org.example.seminar1.inMemoryModel;

import org.example.seminar1.modelElements.Camera;
import org.example.seminar1.modelElements.Flash;
import org.example.seminar1.modelElements.Scene;
import org.example.seminar1.modelElements.PoligonalModel;

public class ModelStore implements IModelChanger, IModelCahangedObserver {

    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelCahangedObserver changeObservers;
    public Scene getScene(int id){
        Scene scene = new Scene();
        return scene;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
