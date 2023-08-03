package org.example.inMemoryModel;

import org.example.modelElements.Camera;
import org.example.modelElements.Flash;
import org.example.modelElements.Scene;
import org.example.modelElements.PoligonalModel;

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
